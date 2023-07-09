public class stringInJava {

    public static void main(String args[]) {
        // Notes to Remember for String
        // Strings : basically in java String is a class when you assign any value to
        // String type it creates Object of String in backend.
        // String s = "Vijay"; this string is called as immutable String if you want to
        // create String which can be changed you can use String Buffer or String
        // Builder :They create Mutable String
        // If you are creating two different String assigning the same value it will
        // generate only one Object of it (Remember)

        String name = "Vijay";
        int n = name.hashCode();

        char c = name.charAt(3);
        String w = name.concat(" Prajapati");
        String q = name.replace("y", "i");

        System.out.println(n);
        System.out.println(c);
        System.out.println(w);

        StringBuffer sb = new StringBuffer("Vijay");
        StringBuffer s = sb.append(" Prajapati");
        String r = sb.insert(6, "Sureshbhai ").toString();

        System.out.println(r);

        int I = 0;

        while (I <= 10) {

            if (I == 7) {
                continue;
            }
            System.out.println(I);

            I++;
        }
    }

}
