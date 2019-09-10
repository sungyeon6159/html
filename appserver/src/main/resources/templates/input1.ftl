<html xml:lang="ko" lang="ko">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>fever</title>
<head>
    <link type="text/css" href="/semantic/semantic.css" rel="stylesheet" />
    <script>
        function searching() {
            if(document.getElementById("title").value.trim() == ""){
                alert("제목을 입력하세요.");
            }else{
                document.location = '/search?workId=' + document.getElementById("title").value;
            }
        }
    </script>
</head>

<body>
<#include "header.ftl">
<br/>
<br/>
<br/>
<body>
  <div class="ui sidebar inverted vertical menu">
    <a class="item">
      1
    </a>
    <a class="item">
      2
    </a>
    <a class="item">
      3
    </a>
  </div>
  <div class="pusher">
    <!-- Site content !-->
  </div>
</body>
</br>
<br/>
<br/>
작성자: ${nick}
<br/>
스프링으로 만든 작성자: ${nick1}
<br/>
<br/>
</div>

</body>

</html>