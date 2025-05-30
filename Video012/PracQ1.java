public class PracQ1 {
    public static void main(String[] args) {
        // result of 7/4*9/2
        // since operator precedance of * and / is same
        // Therefore left to right calculation will be done 
        // also as (integer / integer) is occuring answer will also be integer
        // which is the rule of associativity

        System.out.println(7 / 4 * 9 / 2);
        System.out.println(7.0 / 4 * 9.0 / 2);
    }
}