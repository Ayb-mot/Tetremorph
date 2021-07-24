
import java.sql.*;

public class Connectivity {
	
	public static void main (String[] args ) {
		
		
		
		try {
			
			Class.forName("jdbc:odbc:database");
			
			Connection conn=DriverManager.getConnection("sun.jdbc.odbc.JdbcOdbcDriver");
			
			Statement st=conn.createStatement();
			
			String sql="Select * from Information";
			
			ResultSet rs=st.executeQuery(sql);
			
			
			while(rs.next()) {
				
				System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}