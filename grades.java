import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        
        int[] marks = new int[subjects];
        
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        double averagePercentage = (double) totalMarks / subjects;
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
           grade = 'F';
        }
        
        System.out.println("\nResults:\n");
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("\nAverage Percentage: " + averagePercentage);
        System.out.println("\nGrade: " + grade);
        
        scanner.close();
 }
}
