package com.revature;



import com.revature.ws.MessageGen;
import com.revature.ws.MessageGenService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageGenService msgen = new MessageGenService();
		MessageGen msport = msgen.getMessageGenImplPort();
		System.out.println(msport.getMessage());
		
		
	}

}