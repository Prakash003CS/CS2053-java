import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine().toUpperCase();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("\n Employee Details ");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Age: " + age);

        System.out.println("\n Batch Employee IDs ");
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("ID " + (i+1) + ": " + args[i]);
            }
        } else {
            System.out.println("No IDs provided.");
        }

        sc.close();
    }
}
