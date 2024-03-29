
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/" var="root" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="${root}asset/css/cart.css" />
<link rel="stylesheet" href="${root}asset/style.css">
<link rel="stylesheet"
	href="${root}asset/font/themify-icons/themify-icons.css" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylaesheet"
	href="${root}plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<link rel="stylesheet" href="${root}asset/dist/css/adminlte.min.css">
<link href="<c:url value="asset/style.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="main">
		<c:set var="items" value="${listlsp}" scope="request" />
		<jsp:include page="./header2.jsp" />
		<div class="card-body p-0">
			<div class="table-responsive">
				<table class="table m-0">
					<thead>
						<tr>
							<th>ID đơn hàng</th>
							<th>Sản phẩm</th>
							<th>Số lượng</th>
							<th>Tổng tiền</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="i" begin="0" end="${size-1 }">
							<tr>
								<td>${listDetail[i].getMaDH()}</td>
								<td>${listName[i]}</td>
								<td>${listDetail[i].getSoLuong()}</td>
								<td>${listDetail[i].getTongTien()}</td>

							</tr>
						</c:forEach>

					</tbody>
				</table>

				<a href="UserPage"
					class="btn btn-sm btn-secondary ">Back</a>
			</div>
		</div>
	</div>
</body>
</html>
