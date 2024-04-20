
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Mid-Term Marks</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        h2 {
            color: #333;
            margin-top: 30px;
        }
        form {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 400px;
            margin: 20px auto;
        }
        table {
            width: 100%;
        }
        td {
            padding: 10px;
            text-align: left;
        }
        input[type="text"], input[type="date"] {
            width: 100%;
            padding: 8px;
            border-radius: 3px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body> 
    <h2>Update Mid-Term Marks</h2>
    <form action="MidTermupdate" method="get">
        <table>
            <tr>
                <td>Enrollment Number:</td>
                <td><input type="text" name="enroll"></td>
            </tr>
            <tr>
                <td>Machine Learning:</td>
                <td><input type="text" name="ml"></td>
            </tr>
            <tr>
                <td>Computer Science:</td>
                <td><input type="text" name="cs"></td>
            </tr>
            <tr>
                <td>Computer Organization:</td>
                <td><input type="text" name="co"></td>
            </tr>
            <tr>
                <td>Project:</td>
                <td><input type="text" name="project"></td>
            </tr>
        </table>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
