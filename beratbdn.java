import java.util.Scanner;

public class beratbdn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gender = scan.nextLine();
        double kg = scan.nextDouble();
        double cm = scan.nextDouble();
        cm = cm / 100;
        double bmi = kg / (cm * cm);
        if (gender.equalsIgnoreCase("Pria")) {
            String state = statuslaki(bmi);
            System.out.println(bmi + ", " + state);
        } else if (gender.equalsIgnoreCase("Wanita")) {
            String state = statuscewe(bmi);
            System.out.println(bmi + ", " + state);
        } else {
            System.exit(0);
        }
    }

    public static String statuslaki(double hasil) {
        String status = null;
        if (hasil < 20.5) {
            status = "Kurus";
        } else if (hasil >= 20.5 && hasil <= 26.99) {
            status = "Ideal";
        } else {
            status = "Gemuk";
        }
        return status;
    }

    public static String statuscewe(double hasil) {
        String status = null;
        if (hasil < 18.5) {
            status = "Kurus";
        } else if (hasil >= 18.5 && hasil <= 24.99) {
            status = "Ideal";
        } else {
            status = "Gemuk";
        }
        return status;
    }
}
