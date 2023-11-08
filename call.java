public class call{
    public static void main(String args[]) {
        A myobj=new A();
        myobj.calculate();
        myobj.add();
        myobj.interfacetest();
        
    }
}

class D{
    int a=5;
    int b=10;
    
    public void add(){
        int result=a+b;
        System.out.println(result);

    }
}
class C extends D{
    public static void display(){
        System.out.println("this is class B");
    }
}
class B extends C{
    public void calculate(){
        int c=5;
        int d=20;
        int result=d-c;
        System.out.println(result);
    }
}

    interface E {
   void interfacetest();
} 

class A extends B implements E{
    public  void show() {
        System.out.println(a+b);
        
    }
    
    public void interfacetest(){
    
    System.out.println("This is Interface's method");
    }
}
 
    

