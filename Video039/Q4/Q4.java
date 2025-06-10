public class Q4{

    static class Rectangle{
        int length;
        int breadth;

        public Rectangle(int length,int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public int area(){
            return length*breadth;
        }

        public int perimeter(){
            return 2*(length + breadth);
        }

    }


    public static void main(String args[]){
        Rectangle rt = new Rectangle(12, 23);

        System.out.println("Area :"+rt.area());
        System.out.println("Perimeter :"+rt.perimeter());
    }
}