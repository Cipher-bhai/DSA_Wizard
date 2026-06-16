package OOps;

public class Inheritance {
    
    public void  show(){
     System.out.println("Parent class");
    }

}

class B extends Inheritance{
    public void show(){
        System.out.println("B class as child of Parent Inheritance");
    }

}

class C extends B{

    public void show(){
        System.out.println("C class as child of class C");
    }


public static void main(String[]args){ 
    Inheritance obj=new C();
    obj.show();
}
}