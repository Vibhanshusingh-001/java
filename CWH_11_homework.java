import java.util.Scanner;
public class CWH_11_homework {
    public static void main(String[] args) {
        System.out.println("cbse calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your physics number");
        int physics= sc.nextInt();
        System.out.println("enter your chemistry number");
        int chemistry=sc.nextInt();
        System.out.println("enter your biology number");
        int biology= sc.nextInt();
        System.out.println("enter your hindi number");
        int hindi=sc.nextInt();
        float percentage=((physics+chemistry+biology+hindi)/400.0f*100);
        System.out.println(percentage);
    }
}