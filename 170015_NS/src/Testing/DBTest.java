package Testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.*;
import Testing.Caller;


//Date - 17/11/2019
//Description - This class contains the test cases created for the database called in the Caller class
public class DBTest {
	 @Test
	    public void test1() {
	        Caller tester = new Caller(); 

	        // assert statements
	        assertEquals("Already in Database!", tester.insertDBlifecycle("Add","New Lifecycle"));
	       
	    }
	    @Test
	    public void test2() {
	        Caller tester = new Caller(); 

	        // assert statements
	       
	        assertEquals("Database Updated", tester.insertDBlifecycle("new","add"));
	    }
}
