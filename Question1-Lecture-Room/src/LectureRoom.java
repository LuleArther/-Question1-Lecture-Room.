import java.util.Scanner;

// LectureRoom class manages students and lights in the lecture room
class LectureRoom {
    private int students;
    private boolean[] lights = new boolean[3]; // Three lights, initially all off

    // Constructor to initialize students and lights
    public LectureRoom() {
        students = 0;
        for (int i = 0; i < lights.length; i++) {
            lights[i] = false;
        }
    }

    // Method to add students to the lecture room
    public void addStudents(int number) {
        students += number;
        System.out.println(number + " students added. Total students: " + students);
    }

    // Method to remove students from the lecture room
    public void removeStudents(int number) {
        if (students >= number) {
            students -= number;
        } else {
            students = 0;
        }
        System.out.println(number + " students removed. Total students: " + students);
    }

    // Method to turn on a specific light
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }

    // Method to turn off a specific light
    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }

    // Method to display the current state of the lecture room
    public void displayRoomState() {
        System.out.println("Current students: " + students);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + " is " + (lights[i] ? "on" : "off"));
        }
    }
}