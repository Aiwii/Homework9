//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1:");

        int[] monthlyPayment = {10000, 20000, 30000, 40000, 50000};

        int sum = 0;
        for (int i = 0; i < monthlyPayment.length; i++) {
            sum += monthlyPayment[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        System.out.println("Task 2:");
        int min = monthlyPayment[0];
        int max = monthlyPayment[0];

        for (int i = 0; i < monthlyPayment.length; i++) {
            if (monthlyPayment[i] < min) {
                min = monthlyPayment[i];
            }
            if (monthlyPayment[i] > max) {
                max = monthlyPayment[i];
            }

        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        //Task 3
        System.out.println("Task 3:");
        int average = (int) sum / monthlyPayment.length;
        System.out.println("Средняя сумма трат за месяц составляет " + average + " рублей.");

        //Task 4
        System.out.println("Task 4:");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;

            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
            }

            for (int i = 0; i < reverseFullName.length; i++) {
                System.out.print(reverseFullName[i]);
            }

        }
    }
