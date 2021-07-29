import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("#1");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(mass));

        int pr = 1;
        int count = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] % 3 == 0){
                pr *= mass[i];
                count++;
            }
        }
        if (count == 0){
            pr = 0;
        }
        System.out.println("произведение элементов, кратных 3: " + pr);
    }
}
