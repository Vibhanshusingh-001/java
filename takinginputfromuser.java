import java.util.Scanner;
public class takinginputfromuser {
    public static void main(String[] args) {
        System .out.println("taking input from user");
        Scanner scan=new Scanner (System.in);
        System.out.println("enter the value of a");
        int a= scan.nextInt();
        System.out.println("enter the value of b");
        int b= scan.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
