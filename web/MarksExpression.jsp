<!-- that is decleration     --> 
<%@page import="java.sql.* ,mypkg.utility" contentType="text/html" language="java" errorPage="myerror.jsp"%>
   <!-- that is decleration     -->

<%
    String sql="select * from midtermmarks";
    Connection con=utility.connect();
    PreparedStatement ps=con.prepareStatement(sql);
    ResultSet rs=  ps.executeQuery();
  %>
    <html>
        <body>
            <h2> Show All Cases</h2>
            <table border="2">
        <tr>
            <th>Enrollment Number</th><th> Machine Learning</th><th>Computer Science</th><th>Computer organizaion</th><th>project</th>
        </tr>
          <%
              while(rs.next())
              {
              String s1=rs.getString(1);
               String s2=rs.getString(2);
                String s3=rs.getString(3);
                String s4=rs.getString(4);
                  String s5=rs.getString(5);
            
              %>
              
              
                     <!-- //shortcut of out.println() is Expression
                       in expression we call the method but its same the integer type  and every method is called except the return type  is void
                     
                     //expression is  -->
              <tr>
                     <td>  <%=    s1    %> </td>
                     <td>   <%    out.println(s2);%> </td>
                     <td>     <%=   s3 %> </td>
                     <td>   <%=  s4 %></td>
                     <td>  <%=  s5 %></td>
                     
              </tr>
              <%
                  }
              %>
              
              
              <%
                  con.close();
                %>
            </table>
            <hr>
              <a href="showFaculty.jsp">Faculty World</a>
        </body>
    </html>