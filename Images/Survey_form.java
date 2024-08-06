<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            margin-top: 0;
            padding: 0;
        }
        .first1{
            height: 900px;
            width: 850px;
        }
        .container{
            width: 850px;
            height: 900px;
            background-color: rgb(249, 246, 243, 0.5);
            border: solid black;
        }
        hr{
            margin-left: 40px;
            width: 350px;
        }
        .ab{
            width: 850px;
            height: 150px;
            background-color: rgb(249, 246, 243, 0.5);
        }
        .first{
            width: 300px;
            height: 10px;
            margin-left: 5px;
        }
        #second{
            margin-left: 430px;
        }
        .se{
            width: 847px;
            height: 50px;
            /*margin-top: 20px;*/
            border-style: solid;
            text-align: right;
        }
        .se span{
            display: inline;
            margin-left: 50px;
            margin-right: 30px;
        }
        input{
            margin-left: 90px;
        }
        /*.middle{
            width: 300px;
            height: 500px;
            background-color: blueviolet;
        }*/
       /*.buttons{
        background-color: azure;
        height: 100px;
        width: 350px;
        margin-left: 400px;
        margin-top: 0px;
       }
       #radio{
        display: inline;
       }*/
       p{
        width: 850px;
        height: 40px;
        font-size: 18px;
        background-color: rgb(249, 246, 243, 0.5);
       }

       input[type=radio]{
        margin-left: 90px;
        display: inline;
        /*width: 15px;
        height: 20px;*/
       }
       .last{
        width: 600px;
        height: 50px;
        margin-top: 60px;
        text-align: center;
        font-size: 15px;
        margin-left: 100px;
       }
       .website{
        height: 35px;
        width: 500px;
        margin-left: 150px;
        text-align: center;
        border-radius: 20px;
        background-color: black;
        color: white;
       }
       .upper{
        height: 70px;
        width: 850px;
        text-align: center;
        font-style: italic;
       }
       #form{
        font-size: 50px;
       }

    </style>
</head>
<body>
    <div class="first1">      
    <div class="container">
        <div class="upper">
            <p id="form">Survey Form</p>
        </div>
        <div class="ab">
            <div class="first">
                Name: <hr>     
                Date: <hr>
                place: <hr>
        </div>

        <div id="second">
            Age: <hr>
            Address: <hr><br>
            <hr>
        </div>
    </div>

    <div class="se">
        <span>Yes</span>
        <span>Maybe</span>
        <span>No</span>
    </div>
    
    <div class="middle">
        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing alit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>

        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing elit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>

        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing elit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>

        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing elit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>

        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing elit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>

        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing elit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>

        <p>Would you lorem ipsum dolor sit amet,consect etur adipiscing elit?
            <input type="radio">
            <input type="radio">
            <input type="radio">
        </p>
    </div> 

    <p class="last">Thank you for your valuable feedback! Lorem ipsum dolor sit amet,consect etur adipiscing elit.</p>

    <p class="website">www.reallygreatsite.com</p>
</body>
</html>