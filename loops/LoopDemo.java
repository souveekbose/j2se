/**
 * Program to demonstrate for loop
 */
public class LoopDemo {
    public static void main(String[] args) {

        /*System.out.println("This is a for loop: ");

        int i;
        for(i=2; i < 10; i+=2) {
            System.out.println("For: "+i);
        }*/

        /*System.out.println("This is a while loop: ");

        int j=1;
        while(j<=5) {
            System.out.println("While: "+j);
            j=j+1;
        }*/

        /*System.out.println("This is a do-while loop: ");

        int x = 3;

        do {
            System.out.println("Do-While : " + x );
            x++;
        }while( x <=5 );*/

        System.out.println("Enhanced For loop (For-Each loop): ");

        int[] nums = {1,2,3,4,5};

        for(int num : nums) {
            System.out.println("For-Each: "+num);
        }
    }
}