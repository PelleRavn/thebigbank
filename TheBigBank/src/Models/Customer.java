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
public class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    
    public Customer(String name, ArrayList<Account> accountList) {
        this.name = name;
        this.accounts = accountList;
    }
    
    public Customer(String name, Account account) {
        this.name = name;
        this.accounts.add(account);
    }
    
    public Customer (String name) {
        this.name = name;
    }
	
	public Customer() {
		
	}
	
	public boolean addAccount(Account account) {
		return this.accounts.add(account);
	}
	
	public boolean removeAccount(Account account) {
		if(accounts.contains(account)) {
			return this.accounts.remove(account);
		}
		
		return false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccountAtIndex(int index) {
		Account foundAccount = null;
		
		if(index > 0) {
			if(index < accounts.size()) {
				Account thisAccount = accounts.get(index);
				if(thisAccount != null) {
					foundAccount = thisAccount;
				}
			}
		}
		
		return foundAccount;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
}
