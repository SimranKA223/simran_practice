package simran_practice;

import java.io.*;

class Yup implements Serializable{
	int i;
	String s;
	
	Yup(int i, String s){
		this.i=i;
		this.s=s;
	}
}



public class InterfaceSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		
		 try{    
			  //Creating the object    
			  Yup a = new Yup(11,"Simran");    
			  //serialization    
			  FileOutputStream fout=new FileOutputStream("file.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(a);        
			  //closing the stream    
			  out.close();    
			  System.out.println("success");    
			  }
		 catch(Exception e){
			 System.out.println(e);
			 }
		 
		 try{    
			 //de-serialization    
			 ObjectInputStream in=new ObjectInputStream(new FileInputStream("file.txt"));    
			 Yup b=(Yup)in.readObject();    
			 //printing the data of the serialized object    
			 System.out.println(b.i+" " + b.s);    
			 //closing the stream    
			 in.close();    
			 }
		 catch(Exception e){
			 System.out.println(e);
			 }    
			 
		
		
		
	}

}
