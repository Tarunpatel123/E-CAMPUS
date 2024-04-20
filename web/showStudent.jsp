<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ecampus Collage</title>
    <style>
        body {
            background-color: #f5f5f5;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 20px;
        }

        .card {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #008080;
            margin-top: 50px;
        }

        a {
            display: block;
            margin: 10px 0;
            padding: 10px 20px;
            background-color: #008080;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            text-align: center;
        }

        a:hover {
            background-color: #005353;
        }
    </style>
</head>

<body>
    <h1>Welcome To Your Account!</h1>
    <div class="container">
    <!--    <div class="card">
           
        </div>-->

        <div class="card">
            <h2>Events</h2>
            <a href="notice.jsp">Today's Notice</a>
            <a href="viewtimetable.jsp">View Time Table</a>
        </div>

        <div class="card">
            <h2>Academic</h2>
            <a href="viewAttadance">View Attendance</a>
            <a href="EnrollmentWiseMidTermMarks.jsp">View Midterm Marks</a>
        </div>

        <div class="card">
            <h2>Student Profile</h2>
            <a href="Profile">Profile</a>
            <a href="killsession">Logout</a>
        </div>
    <div class="card">
        <h2>FEE Structure</h2>
        <a href="fess">View Fee</a> 
    </div>
    </div>
</body>

</html>

<!--<html>
    <head>
        <title>Ecampus</title>
    <style>
        
           body {
               background-color: lightgreen;
               padding-bottom: 50px;
              
                 
              
             }
             </style>
     </head>
     <body align="center">
        <h1>Welcome To Your Account........... !<br>
            <a href="notice.jsp">Todays Notice</a><br>
            <a href="viewtimetable.jsp">View Time Table</a><br>
            <a href="viewAttadance">View Attandance</a><br>
           <!-- <a href="leave">Leave Application</a><br>
            <a href="EnrollmentWiseMidTermMarks.jsp">View MidTerm Marks</a><br>
            <a href="Profile">Profile</a><br>
            <a href="killsession">Logout</a>
   
        </h1>
      </body>
</html>-->
