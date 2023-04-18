import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Lab1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Debe proporcionar el nombre del archivo como argumento.");
            return;
        }

        String fileName = args[0];
        ArrayList<Integer> nums = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                nums.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo " + fileName);
            return;
        }

        double mean = mean(nums);
        System.out.println("La media aritmética es: " + mean);
    }

    private static double mean(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.size();
    }
}