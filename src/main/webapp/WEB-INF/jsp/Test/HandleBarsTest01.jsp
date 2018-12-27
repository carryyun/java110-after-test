<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HandleBarsTest01</title>
</head>
<body>
<div>
123
</div>
<div id="targetDiv">

</div>


<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/js/handlebars-v4.0.12.js"></script>

<script id="Test-template" type="text/x-handlebars-template">
  <div class="Test">
    <h1>{{title}}</h1>
    <div class="Test">
      {{body}}
    </div>
  </div>
</script>

<script type="text/javascript">
	var targetDiv = document.getElementById('targetDiv');
	
	var Source = $("#Test-template").html();
	var Template = Handlebars.compile(Source);

	var html = Template(${json});
	$(targetDiv).append(html);
</script>

</body>
</html>