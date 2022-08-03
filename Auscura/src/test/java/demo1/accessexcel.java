package demo1;
	
	import java.io.IOException;
	import java.util.ArrayList;
    import Excel.datadriven;


	public class accessexcel {

		public static void main(String[] args) throws IOException {
			datadriven d = new datadriven();
	  
			ArrayList<String> data=d.getdata("Login");
			System.out.println(data.get(1));
			
	     	ArrayList<String> pass=d.getdata("Password");
	        System.out.println(pass.get(1));
	       
	    	ArrayList<String> datad=d.getdata("addnewuser");
	     	System.out.println(datad.get(5));  
	     	
	     	ArrayList<String> datadd=d.getdata("newuser");
	     	System.out.println(datadd.get(5));  
	     	System.out.println(datadd.get(3));  
	     	System.out.println(datadd.get(2));  
		}

	}

