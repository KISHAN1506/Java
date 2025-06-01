

public class file {
    public static void main(String[] args) {
        String name = "Kishan";
        System.out.println(name.toLowerCase());
        
        System.out.println(name.toUpperCase());

        String name2 = "     Kishan      ";
        System.out.println(name2);
        System.out.println(name2.trim());

        String name3 = "Kishan Agarwal";
        System.out.println(name3.substring(3));

        String name4 = "Kishan Agarwal";
        System.out.println(name4.substring(3,10));

        String name5 = "Kishan Agarwal";
        System.out.println(name5.substring(3,10));


        String name6 = "Kishan Agarwal";
        System.out.println(name6.replace('a','c'));

        System.out.println(name6.replace("han","kjdkhskjdfj"));
        System.out.println(name6.replace("a","kjdkhskjdfj"));



        String name7 = "Kishan Agarwal";
        System.out.println(name7.charAt(3));

        System.out.println(name7.indexOf("an"));

        System.out.println(name7.indexOf("sh",2));

        System.out.println(name7.lastIndexOf("a"));

        System.out.println(name7.lastIndexOf("a",3));


        System.out.println(name7.equals("Kishan Agarwal"));
        System.out.println(name7.equals("Kishan AGarwal"));
        

        System.out.println(name7.equalsIgnoreCase("Kishan AGarwal"));

        System.out.println("hello \t \' \" \\ \f");

        System.out.println("Hello\b\bworld");

        System.out.print("Hello World\rJava ");



    }
}