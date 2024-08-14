package app.utils;

import java.util.Scanner;

public class NameValidator {

    public static String validateNameInput(Scanner scanner) {
        String str = scanner.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println(Constants.NAME_EMPTY_MSG);
            str = scanner.nextLine().trim();
        }
        return str;
    }
}
