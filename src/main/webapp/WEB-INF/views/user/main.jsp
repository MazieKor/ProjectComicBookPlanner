<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../templates/header.jsp"%>
<%@include file="../templates/upmain.jsp"%>
<%@include file="../templates/sidebar.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Witaj w ComicBook Plannerze</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Link 1</a></li>
                        <li class="breadcrumb-item"><a href="#">Link 2</a></li>
                        <li class="breadcrumb-item active">Link 3</li>
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
                    <!-- Default box -->
                    <div class="card">
                        <div class="card-header">
                            <h3 class="card-title">Wybierz, co chcesz zrobić</h3>

                            <div class="card-tools">
                                <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
                                    <i class="fas fa-minus"></i>
                                </button>

                            </div>
                        </div>
                        <table>
                            <tr>
                                <td>
                                    <div class="card-body">
                                        Dodaj komiks
                                    </div>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-block btn-primary">
                                        <a href="<c:url value="/form"/>" style="display:block;color:black"> Przejdź </a>
                                    </button>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="card-body">
                                        Wyświetl listę komiksów
                                    </div>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-block btn-primary">
                                        <a href="<c:url value="/listToPurchase" />" style="display:block;color:black"> Przejdź </a>
                                    </button>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="card-body">
                                        Dodaj zniżki
                                    </div>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-block btn-primary">
                                        <a href="<c:url value="/discounts" />" style="display:block;color:black"> Przejdź </a>
                                    </button>
                                </td>
                            </tr>


                            <tr>
                                <td>
                                    <div class="card-body">
                                        Załaduj wydawców
                                    </div>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-block btn-primary">
                                        <a href="<c:url value="/publishersFixtures"/>" style="display:block;color:black"> Załaduj </a>
                                    </button>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="card-body">
                                        Załaduj sklepy
                                    </div>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-block btn-primary">
                                        <a href="<c:url value="/storesFixtures"/>" style="display:block;color:black"> Załaduj </a>
                                    </button>
                                </td>
                            </tr>
                        </table>
                        <!-- /.card-body -->

                        <div class="card-footer">
                            Footer
                        </div>
                        <!-- /.card-footer-->

                    </div>
                    <!-- /.card -->
                </div>
            </div>
        </div>
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../templates/footer.jsp"%>