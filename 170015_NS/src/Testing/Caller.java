package Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


// Date - 17/11/2019
//Description - This class is used for calling the database values stored through ssl connection of the database
public class Caller {

	public String insertDBlifecycle(String f1, String f2){
	    
	     
    	try {
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/msk_project","root","Scooby@100200");
         String sql = "INSERT INTO lifecycle (lifecycle_Name, lifecycle_Description)" +
        	        "VALUES (?, ?)";
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         preparedStatement.setString(1, f1);
         preparedStatement.setString(2, f2);
         preparedStatement.executeUpdate();
         String sql2 = "delete from lifecycle where lifecycle_Name= ?";
        		 PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        		 preparedStatement2.setString(1, f1);
        		 preparedStatement2.executeUpdate();
        return "Database Updated";
    	}
    	catch(Exception e) {
    		
    		 return"Already in Database!";
    	
    	}

 }

}
