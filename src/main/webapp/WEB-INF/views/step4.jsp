<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application with JSP</title>

    <script>
        var userinfo = [{"mail_id":"stevelee@steveleejava.com","pw":"1q2w3ezZ!!","use_yn":"y","phone_num":"01077778888","type":"admin","addr":"서울시강남구논현 동","sn7":"9209301"}
            ,{"mail_id":"stevelee@steveleejava.com" ,"pw":"1q2w3ezZ!!","use_yn":"y","phone_num":"01077778888","type":"admin","addr":"서울시강남구논현 동","sn7":"9209301"}
            ,{"mail_id":"stevelee@steveleejava.com","pw":"1q2w3ezZ!!","use_yn":"y","phone_num":"01077778888","type":"admin","addr":"서울시강남구논현 동","sn7":"9209301"}
            ,{"mail_id":"stevelee@steveleejava.com" ,"pw":"1q2w3ezZ!!","use_yn":"y","phone_num":"01077778888","type":"admin","addr":"서울시강남구논현동","sn7":"9209301"} ]

        //ajax 비동기통신 기릿

        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                alert("success");
            }
        };
        xhttp.open("POST", "/step4", true);
        xhttp.setRequestHeader('Content-type', 'application/json');
        xhttp.send(JSON.stringify(userinfo));

    </script>
</head>
<body>

</body>
</html>
