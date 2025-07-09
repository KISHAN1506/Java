
class MyEmployee {
    private String name;
    // private int ID;

    public void setName(String name){
        this.name = name;
    }
    public void getName() {
        System.out.println(name);
    }
}

public class Access_Modifiers {

    public static void main(String[] args) {
        MyEmployee kishan = new MyEmployee();
        // kishan.name = "Kishan";
        // kishan.ID = 1232;

        // System.out.println("name = " + kishan.name + " and ID = " + kishan.ID);
        kishan.setName("Kishan Agarwal");
        kishan.getName();
    }
}
