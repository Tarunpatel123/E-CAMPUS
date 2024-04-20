<!DOCTYPE html>
<html>
<head>
    <title>Add Midterms Marks</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: lightgreen;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h3 {
            color: #008080; /* Dark cyan */
            margin-top: 50px;
        }

        form {
            margin-top: 20px;
        }

        input[type="text"], input[type="submit"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
            width: 250px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50; /* Green */
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049; /* Darker green */
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #4CAF50; /* Green */
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #45a049; /* Darker green */
        }
    </style>
</head>
<body>
    <h3>Add Midterms Marks</h3>
    <form action="midtermServlet" method="post">
        <input type="text" name="Enrollment_Number" placeholder="Enrollment Number"><br>
        <input type="text" name="Machine_Learning" placeholder="Machine Learning"><br>
        <input type="text" name="Computer_Science" placeholder="Computer Science"><br>
        <input type="text" name="Computer_Organizaion" placeholder="Computer Organization"><br>
        <input type="text" name="project" placeholder="Project"><br>
        <input type="submit" name="submit" value="Submit"><br>
    </form>
    <hr>
    <a href="showFaculty.jsp">Home</a>
</body>
</html>


<!--<html>
    <head>
    </head>
    <body align="center" bgcolor="lightgreen"  >
        <h3>Add Midterms Marks 
        <pre>
    <form action="midtermServlet" method="get">
    <tr>
        
          Enrollment Number :         <input type="text" name="Enrollment_Number"> <br>
                    
    </tr>
    <tr>
        
          Machine learning :           <input type="text" name="Machine_Learning"><br>
                   
    </tr>
    <tr>
        
          Computer science :           <input type="text" name="Computer_Science"><br>
                     
    </tr>
    <tr>
        
           Computer Organization:       <input type="text" name="Computer_Organizaion"><br>
                   
    </tr>
    <tr>
        
           Project :                    <input type="text" name="project"><br>
                   
    </tr>
    </tr>
    <tr>
        
                      <input type="submit" name="submit"><br>
                   
    </tr>
        </pre>
        </h3>
        <hr>
         <a href="showFaculty.jsp">Home</a>
    </body>
</html>-->
