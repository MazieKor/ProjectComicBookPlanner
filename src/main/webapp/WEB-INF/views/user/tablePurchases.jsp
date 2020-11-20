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
                    <h1>Lista zakupów</h1>
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
                            <h3 class="card-title">Pełna lista komiksów w bazie</h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Tytuł</th>
                                    <th>Nr tomu</th>
                                    <th>Cena (zł)</th>
                                    <th>Data wydania</th>
                                    <th>Wydawca</th>
                                    <th>Akcja</th>
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
                                                <td>${purchase.issueDate}</td>
                                                <td>${purchase.publisher.getName()}</td>
                                                <td><div><button>
                                                    <a href="<c:url value="/detailsPurchase/${purchase.id}"/>"> Szczegóły </a>
                                                </button> </div>
                                                    <div><button>
                                                        <a href="<c:url value="/deletePurchase/${purchase.id}"/>"> Skasuj </a>
                                                    </button></div>
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

