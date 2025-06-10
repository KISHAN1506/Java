public class Q2 {

    static class cellphone{
        public void ringing(){
            System.out.println("Ringing....");
        }
        public void vibrating(){
            System.out.println("Vibrating....");
        }
    }

    public static void main(String[] args) {
        cellphone cp = new cellphone();

        cp.ringing();
        cp.vibrating();
    }
}