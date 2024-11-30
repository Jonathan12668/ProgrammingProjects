import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        String[] studentNames = {"Arnel", "Renz", "Perez", "Mhaye", "Quiño"};
        int[] studentScores = {89, 90, 95, 91, 93};

        Scanner sc = new Scanner(System.in);

        displayStudents(studentNames, studentScores);

        System.out.print("Enter the name of the student to update the score: ");
        String studentUpdate = sc.nextLine().trim();

        int index = findStudentIndex(studentNames, studentUpdate);

        if (index != -1) {
            System.out.print("Enter the updated score for " + studentUpdate + ": ");
            int newScore = sc.nextInt();
            studentScores[index] = newScore;
            displayStudents(studentNames, studentScores);
        } else {
            System.out.println("Student not found in the list.");
        }

        sc.close();
    }

    public static void displayStudents(String[] names, int[] scores) {
        System.out.println("\nUpdated Student List and Scores:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + scores[i]);
        }
    }

    public static int findStudentIndex(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }
}