import java.util.Scanner;

public class StudentMarksManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        boolean dataEntered = false;
        int choice;

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║  Student Marks Management System   ║");
        System.out.println("╚════════════════════════════════════╝");

        do {
            System.out.println("\n┌─────────── MENU ───────────┐");
            System.out.println("│  1. Enter Marks             │");
            System.out.println("│  2. Display Marks           │");
            System.out.println("│  3. Find Total Marks        │");
            System.out.println("│  4. Find Average Marks      │");
            System.out.println("│  5. Find Highest Mark       │");
            System.out.println("│  6. Exit                    │");
            System.out.println("└─────────────────────────────┘");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Enter Marks for 5 Students ---");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Student " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    dataEntered = true;
                    System.out.println(" Marks entered successfully!");
                    break;

                case 2:
                    if (!dataEntered) { System.out.println(" Please enter marks first!"); break; }
                    System.out.println("\n--- Student Marks ---");
                    for (int i = 0; i < 5; i++)
                        System.out.println("Student " + (i + 1) + " : " + marks[i]);
                    break;

                case 3:
                    if (!dataEntered) { System.out.println(" Please enter marks first!"); break; }
                    int total = 0;
                    for (int m : marks) total += m;
                    System.out.println("\nTotal Marks: " + total);
                    break;

                case 4:
                    if (!dataEntered) { System.out.println(" Please enter marks first!"); break; }
                    int sum = 0;
                    for (int m : marks) sum += m;
                    System.out.printf("\nAverage Marks: %.2f%n", (double) sum / marks.length);
                    break;

                case 5:
                    if (!dataEntered) { System.out.println(" Please enter marks first!"); break; }
                    int highest = marks[0];
                    for (int m : marks) if (m > highest) highest = m;
                    System.out.println("\nHighest Mark: " + highest);
                    break;

                case 6:
                    System.out.println("\nExiting program. Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice! Please enter 1–6.");
            }
        } while (choice != 6);

        sc.close();
    }
}
