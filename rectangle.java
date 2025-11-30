class Rectangle {
    int length, width;

    
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    Rectangle(int side) {
        length = width = side;
    }

    
    int area() {
        return length * width;
    }
}
public class rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5); // rectangle
        Rectangle r2 = new Rectangle(7);     // square

        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Area of Square: " + r2.area());
    }
}

