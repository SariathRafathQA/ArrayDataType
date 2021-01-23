package FirstPratice;

public class TryCatchDataType {
    public static void main(String[] args) {
        try {
            int myNUm = 60 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
