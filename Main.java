import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        boolean a=true;
        int number;
        while(a){
            try {
                number=scanner.nextInt();
                System.out.println(number);

            }catch (Exception e){break;}

        }
        scanner.close();

    }
}