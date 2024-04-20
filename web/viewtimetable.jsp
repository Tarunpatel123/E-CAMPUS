<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>College Timetable</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 20px;
      background-color: #f0f0f0;
    }
    h2 {
      text-align: center;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
      border-radius: 5px;
      overflow: hidden;
    }
    th, td {
      border: 1px solid #ddd;
      padding: 15px;
      text-align: center;
    }
    th {
      background-color: #f2f2f2;
    }
    tr:nth-child(even) {
      background-color: #f9f9f9;
    }
    tr:hover {
      background-color: #f2f2f2;
    }
    a {
      display: block;
      width: 100px;
      margin: 20px auto;
      padding: 10px;
      text-align: center;
      background-color: #4CAF50;
      color: #fff;
      text-decoration: none;
      border-radius: 5px;
    }
    a:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

  <h2>College Timetable</h2>

  <table>
    <tr>
      <th>Time</th>
      <th>Monday</th>
      <th>Tuesday</th>
      <th>Wednesday</th>
      <th>Thursday</th>
      <th>Friday</th>
    </tr>
    <tr>
      <td>8:00 AM - 9:00 AM</td>
      <td>Machine Learning</td>
      <td>Computer Network</td>
      <td>Computer Design</td>
      <td>Project Management</td>
      <td>Skill Development Lab(302)</td>
    </tr>
    <tr>
      <td>9:00 AM - 10:00 AM</td>
      <td>Machine Learning</td>
      <td>Computer Network</td>
      <td>Computer Design</td>
      <td>Project Management</td>
      <td>Skill Development Lab(302)</td>
    </tr>
     <tr>
      <td>10:00 AM - 11:00 AM</td>
      <td>Machine Learning</td>
      <td>Computer Network</td>
      <td>Computer Design</td>
      <td>Project Management</td>
      <td>Skill Development Lab(302)</td>
    </tr>
     <tr>
      <td>11:00 AM - 12:00 PM</td>
      <td>Machine Learning</td>
      <td>Computer Network</td>
      <td>Computer Design</td>
      <td>Project Management</td>
      <td>Skill Development Lab(302)</td>
    </tr>
    <tr>
      <td>12:00 PM - 1:00 PM</td>
      <td colspan="5">Lunch Break</td>
    </tr>
     <tr>
      <td>2:00 PM - 3:00 PM</td>
      <td>Machine Learning</td>
      <td>Computer Network</td>
      <td>Computer Design</td>
      <td>Project Management</td>
      <td>Skill Development Lab(302)</td>
    </tr>
  </table>
  <a href="showStudent.jsp">Home</a>
</body>
</html>