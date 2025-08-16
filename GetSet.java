package chapterbBase;

class Student {
   public int roll_no;
   public String name;
   
   Student (int roll_no, String name){
	   this.roll_no = roll_no;
	   this.name = name ;   
   }
}

public class GetSet{
	public static void main(String[] args) {
		Student[] arr = new Student[5]; //array declaration and initialization 
		
		//array inputs 
	arr[0] = new Student(1, "Surya");
	arr[1] = new Student(1, "Einstein");
	arr[2] = new Student(2, "Macbeth");
	arr[3] = new Student(3, "Jordan");
	arr[4] = new Student(4, "Mickey mouse");
	
	//loop for accessing the elements 
	for(int i =0; i<arr.length; i++) {
		System.out.println("AT INDEX " + i + "Student id is"+ arr[i].roll_no +"name is " + arr[i].name+ " ");
	}
	}
}