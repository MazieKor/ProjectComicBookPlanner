<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>

<%@include file="../templates/header.jsp"%>
<%@include file="../templates/upmain.jsp"%>
<%@include file="../templates/sidebar.jsp"%>

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Planowany zakup</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="/">Home</a></li>
                        <li class="breadcrumb-item active">Link 1</li>
                    </ol>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>


<!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-12">
                    <!-- general form elements -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Zapisz nowy komiks</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form action="/newPurchase" >
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="title">tytuł</label>
                                    <input  type="text" class="form-control" id="title" placeholder="Enter title" name="title"/>
                                </div>

                                <div class="form-check">
                                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                                </div>
                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>

<%@include file="../templates/footer.jsp"%>
