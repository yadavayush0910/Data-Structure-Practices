
import java.util.Scanner;



public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if((num & 1) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
