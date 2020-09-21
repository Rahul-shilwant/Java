import java.util.*;

class Circle{

    private int r; 
    private double area , pie = 3.14;
    
    public void init(int r)
    {
        this.r = r;
    }
    public void calculateArea() 
    {
        area = pie *r*r;
    }
    void display()
    {
        System.out.println("Area of circle :" +area);
    }

}

class CircleDemo{

    public static void main(String[] args) {
    Circle c = new Circle();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius");
    int x = sc.nextInt();
    c.init(x);
    c.calculateArea();
    c.display();        

    }

}