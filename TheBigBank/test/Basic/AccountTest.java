/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import Models.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;

/**
 *
 * @author pelle
 */
public class AccountTest {
    
	static Account account;
	
    public AccountTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
		Customer cus = new Customer("Flemming");
		account = new Account(cus, 0.05);
		cus.addAccount(account);
    }
    
    @AfterClass
    public static void tearDownClass() {
		account = null;
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
	public void nameTest() {
		assertNotNull(account.getCustomer());
		assertEquals("Flemming", account.getCustomer().getName());
		account.getCustomer().setName("Blah");
		assertEquals("Blah", account.getCustomer().getName());
	}
	
    @Test
    public void interestRateTest() {
		assertEquals(0.05, account.getInterestRate(), 0.0);
		account.setInterestRate(0.1);
		assertEquals(0.1, account.getInterestRate(), 0.0);
	}
	
	@Test
	public void depositTest() {
		assertEquals(0.0, account.getBalance(), 0.0);
		
		account.deposit(100.0);
		assertEquals(100.0, account.getBalance(), 0.0);
		
		account.deposit(0.05);
		assertEquals(100.03, account.getBalance(), 0.0);
	}
	
	@Test
	public void withdrawTest() {
		assertEquals(100.05, account.getBalance(), 0.0);
		
		assertTrue(account.withdraw(50.0));
		assertEquals(50.05, account.getBalance(), 0.0);
		
		assertFalse(account.withdraw(100.0));
		assertEquals(50.05, account.getBalance(), 0.0);
		
		assertTrue(account.withdraw(50.05));
		assertEquals(0.0, account.getBalance(), 0.0);
	}
}