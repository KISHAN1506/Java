

public class Q6 {

    static class Circle{
        float radius;
        public float area(){
            return 3.14f * radius * radius;
        }

        public float perimeter(){
            return 2 * 3.14f * radius;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 3.12f;
        System.out.println("Perimeter : " + c.perimeter());
        System.out.println("Area : " + c.area());

    }
}