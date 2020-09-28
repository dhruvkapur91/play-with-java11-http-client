var express = require('express');
var app = express();
var bodyParser = require('body-parser')

var urlEncoder = bodyParser.json({extended : false})

app.post('/',urlEncoder, function(req, res){
   console.log("Received a request");
   console.log(req.body)
   res.send("okay!")
});

app.listen(9999);