package files;

public class Verification {

    public static void dataVerification(String data) {
        if (data == null || data.isEmpty())
            throw new IllegalArgumentException("IllegalArgumentException: string not be empty");
    }

    public static void dataVerification(int data) {
        if (data <= 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }

    public static void dataVerification(Object[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("IllegalArgumentException: array must not be empty");
        }
    }

    public static void dataVerification(long data) {
        if (data < 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }
}
