<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application with JSP</title>

    <script>

        var html = "";

        function buttonTest(id) {

            html += "<table>";
            var test = document.getElementById(id).value;

            for (var i = 1; i < 10; i++) {
                html += "<tr><td>" + test + '*' + i + '=' + test * i + "</td></tr>";
                console.log();
            }

            html += "</table>";

            document.getElementById("result_area").innerHTML = html;

            html = "";
        }

    </script>
</head>
<body>

        <%--    https://eugene-kim.tistory.com/71    --%>

        <button id="2" value="2" onclick="buttonTest(this.id)">2단</button>
        <button id="3" value="3" onclick="buttonTest(this.id)">3단</button>
        <button id="4" value="4" onclick="buttonTest(this.id)">4단</button>
        <button id="5" value="5" onclick="buttonTest(this.id)">5단</button>
        <button id="6" value="6" onclick="buttonTest(this.id)">6단</button>
        <button id="7" value="7" onclick="buttonTest(this.id)">7단</button>
        <button id="8" value="8" onclick="buttonTest(this.id)">8단</button>
        <button id="9" value="9" onclick="buttonTest(this.id)">9단</button>

        <br>

        <div id="result_area"></div>
</body>
</html>
