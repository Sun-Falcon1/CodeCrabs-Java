public class MethodBaese{
	public static void main(String[] args) {
	
		double result = Square(3); // variables declaration
		System.out.println(result);
		double qube = Cube(3); //call 
		System.out.println(qube);
		
		String name = getModelName("Boeing" , "Dreamliner");
		System.out.println(name);
	}

	//static method for Square operation
		static double Square(double Questionaire) {
			return Questionaire*Questionaire;
		}
		//static method for Cube Operation
		static double Cube(double Lava) {
			return Lava*Lava*Lava; 
			
		}
		static String getModelName(String first , String last) {
			return first+ " " + last ;
		}
}	
