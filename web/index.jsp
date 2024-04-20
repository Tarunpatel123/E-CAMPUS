
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-image: url('images/14.jpg');
            background-repeat: no-repeat;
            background-size: cover;
            background-color: #f0f0f0;
        }

        .login-container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        .login-form {
            margin-bottom: 20px;
        }

        .login-form h2 {
            margin-bottom: 20px;
            text-align: center;
            color: #007bff;
        }

        .input-group {
            margin-bottom: 20px;
        }

        .input-group label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        .input-group input[type="text"],
        .input-group input[type="password"],
        .input-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            transition: border-color 0.3s ease;
        }

        .input-group input[type="text"]:focus,
        .input-group input[type="password"]:focus,
        .input-group select:focus {
            border-color: #007bff;
        }

        .button-group {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .button-group input[type="submit"],
        .button-group input[type="reset"] {
            width: 48%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .button-group input[type="submit"]:hover,
        .button-group input[type="reset"]:hover {
            background-color: #0056b3;
        }

        p {
            text-align: center;
            margin-top: 10px;
            color: #333;
        }

        p a {
            color: #007bff;
            text-decoration: none;
            transition: color 0.3s ease;
        }

        p a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <form action="verificationServlet" method="get" class="login-form">
            <h2>Login</h2>
            <div class="input-group">
                <label for="Uid">Email/UID:</label>
                <input type="text" name="Uid" required>
            </div>
            <div class="input-group">
                <label for="password">Password:</label>
                <input type="password" name="passward" required>
            </div>
            <div class="input-group">
                <label for="Utype">Usertype:</label>
                <select id="usertype" name="Utype">
                    <option value="Student">Student</option>
                    <option value="Director">Director</option>
                    <option value="Faculty">Faculty</option>
                </select>
            </div>
            <div class="button-group">
                <input type="submit" value="Login" name="login">
                <input type="reset" value="Reset">
            </div>
        </form>
        <p>New user? <a href="registration.jsp">Register here</a></p>
    </div>
</body>

</html>

<!--<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-image: url('images/14.jpg');
            background-repeat: no-repeat;
            background-size: cover;
            background-color: #f0f0f0;
        }

        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .login-form {
            max-width: 300px;
            margin: 0 auto;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .input-group {
            margin-bottom: 15px;
            display: flex;
            flex-direction: row;
            align-items: center;
        }

        .input-group label {
            margin-right: 10px;
        }

        .input-group input[type="text"],
        .input-group input[type="password"],
        .input-group select {
            flex: 1;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .button-group {
            margin-top: 15px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .button-group input[type="submit"],
        .button-group input[type="reset"] {
            width: 48%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: #fff;
            cursor: pointer;
        }

        .button-group input[type="submit"]:hover,
        .button-group input[type="reset"]:hover {
            background-color: #45a049;
        }

        p {
            text-align: center;
        }

        p a {
            color: #007bff;
            text-decoration: none;
        }

        p a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <form action="verificationServlet" method="get" class="login-form">
            <h2>Login</h2>
            <div class="input-group">
                <label for="Uid">Email/UID:</label>
                <input type="text" name="Uid" required>
            </div>
            <div class="input-group">
                <label for="password">Password:</label>
                <input type="password"  name="password" required>
            </div>                           
            <div class="input-group">
                <label for="Utype">Usertype:</label>
                <select id="usertype" name="Utype">
                    <option value="Student">Student</option>
                    <option value="Director">Director</option>
                    <option value="Faculty">Faculty</option>
                </select>
            </div>
            <div class="button-group">
                <input type="submit" value="Login" name="login">
                <input type="reset" value="Reset">
            </div>
        </form>
        <p>New user? <a href="registration.jsp">Register here</a></p>
    </div>
</body>  
</html>-->