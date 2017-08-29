<%--
  Created by IntelliJ IDEA.
  User: fadlymunandar
  Date: 8/28/17
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<nav class="navbar-default navbar-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">

            <li>
                <a class="${activeHome}" href="${pageContext.request.contextPath}/"><i class="fa fa-dashboard"></i> Dashboard</a>
            </li>
            <li>
                <a class="${activeStudent}" href="${pageContext.request.contextPath}/student"><i class="fa fa-desktop"></i> Student </a>
            </li>
            <li>
                <a class="${activeFaculty}" href="${pageContext.request.contextPath}/faculty"><i class="fa fa-desktop"></i> Faculty </a>
            </li>
            <li>
                <a class="${activeTab}" href="#"><i class="fa fa-qrcode"></i> Tabs & Panels</a>
            </li>

            <li>
                <a class="${cssClass}" href="#"><i class="fa fa-table"></i> Responsive Tables</a>
            </li>
            <li>
                <a class="${cssClass}" href="#"><i class="fa fa-edit"></i> Forms </a>
            </li>


            <li>
                <a href="#"><i class="fa fa-sitemap"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link<span class="fa arrow"></span></a>
                        <ul class="nav nav-third-level">
                            <li>
                                <a href="#">Third Level Link</a>
                            </li>
                            <li>
                                <a href="#">Third Level Link</a>
                            </li>
                            <li>
                                <a href="#">Third Level Link</a>
                            </li>

                        </ul>

                    </li>
                </ul>
            </li>
            <li>
                <a class="active-menu" href="#"><i class="fa fa-fw fa-file"></i> Empty Page</a>
            </li>
        </ul>

    </div>

</nav>
<!-- /. NAV SIDE  -->
