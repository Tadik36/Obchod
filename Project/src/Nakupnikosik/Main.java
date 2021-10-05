package Nakupnikosik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"rohlik","maslo","mleko","jogurt","parky","cibule","paprika "};
        int[] itemsCount = new int[items.length];
        int total = 0;

        for (int i = 0; i < itemsCount.length; i++) {
            System.out.println(i + 1 + " = " + items[i]);
        }

        System.out.format("%n" + "Zadejte položky" + "%n");

        int num = sc.nextInt();
        String s = Integer.toString(num);
        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }

        int[] choose;
        choose = intArray;

        for (int j = 0; j < choose.length; j++) {
            int k = choose[j];


            switch (k) {
                case 1:
                    total += 2;
                    itemsCount[0]++;
                    break;

                case 2:
                    total += 30;
                    itemsCount[1]++;
                    break;

                case 3:
                    total += 15;
                    itemsCount[2]++;
                    break;

                case 4:
                    total += 10;
                    itemsCount[3]++;
                    break;

                case 5:
                    total += 20;
                    itemsCount[4]++;
                    break;

                case 6:
                    total += 20;
                    itemsCount[5]++;
                    break;
                case 7:
                    total +=10 ;
                    itemsCount[6]++;
                    break;
                case 8:
                    total += 20;
                    itemsCount[7]++;
                    break;

                default:
                    System.out.println("Neznám zadanou položku");
                    break;
            }
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemsCount[i] + "x" + " " + items[i]);
        }
        System.out.format("%n" + "Total: " + total + " $");
    }
}