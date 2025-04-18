import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your Name");
        String name = sc.nextLine();
        System.out.println("Enter  your Age");
        int age = sc.nextInt();
        System.out.println("Enter  your Height");
        int height = sc.nextInt();
        System.out.println("Enter  your Weight");
        int weight = sc.nextInt();
        System.out.println(name+" "+age+" "+height+" "+weight);

    }
}
