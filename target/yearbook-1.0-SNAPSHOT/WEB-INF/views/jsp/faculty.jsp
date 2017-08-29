
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
                        Add Faculty
                    </div>
                    <div class="panel-body">
                        <c:if test="${isSaved == true}">
                            <div class="alert alert-success">
                                <strong>Well done!</strong> You successfully read this important alert message.
                            </div>
                        </c:if>
                        <div class="row">
                            <div class="col-lg-6">
                                <sf:form method="POST" action="${pageContext.request.contextPath}/faculty/add" role="form" modelAttribute="faculty">
                                    <div class="form-group">
                                        <sf:label path="facultyName">Faculty Name</sf:label>
                                        <sf:input path="facultyName" class="form-control" placeholder="input faculty name"/>
                                        <sf:errors path="facultyName" cssClass="error"/>
                                    </div>
                                    <button type="submit" class="btn btn-default">Save</button>
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
