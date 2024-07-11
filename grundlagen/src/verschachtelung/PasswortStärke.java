package verschachtelung;

public class PasswortStärke {
    public static void main(String[] args) {
        String[] passwörter = {"Pass1234", "123456", "SchwachesPasswort"};

        for (String passwort : passwörter) {
            if (isStrong(passwort)) {
                System.out.println(passwort + " ist stark.");
            } else {
                System.out.println(passwort + " ist schwach.");
            }
        }
    }

    public static boolean isStrong(String password) {
        if (password.length() < 8) return false;

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) hasLetter = true;
            if (Character.isDigit(c)) hasDigit = true;

            if (hasLetter && hasDigit) return true;
        }
        return false;
    }
}
