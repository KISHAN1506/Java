public class Q3 {

    static class square{
        int side;

        public void setSide(int side){
            this.side = side;
        }
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    public static void main(String[] args) {
        square sq = new square();
        sq.setSide(5);
        System.out.println("Area :" + sq.area());
        System.out.println("Perimeter :" + sq.perimeter());

    }
}