public class fibNums {
    static int fib(int n){
        if (n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]){

        if (args.length > 0){
            try{
                int x = Integer.parseInt(args[0]);
                System.out.println(fib(x));

            }catch(NumberFormatException e){
                System.err.println("Argument " + args[0] + " must be an integer");
                System.exit(1);
            }
        }
        
    }
}
