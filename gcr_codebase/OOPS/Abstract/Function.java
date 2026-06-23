package gcr_codebase.Abstract;
class Xyz{
    int a=10;
    void display(){
        System.out.println(a);
    }
}
class abc extends Xyz{
    int a=6;
//    void display(){
//        System.out.println(a);
//    }
}
public class Function {
    public static void main(String[] args) {
        abc a= new abc();
        a.display();
        System.out.println(a.a);
    }
}
