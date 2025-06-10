public class CustomClass {


    static class Employee{
        int id;
        String name;

        public void getDetails(){
            System.out.println("ID is: "+ id);
            System.out.println("Name is: "+ name);
        }
    }

    public static void main(String[] args) {
        Employee Kishan = new Employee();
        Kishan.id = 12;
        Kishan.name = "Kishan";
        Kishan.getDetails();
    }
}