<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="list" method="get">
查询条件：<select name="con">
<option id="username" value="username">作者</option>
<option id="created" value="created">发布时间</option>
<option id="tousuCnt" value="tousuCnt">投诉数量</option>
</select>
<input type="submit" value="点击查询"/>
</form>
<table class="table">
<tr>
<td>id</td>
<td>标题</td>
<td>发布时间</td>
<td>作者</td>
<td>投诉数量</td>
</tr>
<c:forEach items="${list}" var="a">
<tr>
<td>${a.id}</td>
<td>${a.title }</td>
<td>${a.created}</td>
<td>${a.username }</td>
<td>${a.tousuCnt }</td>
</tr>

</c:forEach>

</table>
</body>
</html>