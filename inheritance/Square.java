class Shape{
    public void printShape(){
        System.out.println("This is Shape");
    }
}
class Rectangle extends Shape{       //inheritance concept applied here
    public void printRec() {
        System.out.println("This is Rectangular shape");
    }
}
class Circle extends Shape{             //inheritance concept applied here
    public void printCircle(){
        System.out.println("This is a Circlular shape");
    }
}

public class Square extends Rectangle{           //inheritance concept applied here
    public void printSqu(){
        System.out.println("Square is a rectangle");
    }

    public static void main(String[] args) {
        Square Sq=new Square();
        Sq.printRec();     //class Square calls inherited method from Rectangle class
        Sq.printShape();    //class Square calls inherited method from Shape class

    }
}
