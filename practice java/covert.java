public class covert {
    public double lbs_kg(double x){
        x *= 0.453592;
        return x;
    }

    public double mi_km(double x){
        x *= 1.60934;
        return x;
    }

    public double oz_g(double x){
        x *= 28.3495;
        return x;
    }
    
    public double gall_liter(double x){
        x *= 3.78541;
        return x;
    }

*/
    public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner(System.in);

        System.out.print("What unit are you inputing?  ");
        String unit_in = scnr.nextLine();

        System.out.print("What unit are you converting to?  ");
        String unit_out = scnr.nextLine();

        System.out.println("How many " + unit_in + "s?  ");
        double num = scnr.nextDouble();
        scnr.close();

        System.out.println(unit_in + unit_out + num);

    }
    
}
