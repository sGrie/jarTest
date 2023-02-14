import java.util.Scanner;

public class conversionApp{
    public static double lbs_kg(double x){
        x *= 0.453592;
        return x;
    }

    public static double mi_km(double x){
        x *= 1.60934;
        return x;
    }

    public static double oz_g(double x){
        x *= 28.3495;
        return x;
    }
    
    public static double gal_liter(double x){
        x *= 3.78541;
        return x;
    }


    public static void main(String[] args){
       // Scanner scnr = new Scanner(System.in);

        int y = 1;
        do{
            Scanner scnr = new Scanner(System.in);
            System.out.println("-1 to exit");
            System.out.print("What unit are you inputing?  ");
            String unit_in = scnr.nextLine();

            if(unit_in.equals("-1")){
                break;
            }

            System.out.print("What unit are you converting to?  ");
            String unit_out = scnr.nextLine();

            System.out.print("How many " + unit_in + "?  ");
            double num = scnr.nextDouble();



            if(unit_in.equalsIgnoreCase("mi")){
               System.out.println(mi_km(num) + " " + unit_out);
            } else if(unit_in.equalsIgnoreCase("lbs")){
                System.out.println(lbs_kg(num) + " " + unit_out);
            } else if(unit_in.equalsIgnoreCase("oz")){
                System.out.println(oz_g(num) + " " + unit_out);
            } else if(unit_in.equalsIgnoreCase("gal")){
                System.out.println(gal_liter(num) + " " + unit_out + "s");
            } else{
                System.out.println("invalid input.  try again");
            }
            System.out.println(" ");
        } while (y == 1);
    }

        
}