<%--
  Created by IntelliJ IDEA.
  User: fadlymunandar
  Date: 8/28/17
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>


<div id="page-wrapper">
    <div class="header">
        <h1 class="page-header">
            Empty Page <small>Create new page.</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#">Home</a></li>
            <li><a href="#">Empty</a></li>
            <li class="active">Data</li>
        </ol>

    </div>
    <div id="page-inner">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Add Student
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-6">
                                <sf:form role="form" modelAttribute="student">
                                    <div class="form-group">
                                        <sf:label path="firstName">First Name</sf:label>
                                        <sf:input path="firstName" class="form-control" placeholder="input first name"/>
                                        <sf:errors path="firstName" cssClass="error"/>
                                    </div>
                                    <div class="form-group">
                                        <sf:label path="lastName">Last Name</sf:label>
                                        <sf:input path="lastName" class="form-control" placeholder="input last name"/>
                                        <sf:errors path="lastName" cssClass="error"/>
                                    </div>
                                </sf:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer><p>All right reserved. Template by: <a href="http://webthemez.com">WebThemez</a></p></footer>
    </div>
    <!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->
