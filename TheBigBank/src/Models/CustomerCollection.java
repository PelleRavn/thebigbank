/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author pelle
 */
public class CustomerCollection {
    
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    
    private static CustomerCollection instance;
    public static CustomerCollection GetInstance() {
        if(instance == null) {
            instance = new CustomerCollection();
        }
        
        return instance;
    }
    
    public boolean addCustomer(Customer customer) {
        return this.customers.add(customer);
    }
    
    public boolean removeCustomer(Customer customer) {
        return this.customers.remove(customer);
    }
}
