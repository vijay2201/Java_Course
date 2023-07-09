class Pappa{
    public Pappa() {

        System.out.println("Pappa Class is Called");
    }
    public Pappa(int n) {
        System.out.println("Pappa Class is Called :"+n);
    }

    public void show(){
        System.out.println("Show method is called");
    }
}
class Beta extends Pappa{
    public Beta() {

        System.out.println("Beta Class is Called");
    }
    public Beta(int n) {
        this();
        System.out.println("Beta Class is Called : "+n);
    }
}
public class SuperAndThis {
    public static void main(String []args){

        new Pappa();
        new Pappa().show();//this called as anonymous Object
       // Beta b = new Beta(9);
    }
}
