package CoeJava.projects.aadhar.pan.link;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        AadhaarService aadhaarService = new AadhaarService();
        PanService panService  = new PanService();


        System.out.println("Enter the aadhaar number !");
        String aadhaarNumber  = scanner.nextLine();

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);

     if(aadhaar!=null && pan!=null){
         System.out.println("Student aadhar details "+ aadhaar);
         System.out.println("Student pan details "+pan);
     }
     else{
        try{
            throw new Exception("Not Found Exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
     }
        System.out.println("Complete project");


    }
}