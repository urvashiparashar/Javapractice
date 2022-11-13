//jdbc connectivity
/*
 * 1. import->java.sql
 * 2.load and register the driver --> cm.mysql.jdbc.driver
 * 3. create connection
 * 4. create a statement
 * 5. execute query
 * 6. process results
 * 7. close
 * 
 */
import java.sql.*;
public class Democlass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    String url="jdbc:mysql://localhost:3306/test";
    String uname="root";
    String pass="T@nnu2001";
    String query="select username from student where userid=3";
	
//	Class.forName("com.mysql.jdbc.Driver"); //class forname telusko
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	
	String name=rs.getString("username");
	System.out.println(name);
	st.close();
	con.close();
	}

}
