import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử trong mảng");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử :");
        int x = scanner.nextInt();
        while (true) {
            try {
                System.out.println("Giá trị của phần tử có chỉ số 5 " + x + "là " + arr[x]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Chỉ số vượt quá giá trị của mảng");
            }main(args);
        }
    }
}