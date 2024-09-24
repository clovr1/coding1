import java.util.Scanner;

public class awawa04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String dayName, dayType;
        System.out.print("Input day name: ");
        dayName = sc.nextLine().toLowerCase(); 
        
        if (dayName.equals("1") || dayName.equals("2") || dayName.equals("3") ||
            dayName.equals("4") || dayName.equals("5")) {
            dayType = "weekday";
        } else if (dayName.equals("6") || dayName.equals("7")) {
            dayType = "weekend";
        } else {
            dayType = "Invalid day name";
        }
        
        System.out.println(dayName + " is a " + dayType);
        sc.close();
    }
}
