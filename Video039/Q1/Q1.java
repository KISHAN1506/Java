public class Q1 {

    static class Employee{
        int Salary;
        String name;
        public int getSalary(){
            return Salary;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }

    public static void main(String[] args) {
        Employee Kishan = new Employee();

        Kishan.setName("Kishan");
        System.out.println(Kishan.getName());
    }
}