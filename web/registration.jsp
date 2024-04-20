<!--<html>
    <head>
        <style>
            body{
                 justify-content: center;
                 background-image: url('images/sdbce09.jp');
                 font-size:20px;
                  background-size: cover;
                  background-position-x: 
                  font-family: Arial,sans-serif;
                  align-content: center;
                 align-items: center;
                 padding: 20px;
                 align:left; 
            }
        </style>
    </head>
    <body bgcolor="lightgreen">
        <h1> Registration Form  </h1>
        <hr>
        <form action="registrationServlet" method="get">
           
        <table border="0">
            <pre>
            <tr>  
                <td>  Emai/Uid </td> <td><input type="text" name="uid"></td>
            </tr>
            <tr>  
                <td>  Password </td> <td><input type="password" name="password"></td>
            </tr>
            <tr>  
                <td>  Class </td> <td><input type="text" name="class"></td>
            </tr>
            <tr>  
                <td>  Year </td> <td><input type="text" name="year"></td>
            </tr>
            <tr>  
                <td>  Branch </td> <td><input type="text" name="branch"></td>
            </tr>
                <td>      Name </td> <td><input type="text" name="name"></td>
            <tr>  
                <td>      Mobile </td> <td><input type="text" name="mobile"></td>
            </tr>  
                <tr>
                 <td>     Address</td> <td><input type="text" name="address"></td>
                 </tr>
                 <tr>
                 <td>     Enrollment_Number</td> <td><input type="text" name="Enrollment_Number"</td>
                 </tr>
               <tr>
                         <td><input type="Submit" value="Register"><input type="Reset"></td>
            </tr>
            </pre>
            </table>
            </from>
              <hr>
            <a href ="indexx.jsp"> Home </a>
    </body>
</html>-->
<!DOCTYPE html>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }

        .paper-form {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin: 0 auto;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"],
        input[type="reset"] {
            padding: 12px;
            width: 48%;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #45a049;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #007bff;
            transition: color 0.3s ease;
        }

        a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="paper-form">
        <h1>Registration Form</h1>
        <form action="registrationServlet" method="get">
            <label for="uid">Email/UID:</label>
            <input type="text" id="uid" name="uid" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="class">Class:</label>
            <input type="text" id="class" name="class" required>

           <label for="branch">Branch:</label>
            <input type="text" id="branch" name="branch" required>
            
            <label for="year">Year:</label>
            <input type="text" id="year" name="year" required>

            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="mobile">Mobile:</label>
            <input type="text" id="mobile" name="mobile" required>

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>

            <label for="enrollment">Enrollment Number:</label>
            <input type="text" id="enrollment" name="enrollment" required>

            <input type="submit" value="Register">
            <input type="reset" value="Reset">
        </form>
        <a href="index.jsp">Home</a>
    </div>
</body>
</html>
