public class Exam2 {
    public static void main(String[] args) {

        int 높이 = 3;

        for (int i = 1; i <= 높이; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
           for (int e = 2; e <= i; e++) {
               System.out.print("*");
           }
            System.out.println();
        }


        // 높이 : 3

        /*

         *

         ***

         *****

         */


        // 높이 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이 : 7

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */
    }
}
