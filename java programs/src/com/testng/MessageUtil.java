package com.testng;

public class MessageUtil {
	   private String message;

	   // Constructor
	   // @param message to be printed
	   public MessageUtil(String message) {
	      this.message = message;
	   }

	   // prints the message
	   public String printMessage() {
	      System.out.println(message);
	      return message;
	   }

	   // add "Hi!" to the message
	   public String salutationMessage() {
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;
	     
	   }
	   public static void main(String[] args) {
		   MessageUtil msg= new MessageUtil("kamesh");
		   msg.printMessage();
		   msg.salutationMessage();
		   
	   }
	}