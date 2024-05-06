import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the No. of Students : ");
        int n=s.nextInt();
        double arr[]=new double[n];
        System.out.println("Enter the marks of Students :");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextDouble();
        }
        System.out.println("Total Marks : "+StudentGradeCalculator.totalMarks(arr));
        System.out.println("Average Percentage : "+ (int) StudentGradeCalculator.averagePercentage(StudentGradeCalculator.totalMarks(arr), n)+" %");
        System.out.println("Total Marks : "+StudentGradeCalculator.grade(StudentGradeCalculator.averagePercentage(StudentGradeCalculator.totalMarks(arr), n)));
    }
    public static double totalMarks(double arr[]){
        double sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
        }
        return sum;
    }
    public static double averagePercentage(double p, int n){
        double avg=p/n;
        double percentage=(avg/p)*100;
        return percentage;
    }
    public static String grade(double percentage){
        if(percentage>80){
            return "A";
        }
        else if(percentage>60){
            return "B";
        }
        else if(percentage>40){
            return "C";
        }
        else{
            return "D";
        }
    }
}
