package semester1.practice06;

public class Task_32 {
    public static void main(String[] args) {
        SmartDoorLock lock = new SmartDoorLock();

        lock.enterPin(1111);
        lock.enterPin(2222);
        lock.enterPin(3333);
        lock.enterPin(1234);
    }
}

class SmartDoorLock {
    private int pinCode = 1234;
    private boolean isLocked = true;
    private int failedAttempts = 0;

    public void enterPin(int enteredPin) {
        if (failedAttempts >= 3) {
            System.out.println(
                    "СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону."
            );
            return;
        }

        if (enteredPin == pinCode) {
            isLocked = false;
            failedAttempts = 0;
            System.out.println("Замок відчинено.");
        } else {
            failedAttempts++;
            System.out.println("Неправильний PIN-код.");

            if (failedAttempts >= 3) {
                System.out.println(
                        "СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону."
                );
            }
        }
    }
}