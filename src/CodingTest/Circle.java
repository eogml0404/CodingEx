package CodingTest;

public class Circle {
    int radius;
    String name;

    public Circle(){
        radius = 1;
        name = "";
    }
    public Circle(int r, String n){
        radius = r; name = n;
    }
    public double getArea(){
        return radius * radius * 3.14;
    }

    public Circle(int radius){
        this.radius = radius;
        name = "원";
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);


        Circle c[] = new Circle[5];
        for(int i=0; i<5; i++){

            c[i] = new Circle(i);
            System.out.println(c[i].name + ", 면적은 " + c[i].getArea() );

        }

    }
}
