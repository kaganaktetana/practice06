package semester1.practice06;

public class Task_25 {
    public static void main(String[] args) {
        SecretVault vault = new SecretVault();

        // Помилка компіляції:
        // vault.secretCode = "hacked";
        // secretCode has private access in SecretVault

        System.out.println(vault.verifyCode("Pass123"));
        System.out.println(vault.verifyCode("hacked"));
    }
}

class SecretVault {
    private String secretCode = "Pass123";

    public boolean verifyCode(String attempt) {
        return secretCode.equals(attempt);
    }
}