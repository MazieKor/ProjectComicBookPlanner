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
                    <h1>Zniżki</h1>
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
                        <form:form action="/newDiscount" method="post" modelAttribute="storePublisher">
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="publisher"> Wybierz wydawcę</label>
                                    <form:select path="publisher.id" type="text" class="form-control" id="publisher">
                                        <form:option value="null">Wybierz wydawcę z listy</form:option>
                                        <form:options items="${publisherList}" itemLabel="name" itemValue="id"/>
                                    </form:select>
                                </div>

                                <div class="form-group">
                                    <label for="store"> Wybierz księgarnię</label>
                                    <form:select path="store.id" type="text" class="form-control" id="store">
                                        <form:option value="null">Wybierz księgarnię z listy</form:option>
                                        <form:options items="${storeList}" itemLabel="name" itemValue="id"/>
                                    </form:select>
                                </div>
                                <div class="form-group">
                                    <label for="discount">Zniżka promocyjna (w %)</label>
                                    <form:input path="discount" type="number" min="0" max="100" class="form-control" id="discount"
                                                placeholder="Enter discount"/>
                                </div>


                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Save Discount</button>
                            </div>
                            <div class="card-footer">
                                <button type=submit class="btn btn-primary" formaction="/newDiscount_Exit">Save discount and Exit</button>
                            </div>
                        </form:form>

                    </div>
                </div>
            </div>
        </div>
    </section>
</div>



<%@include file="../templates/footer.jsp"%>