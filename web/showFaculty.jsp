<!--<html>

      <body bgcolor='lightgreen' text align='center'>
         <h1> Faculty........ World!  <br>
             <em>
             <pre>

         <a href ="AllmidtermMarks">view marks</a><br>
         <a href="viewAttandanceall">view Attandance</a><br>
         <a href="midterm.jsp">Add midterm marks</a> <br>
         <a href="EnrollmentWiseMidTermMarks.jsp">Enrollment Wise View </a><br>
         <a href="ViewAttentance.jsp">Add Attendance Today</a><br>
         <a href="killsession">Logout</a>
</em>
             </pre>
         </h1>
     </body>
    </h2>
</html>-->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>College Website</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
            color: #333;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        .section {
            margin-bottom: 40px;
        }

        .section h2 {
            color: #2c3e50;
            margin-bottom: 20px;
            text-align: center;
        }

        .grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
        }

        .card {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease;
        }

        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
        }

        .card h3 {
            color: #2c3e50;
            margin-bottom: 10px;
            text-align: center;
        }

        .card p {
            font-size: 14px;
            line-height: 1.6;
        }

        /* Styles for Faculty Dashboard */
        .faculty-dashboard {
            background-color: #27ae60;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
            text-align: center;
            color: #fff;
        }

        .faculty-dashboard h1 {
            margin-bottom: 20px;
            font-size: 36px;
        }

        .faculty-dashboard a {
            display: inline-block;
            margin: 10px;
            padding: 15px 30px;
            background-color: #fff;
            color: #27ae60;
            text-decoration: none;
            border-radius: 5px;
            font-size: 18px;
            transition: background-color 0.3s ease;
        }

        .faculty-dashboard a:hover {
            background-color: #2ecc71;
            color: #fff;
        }

        .faculty-dashboard em {
            font-style: italic;
            display: block;
            margin-top: 20px;
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="section">
            <div class="faculty-dashboard">
                <h1>Welcome to Faculty World!</h1>
                <em>
                    <a href="AllmidtermMarks">View Marks</a>
                    <a href="viewAttandanceall">View Attendance</a>
                    <a href="midterm.jsp">Add Midterm Marks</a>
                    <a href="EnrollmentWiseMidTermMarks.jsp">Enrollment Wise View</a>
                    <a href="ViewAttentance.jsp">Add Attendance Today</a>
                    <a href="updateAttendance.jsp">Update Attendance</a>
                    <a href="updateMidTerm.jsp">Update MidTerm Marks</a>
                    <a href="fess.jsp">Fee Add </a>
                    <a href="Facultyprofilee">Profile</a>
                    <a href="killsession">Logout</a>
                    <a 
                </em>
            </div>
        </div>

        <div class="section">
            <h2>About Us</h2>
            <p>Welcome to our college website. We offer a wide range of courses and opportunities for students to excel in their fields of interest.</p>
        </div>

        <div class="section">
            <h2>Events</h2>
            <div class="grid">
                <div class="card">
                    <h3>Upcoming Events</h3>
                    <p>Join us for our upcoming events and seminars. Stay updated with the latest happenings at our college.</p>
                </div>
                <div class="card">
                    <h3>Past Events</h3>
                    <p>Explore some of our past events and get a glimpse of the vibrant college life.</p>
                </div>
            </div>
        </div>

        <div class="section">
            <h2>Courses</h2>
            <div class="grid">
                <div class="card">
                    <h3>Undergraduate Programs</h3>
                    <p>Discover our undergraduate courses and kickstart your journey towards a successful career.</p>
                </div>
                <div class="card">
                    <h3>Postgraduate Programs</h3>
                    <p>Explore our postgraduate courses and take your knowledge to the next level.</p>
                </div>
            </div>
        </div>

        <div class="section">
            <h2>Faculty</h2>
            <div class="grid">
                <div class="card">
                    <h3>Meet Our Faculty</h3>
                    <p>Learn more about our esteemed faculty members and their expertise in various fields.</p>
                </div>
                <div class="card">
                    <h3>Faculty Resources</h3>
                    <p>Find resources and support for our faculty members to enhance teaching and research.</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
