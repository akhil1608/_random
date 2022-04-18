function reqListener () {
  console.log(this.responseText);
}

var oReq = new XMLHttpRequest();
oReq.addEventListener("load", reqListener);
oReq.open("GET", "https://3mz10yq012.execute-api.us-east-1.amazonaws.com/items");
oReq.send();