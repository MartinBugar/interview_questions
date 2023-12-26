public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int j : numbers) {
            System.out.print(j + " ");
        }

        System.out.println();  //new line
        bubbleSort(numbers); //sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
    }

    static void bubbleSort(int[] numbers) {
        int numbersLength = numbers.length;
        int temp = 0;
        for (int i = 0; i < numbersLength; i++) {
            for (int j = 1; j < (numbersLength - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    temp = numbers[j - 1]; //index of first element
                    numbers[j - 1] = numbers[j]; //second element goes to place of the first element
                    numbers[j] = temp; // first element goes to the place of the second element
                }

            }
        }

    }
}
