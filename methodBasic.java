package chapterbBase;
import java.util.Random;

public class GetSet{
	public static void main(String[] args) {
	String name = "Daniel Carvajal Ramos";
	int age = 30;
	
		HalaMadrid(name, age); //to call in the method , method consecutive must be static 
		
		}	
	
	static void HalaMadrid(String name, int age) {
		System.out.println("Cheer cheer Real Madrid");
		System.out.printf("Congratulations %s for the win at age of %d ", name , age);
		System.out.println("\nUCL number have just banged on!!");
	}
}	
