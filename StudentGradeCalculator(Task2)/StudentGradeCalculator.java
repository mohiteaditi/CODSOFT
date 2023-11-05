import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator");
        System.out.println();
        System.out.print("Enter the number of the subjects: ");
        int numSubjects = scanner.nextInt();
        System.out.print("Enter the Maximum Marks: ");
        int maximumMarks = scanner.nextInt();
        
        System.out.println();
        int totalMarks = 0;
        for(int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject "+ i+" (out of "+ maximumMarks+")" + " : ");
            int marks = scanner.nextInt();
            totalMarks += marks;
       }
        int TotalMaximumMarks = maximumMarks * numSubjects;
        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if(averagePercentage >= 90) {
            grade = "O";
        } else if(averagePercentage >= 80) {
            grade = "A";
        } else if(averagePercentage >= 70) {
            grade = "B";
        } else if(averagePercentage >= 60) {
            grade = "C";
        } else if(averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println();
        System.out.println("Here is your Grade Card");
        System.out.println();
        System.out.println("*************************************************************");
        System.out.println(" Your Total Marks is: " + totalMarks+"/"+TotalMaximumMarks);
        System.out.println(" Your Average Percentage is: " + averagePercentage+"%");
        System.out.println(" Your grade Grade is : " + grade);
        System.out.println("*************************************************************");

        scanner.close();
    }
}