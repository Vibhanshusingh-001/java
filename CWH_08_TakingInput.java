import java.util.Scanner;
public class CWH_08_TakingInput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc=new Scanner(System.in);
        boolean b1 = sc.hasNext();
        System.out.println(b1);
    }
}
