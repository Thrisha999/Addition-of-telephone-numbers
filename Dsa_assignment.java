import java.util.Scanner;

class Dsa_assignment
{
    public static void main(String args[]) {
        final int SIZE = 5;
        Scanner in = new Scanner(System.in);
        String names[] = new String[SIZE];
        long telNos[] = new long[SIZE];
        System.out.println("Enter " + SIZE + " names and telephone numbers");
        for (int i = 0;  i < SIZE; i++) {
            System.out.print("Enter Name: ");
            names[i] = in.nextLine();
            System.out.print("Enter telephone number: ");
            telNos[i] = in.nextLong();
            in.nextLine();
        }

        //Selection Sort
        for (int i = 0; i < SIZE - 1; i++) {
           // int min = i;
            for (int j = i + 1; j < SIZE; j++) {
              /*  if (names[j].compareToIgnoreCase(names[min]) < 0) {
                    min = j;
                }*/

            String temp = names[i];
            names[i] = names[j];
            names[j] = temp;

            long t = telNos[i];
            telNos[i] = telNos[j];
            telNos[j] = t;
        }
    }
        System.out.println("Name\tTelephone Number");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(names[i] + "\t" + telNos[i]);
        }
    }
}
