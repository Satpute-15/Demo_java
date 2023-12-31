import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String> list=new ArrayList<String>();    
	      list.add("Sachin Tendulkar");    
	      list.add("Mahendra Dhoni");    
	      list.add("Rohit Sharma");    
	      list.add("Virat Kohli"); 
	      
	      Collections.sort(list,(e1,e2)->{  
	    	  
	    	  String [] e1Array =e1.split(" "); 
	    	  String [] e2Array =e2.split(" "); 

	    		  
	    	  
	    	  
	    	  return e2Array[1].compareTo(e1Array[1]);
	      });
	    	  
	      System.out.println(list);
		  System.out.println("This is ankit code");
		
	}

}
