import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("#8");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(mass));

        int max = 0;
        int max3 = 0;
        for (int i = 0; i < mass.length; i++){
            if (max < mass[i]){
                max3 = max;
                max = mass[i];
            }
        }
        System.out.println(max3);
//
//        for (int i = 0; i < mass.length; i++){
//            if (mass[i] == max){
//                mass[i] = 0;
//            }
//        }

//        int max2 = mass[0];
//        for (int i = 0; i < mass.length; i++){
//            if (max2 < mass[i]){
//                max2 = mass[i];
//            }
//        }

//        System.out.println("2ой по величине макс-ый эл-нт в массиве: " + max2);
    }
}
