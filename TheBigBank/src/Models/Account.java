/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author pelle
 */
public class Account {
    
    private Customer customer;
    private double interestRate = 0.05;
    private double balance;
    
    public Account(Customer customer, double interestRate) {
        this.customer = customer;
		this.interestRate = interestRate;  
    }
    
    public Account(Customer customer, double interestRate, double balance) {
        this.customer = customer;
        this.interestRate = interestRate;
        this.balance = balance;
    }
	
	public Account(Customer customer) {
		this.customer = customer;
	}
	
	public Account() {
		
	}
    
    public boolean deposit(double value) {
        if(value > 0.0) {
            this.balance += value;
            return true;
        }
		
        return false;
    }
    
    public boolean withdraw(double value) {
        if(value > 0.0) {
            if(this.balance >= value) {
                this.balance -= value;
                return true;
            }
        }
        
        return false;
    }
    
    public double getBalance() {
        return this.balance;
    }
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	//Add the intrest to the account balance
	public void giveAccountInterst() {
		this.balance += (this.balance * this.interestRate);
	}
}
