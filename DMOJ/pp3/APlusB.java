import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];
        
        for(int i = 0; i < N; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            
            array[i] = a + b;
        }
        
        for(int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }
    }
}
