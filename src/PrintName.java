import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        System.out.println("Enter the name of your person"  );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("name is "+name);
    }
}
