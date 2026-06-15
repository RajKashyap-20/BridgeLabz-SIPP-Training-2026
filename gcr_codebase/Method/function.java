package Method;
class xyz {
    static void print(){
        System.out.println("xyz");
    }

//    void print(){
//        System.out.println("print2");
//    }
}

public class function{
    public static void main(String [] args){
        xyz.print();
        xyz x=new xyz();
        x.print();
    }
}
