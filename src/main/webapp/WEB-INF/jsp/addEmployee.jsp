<%--
  Created by IntelliJ IDEA.
  User: liwen
  Date: 2020/10/11
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增员工信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增员工</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/employee/addEmployee" method="post">
        员工名称：<input type="text" name="employeeName"><br><br><br>
        员工工号：<input type="text" name="employeeCounts"><br><br><br>
        职位名称：<input type="text" name="detail"><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>