package Objects;

import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    //private String password;
    private int passwordLength;

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        random = new Random();
    }

    public String createPassword() {
        int i = 0;
        String password ="";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        while (i < this.passwordLength) {
            password = password + "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(letters.length()));
            i++;
        }
        return password;
    }
}
