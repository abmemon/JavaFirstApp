import java.time.LocalDate;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        int id = 9;
        String str = "EmpID";
        double salary = 22.0;
        System.out.println(str + " " + id + "; Salary: " + salary);
        System.out.println("Addition" + Add(1,2));
        System.out.println("Subtract" + Subtract(1,2));
        System.out.println("Multiplication" + Multiply(1,2));
        System.out.println("Division" + Divide(1,2));
        LocalDate dob = LocalDate.parse("2022-03-19");  
        System.out.println("DOB: " + dob + "; Age: " + calculateAge(dob) + " years!");
    }

    // Addition
    public static int Add(int a, int b) {
            return a + b ;
    }

    // Subtraction
    public static int Subtract(int a, int b) {
        return a - b ;
    }

    // Multiplication
    public static int Multiply(int a, int b) {
        return a * b ;
    }

    // Division
    public static float Divide(int a, int b) {
        return (float) a/b;
    }

    // Calculate Age
    public static int calculateAge(LocalDate dob) {  
        LocalDate curDate = LocalDate.now();  
        
        if ((dob != null) && (curDate != null)) {  
            return Period.between(dob, curDate).getYears();  
        }
        else {  
            return 0;  
        }  
    }
}  
