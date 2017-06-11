/**
 * Created by kano on 11.06.17.
 */
import java.util.Random;

public class ArrayInit {


    ArrayInit(int arrayL) {
        int[] blackBox = new int[arrayL];
        Random random = new Random();
        System.out.println("Содержимое массива: ");
        for (int i = 0; i < blackBox.length; i++) {
            blackBox[i] = random.nextInt(999);
            System.out.print(blackBox[i] + ", ");
        }

        System.out.println("");

        int min = blackBox[0];
        for (int j = 0; j < blackBox.length; j++) {
            if (min > blackBox[j]) {
            min = blackBox[j];
            }

        }
        System.out.println("Наименьшее введенное число : " + min);

        int max = blackBox[0];
        for (int k = 0; k < blackBox.length; k++) {
            if (max < blackBox[k]) {
                max = blackBox[k];
            }
        }
        System.out.println("Наибольшее введенное число : " + max);


    }

}

