import java.util.Scanner;

public class resize_array {


        private static Scanner s = new Scanner(System.in);
        private static int[] baseData = new int[5];

        public static void main(String[] args) {
            System.out.println("Enter 5 integers:");
            getInput();
            printArray(baseData);
            resizeArray();
            //System.out.println("Enter 12 integers:");
            //getInput();
        baseData[5] = 67;
        baseData[6] = 34;
            printArray(baseData);

        }

        private static void getInput()
        {
            for(int i = 0; i < baseData.length; i++)
                baseData[i] = s.nextInt();
        }

        private static void printArray(int[] arr)
        {
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        private static void resizeArray()
        {
            int[] original = baseData;

            baseData = new int[7];
            for (int i = 0; i < original.length; i++)
                baseData[i] = original[i];
        }

    }


