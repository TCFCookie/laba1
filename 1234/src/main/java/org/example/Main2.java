
package org.example;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 41, 44, 45, 49, 51, 56, 59}; //массив
        System.out.println("элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] % 2 == 0)
                {
                    sum = sum + numbers[i];
                }else{

                    count = count + 1;
                }
        }
        System.out.println("Четные " + sum);
        System.out.println("нечетные " + count);

        }


}