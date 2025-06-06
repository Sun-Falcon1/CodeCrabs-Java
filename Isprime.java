import java.util.Scanner;
public class Isprime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter a number : ");
        int number = input.nextInt();

        if(number <=1){
            System.out.println("Not prime");
            return;
        }
        for(int i = 2 ; i<= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(" Not Prime");
                return;
            }
        }
        System.out.println(" Prime");
    }
}

