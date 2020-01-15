from flask import Flask, request
import os

app = Flask(__name__)

@app.route('/')
def test():
    return 'Working'

@app.route('/upload',methods=["POST"])
def upload():
	data = request.files.get("upload")
	requests.post("http://localhost/xx/a.php", data={"data":data})
	return "success"

if __name__ == '__main__':
    app.run(host="0.0.0.0",port=6969) 