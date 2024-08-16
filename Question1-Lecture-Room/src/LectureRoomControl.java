/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP Elite Core-i5
 */
import java.util.Scanner;

public class LectureRoomControl {
    public static void main(String[] args) {
        LectureRoom room = new LectureRoom(); // Creating an instance of LectureRoom
        Scanner scanner = new Scanner(System.in); // Scanner for input

        while (true) {
            // Display the main menu
            System.out.println("\nMain Menu:");
            System.out.println("W: Add students");
            System.out.println("X: Remove students");
            System.out.println("Y: Turn on a light");
            System.out.println("Z: Turn off a light");
            System.out.println("Q: Quit");
            System.out.print("Enter your choice: ");
            char choice = scanner.next().toUpperCase().charAt(0); // Reading the user's choice

            switch (choice) {
                case 'W':
                    System.out.print("Enter the number of students to add: ");
                    int addStudents = scanner.nextInt();
                    room.addStudents(addStudents);
                    break;
                case 'X':
                    System.out.print("Enter the number of students to remove: ");
                    int removeStudents = scanner.nextInt();
                    room.removeStudents(removeStudents);
                    break;
                case 'Y':
                    System.out.print("Enter the light number to turn on (1-3): ");
                    int lightOn = scanner.nextInt();
                    room.turnOnLight(lightOn);
                    break;
                case 'Z':
                    System.out.print("Enter the light number to turn off (1-3): ");
                    int lightOff = scanner.nextInt();
                    room.turnOffLight(lightOff);
                    break;
                case 'Q':
                    System.out.println("Quitting the program. Goodbye!");
                    scanner.close();
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            // Display the current state of the lecture room after each operation
            room.displayRoomState();
        }
    }
}
