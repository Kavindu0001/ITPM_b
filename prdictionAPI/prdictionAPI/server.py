from flask import Flask, request, jsonify
from flask_cors import CORS
import sys

app = Flask(__name__)
CORS(app)

# Check for required packages
required_packages = ['joblib', 'sklearn']
missing_packages = []

for package in required_packages:
    try:
        __import__(package)
    except ImportError:
        missing_packages.append(package)

if missing_packages:
    print("ERROR: Missing required packages. Please install them using:")
    print(f"python -m pip install {' '.join(missing_packages)}")
    sys.exit(1)

# Import after checking
import joblib

try:
    model = joblib.load('sales_prediction_model.pkl')
    EXPECTED_FEATURES = 12
except Exception as e:
    print(f"ERROR loading model: {str(e)}")
    print("Make sure 'sales_prediction_model.pkl' exists in the current directory")
    print("and that you have scikit-learn installed (python -m pip install scikit-learn)")
    sys.exit(1)

@app.route('/predict', methods=['POST'])
def predict():
    try:

        print("Request data:", request.data)
        
        data = request.get_json()

        if not data or 'sales_data' not in data:
            return jsonify({'error': 'Missing or invalid JSON payload'}), 400

        features = data['sales_data']


        if len(features) != EXPECTED_FEATURES:
            return jsonify({'error': f'Expected {EXPECTED_FEATURES} features, but got {len(features)}'}), 400
        

        prediction = model.predict([features])
        

        return jsonify({'prediction': prediction.tolist()})
    
    except Exception as e:
        return jsonify({'error': str(e)}), 400

if __name__ == '__main__':
    print("Starting predictionAPI server...")
    print("Model loaded successfully")
    print("Server is running at http://0.0.0.0:2002")
    print("Send POST requests to http://localhost:2002/predict with JSON data")
    print("Example: {'sales_data': [value1, value2, ..., value12]}")
    app.run(host='0.0.0.0', port=2002, debug=True)
