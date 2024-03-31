import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        PersonDetails personDetails=new PersonDetails(firstName,lastName);
        System.out.println("Full Name is :"+personDetails.getFullName());
    }
}