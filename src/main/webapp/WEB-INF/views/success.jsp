<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div class="row text-center">
        <div class="col-sm-6 col-sm-offset-3">
            <br><br> <h2 style="color:#0fad00">Success</h2>
            <img src="https://cdn4.iconfinder.com/data/icons/computer-and-information-technology-2/128/3computer-2-512.png"
                 width="300" height="300">
            <h3>Dear, ${customer.username}</h3>
            <p style="font-size:20px;color:#5C5C5C;">Thank you for Registering with us.We have sent you an email ${customer.email} with your details
                Please go to your above email now and login.</p>
            <a href="/springmvc-searchapp/login" class="btn btn-success">HOME</a>
            <br><br>
        </div>

    </div>
</div>