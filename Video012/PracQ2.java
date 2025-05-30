
public class PracQ2 {
    public static void main(String[] args) {
        System.out.println("Enter Grade you want to encrypt:");
        char grade = 'B';
        System.out.print("Encrypted :");
        grade += 8;
        System.out.println(grade);

        System.out.print("Decrypted :");
        grade -= 8;
        System.out.println(grade);
    }
}