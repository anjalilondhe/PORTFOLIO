<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <style>
        h5{
            color: white;
            font-size: smaller;
            text-align: center;
        }
       ul li a{
            color: white;
            font-size: small;
            text-decoration: none;
            margin-right: 30px;
        }
        .input{
            text-align: center;
            margin-top: 35px;
            font-size: 15px;
        }
        input{
            text-align: center;
            padding:  3px 35px;
        }
        .button{
            margin-top: 30px;
            text-align: center;
        }
        .text{
            text-align: center;
        }
        .icon{
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
        <div class="row" style="height: 250px;background-color:lightblue;">
            <div class="col p-5 text-center">
                <h1>Create Footer In HTML & CSS</h1>
            </div>
        </div>
        <div class="row bg-dark p-5" style="height:315px;">
            <div class="col p-2">
                <div style="color: white;">
                    <h5>USEFUL LINKS</h5>
                    <ul type="none" style="text-align: center;">
                    <li><a href="#">About</a></li>
                    <li><a href="#">Services</a></li>
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">Shop</a></li>
                    <li><a href="#">Blog</a></li>
                   </ul>
                </div>
            </div>
            <div class="col p-2">
                <h5>NEWSLETTER</h5>
                <div class="input"><input type="email" placeholder="Your Email Address"></div>
                <div class="button"><button type="submit" class="btn btn-dark text-white" style="border:solid white;font-size:10px;border-radius:25px;text-align:center;">SUBSCRIBE NOW</button></div>
            </div>
            <div class="col p-2">
                <h5>CONTACT</h5>
                <p><pre class="text" style="color: white;">123,XYZ Road,BSk 3
Banglore,Karnataka,IN
                </pre></p>
                <div class="icon">
                    <span><a href="#"><i class="fa-brands fa-facebook" style="color: white;padding:5px;"></i></a></span>
                    <span><a href="#"><i class="fa-brands fa-twitter" style="color: white;padding:5px;"></i></a></span>
                    <span><a href="#"><i class="fa-brands fa-instagram" style="color: white;padding:5px;"></i></a></span>
                    <span><a href="#"><i class="fa-brands fa-whatsapp" style="color: white;padding:5px;"></i></a></span>
                </div>
            </div>
        </div>
    </div>
</body>
</html>