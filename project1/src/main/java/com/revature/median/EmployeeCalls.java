package com.revature.median;

import com.revature.doa.TransactionDoa;

//Class for testing purposes
public class EmployeeCalls {
	
	public static void main(String[] args) {
		TransactionDoa td = new TransactionDoa();
		System.out.println("10076: " + td.getTransactionByEmployeeId("10009"));
		
	}
	
}
