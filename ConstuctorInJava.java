public class ConstuctorInJava {

    public String name;
    public int age;

    public ConstuctorInJava() {

    }

    public ConstuctorInJava(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("Name : "+name+" Age : "+age );
    }


    public static void main(String []args){

        ConstuctorInJava CIN = new ConstuctorInJava("Vijay",23);


    }
}
