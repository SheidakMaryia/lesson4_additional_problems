import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("#6");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(mass));

        int n = 0;
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length; j++){
                if (mass[i] == mass[j]){
                    n++;
                }
            }
        }
        if (n > x){
            System.out.println("есть повторяющиеся эл-ты в массиве");
        }else {
            System.out.println("все эл-ты в массиве различны");
        }

    }
}
