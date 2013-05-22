/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import Models.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pelle
 */
public class CustomerTest {
	
	static Customer customer;
	
	public CustomerTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
		customer = new Customer();
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void creationTest() {
		assertNotNull(customer.getAccounts());
		assertNull(customer.getAccountAtIndex(0));
		
		
	}
	
	@Test
	public void nameTest() {
		assertNull(customer.getName());
		customer.setName("Bubber");
		assertEquals("Bubber", customer.getName());
		
		
	}
}