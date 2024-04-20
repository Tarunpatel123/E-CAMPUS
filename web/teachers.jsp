<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>Faculty Account-Creation Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: lightgreen;
            margin: 0;
            padding: 0;
        }
        h3 {
            color: #333;
            text-align: center;
        }
        form {
            max-width: 400px;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
        }
        table tr td:first-child {
            text-align: right;
            padding-right: 10px;
        }
        input[type="text"],
        input[type="password"],
        input[type="date"] {
            width: calc(100% - 12px);
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="Submit"],
        input[type="Reset"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-right: 10px;
        }
        input[type="Submit"]:hover,
        input[type="Reset"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h3>Faculty Account-Creation Form</h3>
    <form action="FacultyAccountServlet" method="get">
     <!--   <table>-->
            <tr>
                <td>Email/Uid:</td>
                <td><input type="text" name="uid"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Subject:</td>
                <td><input type="text" name="subject"></td>
            </tr>
            <tr>
                <td>Mobile:</td>
                <td><input type="text" name="mobile"></td>
            </tr>
            <tr>
                <td>Joining Date:</td>
                <td><input type="date" name="date"></td>
            </tr>
            <tr>
                <td>Experience:</td>
                <td><input type="text" name="experience"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create Account"></td><td><input type="reset"></td>
            </tr>
            <hr>
            <a href="index.jsp">Home</a>
    </form>
</body>
</html>
