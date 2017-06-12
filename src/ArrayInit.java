/**
 * Created by kano on 11.06.17.
 */
import java.util.Random;

public class ArrayInit {

    int blackBox[];

    ArrayInit(int arrayL) {
        blackBox = new int[arrayL];
        Random random = new Random();
        System.out.println("Содержимое массива: ");
        for (int i = 0; i < blackBox.length; i++) {
            blackBox[i] = random.nextInt(999);
            System.out.print(blackBox[i] + ", ");
        }
        System.out.println("");

    }

    int getMinValue() {
        int min = blackBox[0];
        for (int j = 0; j < blackBox.length; j++) {
            if (min > blackBox[j]) {
                min = blackBox[j];
            }

        }
        return min;

    }

    int getMaxValue() {
        int max = blackBox[0];
        for (int j = 0; j < blackBox.length; j++) {
            if (max < blackBox[j]) {
                max = blackBox[j];
            }

        }
        return max;

    }


}

