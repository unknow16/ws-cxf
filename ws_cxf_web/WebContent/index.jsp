<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./jquery-1.6.2.js"></script>
<script type="text/javascript">

$(function(){
	
	
	


});

function send() {
	var arg = $("#msg").val();
	var data = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://inter.ws_cxf_web/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">'
	 + '<soapenv:Body><q0:sayHi>'
	 + '<arg0>aa</arg0>' 
	 + '</q0:sayHi></soapenv:Body></soapenv:Envelope>';
	 
	 $.ajax({
		url: "http://localhost:8010/ws_cxf_web/services/hi",
		type:"post",
		dataType:"xml",
		data:data,
		contentType:"text/xml;charset=UTF-8",
		success:function(resp){
			alert(resp);
		},
		error:function(){
			alert("error");
		}
	 });
}

</script>

</head>
<body>

<input id="msg" type="text" > <input type="submit" value="发送" onclick="send()">

</body>
</html>