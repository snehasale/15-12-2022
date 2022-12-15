import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number:");
        int no = sc.nextInt();
        if(no > 0){
           while(no !=0){
               no /=10;
               count++;
           }
        }else {
		System.out.println("Input a positive number.");
        }
        System.out.println("Number of digits:"+count);
    }
}