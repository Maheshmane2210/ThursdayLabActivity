package com.Question3;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setAccountNo(12345);		//to assign the value
		c.setBalance(2000.00);
		c.setName("Ankita Galgalikar");
		c.setWithdrwamt(1000);
		System.out.println("The customer details are \n"
				+c.getName()+"\n"+c.getAccountNo()+"\n "
				+c.getBalance()+"\n "		//get method to fetch value
			    +c.getWithdrwamt());
		
		
		Customer c2=new Customer();
		c2.setAccountNo(12345);
		c2.setBalance(30000.00);
		c2.setName("Vanitha");
		c2.setWithdrwamt(10000);
		System.out.println("The customer details are \n"
				+c2.getName()+"\n"+c2.getAccountNo()+"\n "
				+c2.getBalance()+"\n"+c2.getWithdrwamt());
		
				
	}


}
