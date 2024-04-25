package ShowroomManagementSystemProject;
import java.util.Scanner;
public class Custumers extends Showroom implements utility {
    String custumer_name;
    String custumer_address;
     int custumer_age;
    String custumer_car_name;
    int custumer_mobile_no;
    
    
    public void get_details() {
    	System.out.println("Custumer Name: " + custumer_name);
    	System.out.println("Address: " + custumer_address);
    	System.out.println("Age: "+ custumer_age);
    	System.out.println("Custumer Car Name:" + custumer_car_name);
    	System.out.println("Custumer Mobile No.:" + custumer_mobile_no);
    	
    }
    public void set_details() {
    	Scanner sc = new Scanner(System.in);
        System.out.println("___ENTER THE CUSTUMERS DETAILS___");
        System.out.println("");
        System.out.println("CUSTUMER NAME: ");
        custumer_name = sc.next();
        System.out.println("CUSTUMER ADDRESS: ");
        custumer_address = sc.next();
        System.out.println("CUSTUMER AGE: ");
        custumer_age = sc.nextInt();
        System.out.println("WHICH CAR PURCHES THE CUSTUMER: ");
        custumer_car_name =sc.next();
        System.out.println("CUSTUMER CONTACT NO: ");
        custumer_mobile_no = sc.nextInt();
     
    }
    
}
