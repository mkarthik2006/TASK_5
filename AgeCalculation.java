import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateStr);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        scanner.close();
    }
}