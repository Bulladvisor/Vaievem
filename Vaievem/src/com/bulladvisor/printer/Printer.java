package com.bulladvisor.printer;

public class Printer {

	//public boolean isOn;
		//public String modelNumber;
		
		private boolean isOn;
		private String modelNumber;
		
		public Printer (boolean isOn,String modelNumber){

	         this.isOn = isOn;
	         this.modelNumber = modelNumber ;
	    

	}

	    public void print(int copies){
	    	/*
		   System.out.println(isOn);
		   System.out.println(modelNumber);
		   print("I can call this");
		   */
	    	String onStatus = "";
	    	if(isOn)
	    		onStatus = "is On!";
	    	else
	    		onStatus = "is Off!";
	    	String textToPrint = modelNumber + onStatus ;
	    	
	    	//for ( int i = 0; i< copies ; i++)
	    	while(copies>0)
	    	
	    	{
	    		//if(isOn)
	        	//{
	        		//System.out.println(modelNumber + "is On!");
	    			System.out.println(textToPrint);
	    			copies--; //decrescer
	        	}
	        /*	else
	        	{
	        		System.out.println(modelNumber + "is Off!");
	        	}*/
	    	}
	    	/*
	    	switch(copies)
	    	
	    	{
	    	case 0 :
	    		break;
	    		
	    	case 1 :
	    		
	    	
	    	if(isOn)
	    	{
	    		System.out.println(modelNumber + "is On!");
	    	}
	    	else
	    	{
	    		System.out.println(modelNumber + "is Off!");
	    	}
	            break;
	    		
	    	
	    	
	case 2 :
	    		
	    	
	    	if(isOn)
	    	{
	    		System.out.println(modelNumber + "is On!");
	    		System.out.println(modelNumber + "is On!");
	    	}
	    	else
	    	{
	    		System.out.println(modelNumber + "is Off!");
	    		System.out.println(modelNumber + "is Off!");
	    	}
	            break;
	    	    default : System.out.println("Number of copies not support!");	
	    	
	    	}
	    	*/
	   // }
	    	public void printColors(){
	    		String[] colors = new String []{"red","blue","green","yellow","orange"};
	    				for(String currentColor : colors){
	    					if("green".equals(currentColor))
	    						continue;
	    						//break;
	    					System.out.println(currentColor);
	    				
	    	}
	    	
	}
	    private void print(String text){
	    //public void print(String text){
	    	System.out.println(text);
	    }
	    
	    public String getModelNumber(){
	    	return modelNumber;
	     }
	     
	}
