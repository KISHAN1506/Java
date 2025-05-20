public class file {
    public static void main(String[] args) {
    // R = b + s → int
    // R = s + i → int
    // R = l + f → float
    // R = i + f → float
    // R = c + i → int
    // R = c + s → int
    // R = l + d → double
    // R = f + d → double
            // b → byte  f → float
            // s → short d → double
            // i → integer c → character
            // l → long

    // Increment and Decrement Operator:
    int i = 67;
    System.out.println(i++); // First i will be printed and then incremented
    System.out.println(i);
    System.out.println(++i); // First i will be incremented and then will be printed
    System.out.println(i);

    // Quick Quiz
    int y = 7;
    System.out.println(++y * 8);
 
    char var = 'c';
    System.out.println(++var);
    }
}