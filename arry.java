
public class arry {

    public static void main(String[] args) {

        // Let's learn About Array

        int num[] = new int[3];

        num[0] = 1;
        num[1] = 2;
        num[2] = 6;
        System.out.println("Single Dimention array");
        for (int i1 = 0; i1 <= 2; i1++) {

            System.out.print(num[i1]);
            System.out.print(" ");
        }

        // Enhanced for Loop
        System.out.println("\nEnhanced For Loop");
        for (int l2 : num) {
            System.out.print(l2 + " ");
        }

        System.out.println("\nMulti Dimention array ");
        // Let's learn About Multi Dimension array

        int arr[][] = new int[3][4];

        for (int l1 = 0; l1 < 3; l1++) {
            for (int k1 = 0; k1 < 4; k1++) {
                arr[l1][k1] = k1;

                System.out.print(arr[l1][k1] + " ");
            }

            System.out.println(" ");
        }

        // for(int l = 0; l < 3;l++)
        // {
        // for(int k= 0;k< 4;k++)
        // {

        // System.out.print(arr[l][k]+" ");
        // }
        // System.out.println(" ");
        // }

        System.out.println("Enhanced for loop in Multi-dimentional Array");
        for (int l3[] : arr) {
            for (int l4 : l3) {
                System.out.print(l4 + " ");
            }
            System.out.println();
        }

        // Jagged Array : when we don't know the value of the column number or when we
        // want to give column number accroding to our requirement

        System.out.println("Example of Jagged array");

        int arr2[][] = new int[3][];

        arr2[0] = new int[2];
        arr2[1] = new int[2];
        arr2[2] = new int[3];

        for (int b[] : arr2) {
            for (int n : b) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        // Three dimentional array
        System.out.println("Example of three dimentional array");

        int arr4[][][] = new int[2][2][3];

        for (int p1 = 0; p1 < 2; p1++) {
            for (int p2 = 0; p2 < 2; p2++) {
                for (int p3 = 0; p3 < 3; p3++) {
                    arr4[p1][p2][p3] = (int) (Math.random() * 100);
                }

            }
        }

        for (int p1[][] : arr4) {
            for (int p2[] : p1) {
                for (int p3 : p2) {
                    System.out.print(p3 + " ");
                }
                System.out.println("");
            }
        }

        int k = 0;
        for(int i5 = 0 ; i5<=10;i5++){
         for(int j = 1;j<=i5+1;j++){
                System.out.println(i5+j);
         }
        }

    }

}
