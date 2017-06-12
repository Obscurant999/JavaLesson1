/**
 * Created by kano on 11.06.17.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Задайте длину массива (от 1 до 100):");
        int arrayL = in.nextInt();
        if (arrayL <= 0) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else if (arrayL > 100) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else {
            ArrayInit array = new ArrayInit(arrayL);
            System.out.println("");
            System.out.println("Минимальное значение = " + array.getMinValue());
            System.out.println("");
            System.out.println("Максимальное значение = " + array.getMaxValue());



        }

    }
}
