public class Main {
    public static void main(String[] args) {
        int number = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println("i: " + i + ", j: " + j + ", k: " + k + ", number: " + number);
                }
            }
        }
    }
}