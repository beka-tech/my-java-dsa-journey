
package Swicth;

import java.util.Scanner;

public class day_inhanced  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Day (1-Mon, 2-Tue, 3-Wed, 4-Thu, 5-Fri): ");
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");

                System.out.print("Enter Time (hour, e.g. 9, 14, 18): ");
                int time = in.nextInt();

                switch (time) {
                    case 9:
                        System.out.println("Morning class");
                        break;

                    case 14:
                        System.out.println("Afternoon session");
                        System.out.print("Enter Minutes (e.g. 15, 30, 45): ");
                        int min = in.nextInt();

                        switch (min) {
                            case 15:
                                System.out.println("Just starting");
                                break;
                            case 30:
                                System.out.println("Halfway through");
                                break;
                            case 45:
                                System.out.println("Almost done");
                                break;
                            default:
                                System.out.println("No specific event at " + min + " minutes");
                        }
                        break;

                    case 18:
                        System.out.println("Evening session");
                        break;

                    default:
                        System.out.println("No event at this hour on Wednesday");
                }
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Wrong input or maybe weekend");
        }

        in.close();
    }
}
