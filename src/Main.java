public class Main {
    public static void main(String[] args) {
        for (long l = 4946144450195624L; l > 0; l >>= 5) {
            System.out.print((char) (((l & 31 | 64) % 95) + 32));
        }
    }
}