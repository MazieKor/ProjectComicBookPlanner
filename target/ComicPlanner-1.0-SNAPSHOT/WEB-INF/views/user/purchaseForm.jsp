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
                        <form:form action="/newPurchase" modelAttribute="purchase">
                            <div class="card-body">
                                <div class="form-group" style="width:50%; display:inline-block">
                                    <label for="title">Tytuł* (pozycja obowiązkowa)</label>
                                    <form:input path="title" type="text" class="form-control" id="title" placeholder="Enter comic book title" />
                                </div>
                                <div class="form-group" style="width:20%; display:inline-block; margin-left: 60px">
                                    <label for="issueNumber">nr tomu</label>
                                    <form:input path="issueNumber" type="number" min="0" class="form-control" id="issueNumber" placeholder="Issue/ Volume number"/>
                                </div>
                                <div class="form-group">
                                    <label for="publisher">Wydawca* (pozycja obowiązkowa)</label>
                                    <form:select path="publisher.id" type="text" class="form-control" id="publisher"
                                                placeholder="Enter publisher if needed">
                                        <form:option value="null">Wybierz z listy</form:option>
                                        <form:options items="${publishers}" itemLabel="name" itemValue="id"/>
                                    </form:select>
                                </div>
                                <div class="form-group">
                                    <label for="price">Cena* (pozycja obowiązkowa)</label>
                                    <form:input path="price" type="number" step="0.01" class="form-control" id="price" placeholder="Enter price"/>
                                    <form:errors path="price" cssClass="error" />
                                    <span id="price.errors" class="error"> Cena musi być podana </span>
                                </div>
                                <div class="form-group">
                                    <label for="urgency">Pilność zakupu (0-10)</label>
                                    <form:input path="urgency" type="number" min="0" max="10" class="form-control" id="urgency" placeholder="Enter how urgent is purchase of this comic book (1-10)"/>
                                </div>
                                <div class="form-group">
                                    <label for="series">Seria</label>
                                    <form:input path="series" type="text" class="form-control" id="series" placeholder="Enter series if needed"/>
                                </div>
                                <div class="form-group">
                                    <label for="subtitle">Podtytuł</label>
                                    <form:input path="subtitle" type="text" class="form-control" id="subtitle" placeholder="Enter subtitle of the comic book if needed"/>
                                </div>
                                <div class="form-group">
                                    <label for="category">Kategoria komiksu</label>
                                    <form:input path="category" type="text" class="form-control" id="category" placeholder="Enter category (American, European, Polish...)"/>
                                </div>
<%--                                <div class="form-group" style="width:30%; display:inline-block">--%>
<%--                                    <label for="issueDate">rok wydania</label>--%>
<%--                                    <form:input path="year" type="number" class="form-control" id="issueDate" placeholder="Enter issue date"/>--%>
<%--                                </div>--%>
<%--                                <div class="form-group" style="width:30%; display:inline-block; margin-left: 60px">--%>
<%--                                    <label for="issueDate2">miesiąc wydania</label>--%>
<%--                                    <form:input path="month" type="number" min="1" max="31" class="form-control" id="issueDate2" placeholder="Enter month"/>--%>
<%--                                </div>--%>
                                <div class="form-group">
                                    <label for="additionalInfo">Dodatkowe informacje</label>
                                    <form:textarea path="info" class="form-control" id="additionalInfo" placeholder="Enter additional information"/>
                                </div>

                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Save</button>
                            </div>
                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary" formaction="/newPurchase_Exit">Save and Exit</button>
                            </div>
                        </form:form>

                    </div>
                </div>
            </div>
        </div>
    </section>
</div>

<%@include file="../templates/footer.jsp"%>
