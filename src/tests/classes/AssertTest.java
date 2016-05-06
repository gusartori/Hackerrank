package tests.classes;

public class AssertTest {

	public static void main(String args[]){
		System.out.println("rodando");
		boolean algo = true;
		assert algo : "Erro de assert";
		System.out.println("finalizando");
	}
	
}
