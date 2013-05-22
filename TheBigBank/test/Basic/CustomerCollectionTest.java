/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import Models.CustomerCollection;
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
public class CustomerCollectionTest {
	
	static CustomerCollection cusColl;
	
	public CustomerCollectionTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
		cusColl = new CustomerCollection();
		Customer cus1 = new Customer();
		
		Customer cus2 = new Customer();
		
		Customer cus3 = new Customer();
		
		Customer cus4 = new Customer();
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
	// @Test
	// public void hello() {}
}