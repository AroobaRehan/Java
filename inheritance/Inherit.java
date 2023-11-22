class parent{
    public void print(){
        System.out.println("This is Parent Class");
    }
}

public class Inherit extends parent {
    public void printChild(){
        System.out.println("This is Child Class");
    }

    public static void main(String[] args) {
        parent P = new parent();
        Inherit In = new Inherit();

        P.print();
        In.printChild();
        In.print();
    }
}
