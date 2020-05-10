package com.practice.lambda;

public class RunnableLambdaExample {
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
//	  Runnable runnable = new Runnable() {
//	  
//	  @Override 
//	  public void run() { // TODO Auto-generated method stub
//		  System.out.println("Inside Runnable"); }
//	  
//	  };
//	  
//	  new Thread(runnable).start();
//	  
		  Runnable runnable = () ->{
			  System.out.println("Inside Runnable");
		  };
		  
		  new Thread(runnable).start();
		  new Thread(() -> {
			  System.out.println("Inside Runnable1");
			  System.out.println("Inside Runnable2");
			  }).start();
	  }
	 

}
