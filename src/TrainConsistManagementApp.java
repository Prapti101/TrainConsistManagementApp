import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainValidationApp {

    public static boolean validateTrainId(String trainId) {
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Matcher trainMatcher = trainPattern.matcher(trainId);
        return trainMatcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        return cargoMatcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        boolean isTrainValid = validateTrainId(trainId);
        boolean isCargoValid = validateCargoCode(cargoCode);

        if (isTrainValid) {
            System.out.println("Train ID is Valid");
        } else {
            System.out.println("Train ID is Invalid");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is Valid");
        } else {
            System.out.println("Cargo Code is Invalid");
        }

        sc.close();
    }
}