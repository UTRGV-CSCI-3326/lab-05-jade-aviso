import java.util.Scanner;



public class Input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String P_Name;
        int P_Age;
        float P_Weight;
        boolean P_Smoker;


        //Prompt
        System.out.println("Welcome to Texas General. Please fill in the patient's information. ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        //name
        System.out.println("Please input patient's full name: ");
        P_Name = input.nextLine();

        //age
        System.out.println("Please input your age: ");
        P_Age = input.nextInt();

        //weight
        System.out.println("PLease input your weight(lbs): ");
        P_Weight = input.nextFloat();

        //smoker
        System.out.println("True or False: are you a current smoker or smoked in the past?: ");
        P_Smoker = input.nextBoolean();



        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        //output all info back to patient
        System.out.println("Patient Information");
        System.out.println("Patient Name: " + P_Name);
        System.out.println("Patient Age: " + P_Age);
        System.out.println("Patient Weight: " + P_Weight + " lbs");
        System.out.println("Smoker Status: " + P_Smoker);



    }
}
