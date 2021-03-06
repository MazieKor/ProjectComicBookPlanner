<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../templates/header.jsp"%>
<%@include file="../templates/upmain.jsp"%>
<%@include file="../templates/sidebar.jsp"%>

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Ceny w poszczególnych sklepach</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active">DataTables</li>
                    </ol>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <h3 class="card-title">${purchase.title}, Cena okładkowa: ${purchase.price}</h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Sklep</th>
                                    <th>Zniżka</th>
                                    <th>Cena po zniżce</th>

                                </tr>
                                </thead>
                                <tbody>
                                <c:choose>
                                    <c:when test="${purchaseList.size()==0 }">
                                        <th>Lista zakupów jest pusta</th>
                                    </c:when>
                                    <c:otherwise>
                                        <c:forEach items="${purchaseList}" var="purchase">
                                            <tr>
                                                <td>${purchase.title}</td>
                                                <td>${purchase.issueNumber}</td>
                                                <td>${purchase.price}</td>
                                                <td>${purchase.series}</td>
                                                <td>${purchase.publisher.getName()}</td>
                                                <td><div><button> Szczegóły</button> </div>
                                                    <button>
                                                        <a href="<c:url value="/deletePurchase/${purchase.id}"/>"> Skasuj </a>
                                                    </button>
                                                </td>
                                            </tr>
                                        </c:forEach>

                                    </c:otherwise>
                                </c:choose>
                                </tbody>
                                <%--                                <tfoot>--%>
                                <%--                                <tr>--%>
                                <%--                                    <th></th>--%>
                                <%--                                    <th></th>--%>
                                <%--                                    <th></th>--%>
                                <%--                                    <th></th>--%>
                                <%--                                    <th></th>--%>
                                <%--                                    <th></th>--%>
                                <%--                                </tr>--%>
                                <%--                                </tfoot>--%>
                            </table>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->


                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../templates/footer.jsp"%>