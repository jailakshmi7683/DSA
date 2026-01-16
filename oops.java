//Inheritance and Polymorphism

class Shapes {
    public void area(){
        System.out.println("Displays area");
    }
}

class rectangle extends Shapes { //Hierachical Inheritance
    @Override
    public void area(){ //Runtime Polymorphism
        System.out.println("Displays area of Rectangle");
    }

    public void area(int length, int breadth){ //Compile Time Polymorphism
        int Area = length * breadth;
        System.out.println("Area of Rectangle: " + Area);
    }
}

class Square extends rectangle { // Multilevel Inheritance
    @Override
    public void area(){ //Runtime Polymorphism
        System.out.println("Displays area of Square");
    }

    int side;
    public void area(int side){ //Compile Time Polymorphism
        int Area = side * side;
        System.out.println("Area of Square: " + Area);
    }
}

class Circle extends Shapes { //Hierachical Inheritance
    @Override
    public void area(){ //Runtime Polymorphism
        System.out.println("Displays area of circle");
    }


    public void area(int radius){    //Compile Time Polymorphism
        float Area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + Area);
    }
}

public class oops {   

    public static void main(String[] args) {
        
        Shapes sh1 = new rectangle();
        sh1.area();
        rectangle sh2 = new rectangle();
        sh2.area(4,5);


        Square sq = new Square();
        sq.area(5);
        sq.area(4, 6);

        Circle cir = new Circle();
        cir.area(7);
    } 
}
