<%-- 
    Document   : editTruck
    Created on : Nov 13, 2017, 10:24:00 PM
    Author     : shrikantjesu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="CSS/style.css">
        <title>Edit Truck</title>
    </head>
    <body>

        <jsp:include page="../navbar.jsp"></jsp:include>

            <!-- <div class="main">
                    <button type="button" id="Back"  class="btn btn-primary">Back</button>               
            </div>
            -->
            <input type=hidden name=opr id=opr value=2>


            <div class="container">
                <a href="${pageContext.request.contextPath}/TruckServlet">
                <button class="well">Back</button>
            </a>
            <div class="col-lg-12 well">
                <div>
                    <form action="${pageContext.request.contextPath}/TruckServlet" method="post">
                        <c:forEach items="${requestScope.truckList}" var="truck">
                            <input type="hidden" name="update" value="${truck.id}">

                            <div class="col-sm-12">
                                <div class="">
                                    <div class="col-sm-6 form-group">
                                        <label>VIN</label>
                                        <input type="text" name="vin" value="<c:out value="${truck.vin}"/>" placeholder="Enter VIN" class="form-control">
                                    </div>
                                </div>		
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Color</label>
                                        <input type="text" name="color" value="<c:out value="${truck.color}"/>" placeholder="Enter Truck Color" class="form-control">
                                    </div>
                                </div>	
                                <div class="">
                                    <div class="col-sm-6 form-group">
                                        <label>Truck Capacity</label>
                                        <input type="text" name="capacity" value="<c:out value="${truck.capacity}"/>" placeholder="Enter Truck Capacity" class="form-control">
                                    </div>
                                </div>	
                                <div class="row">
                                    <div class="col-sm-4 form-group">
                                        <label>Truck Type</label>
                                        <input type="text" name="truckType" value="<c:out value="${truck.type}"/>" placeholder="Enter Truck Type" class="form-control">
                                    </div>	
                                </div>
                                <div class="">
                                    <div class="col-sm-6 form-group">
                                        <label>License Plate No.</label>
                                        <input type="text" name="plateNo" value="<c:out value="${truck.licPlateNo}"/>" placeholder="Enter License Plate No." class="form-control">
                                    </div>
                                </div>						
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Vehicle Manufactured year</label>
                                        <input type="text" name="mYear" value="<c:out value="${truck.year}"/>" placeholder="Enter Vehicle Manufactured year" class="form-control">
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-lg btn-info">Add</button>					
                            </div>
                        </c:forEach>
                    </form> 
                </div>
            </div>
        </div>
    </body>
</html>
