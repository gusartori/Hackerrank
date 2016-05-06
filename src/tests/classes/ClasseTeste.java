package tests.classes;

public class ClasseTeste extends ClasseTeste2{

	public static void main (String args[]){
		String s1="I am Java Expert";
		 
		String s3="I am Java Expert";
		
		if (s1 == s3){
			System.out.println("it is ==");
		} else {
			System.out.println("it is !=");
		}
	}
	
	public ClasseTeste(){
		System.out.println("default");
	}

	
	public ClasseTeste(String st){
		System.out.println(st);
	}
}
