<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Apple-Store</title>
    <link rel="stylesheet" href="./asset/style.css" />
    <link rel="stylesheet" href="./asset/font/themify-icons/themify-icons.css" />
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1>Hello</h1>
<div class="cate-item">
    <a href="loaisp?maloai=2">
        <div class="item-title">iPad</div>
        <div class="item-img">
            <img src="${root}asset/img/ipad.webp" alt="" />
        </div>
        <div class="item-bot">
            <span>Khám phá thêm</span>
            <i class="ti-angle-right"></i>
        </div>
    </a>
</div>
</body>
</html>