<%--
  Created by IntelliJ IDEA.
  User: liwen
  Date: 2020/10/11
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
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
                    <small>书籍列表 —— 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/employee/toAddEmployee">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>员工名字</th>
                    <th>员工工号</th>
                    <th>职位名称</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="employee" items="${requestScope.get('list')}">
                    <tr>
                        <td>${employee.getEmployeeID()}</td>
                        <td>${employee.getEmployeeName()}</td>
                        <td>${employee.getEmployeeCounts()}</td>
                        <td>${employee.getDetail()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/employee/toUpdateEmployee?id=${employee.getEmployeeID()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/employee/del/${employee.getEmployeeID()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
