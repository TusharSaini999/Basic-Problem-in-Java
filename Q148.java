///WAP to print ASCII table
class Q148{
    public static void main(String[] args) {
        System.out.println("ASCII Table:");
        System.out.println("----------------------------");
        System.out.println("Char ASCII");

        for (int i = 0; i <= 127; i++) {
            System.out.println(i + "\t" + (char)i);
        }
    }
}