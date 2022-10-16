public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание 2.1");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей. %n", sum);
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание 2.2");
        int [] arr = generateRandomArray();
        int min = arr [0];
        int max = arr [0];
        int i = 0;
        while (i < arr.length) {
            if (arr [i] < min) {
                min = arr [i];
            } else if (arr [i] > max) {
                max = arr [i];
            }
            i++;
        }
        System.out.printf("Максимальная сумма трат за день составила %d рублей. %n", max);
        System.out.printf("Минимальная сумма трат за день составила %d рублей. %n", min);
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задание 2.3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
        }
        average = sum / arr.length;
        int tail = sum % arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %d рублей %d копеек. %n", average, tail);
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задание 2.4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            int elm = reverseFullName[i];
            System.out.printf("%c", elm);

        }

    }
}


