import java.util.ArrayList;
import java.util.Random;

class every implements Comparable<every> {
    int num;

    public every(int num){
        this.num = num;
    }

    public int compareTo(every check){
        return num - check.num;
    }
    @Override
    public String toString(){
        return "" + num;
    }
}
public class sortGeneric {

    public static <E extends Comparable<E>> void bubble(ArrayList<E> n){
        for(int i= n.size() ; i >1; i --){
            for(int j =0; j < i-1; j ++){
                if (n.get(j).compareTo(n.get(j+1)) > 0){
                    E  temp = n.get(j);
                    n.set(j, n.get(j+1));
                    n.set(j+1, temp);
                    }
                }
        }      
    }

    public static <E extends Comparable<E>> void merge(ArrayList<E> arr){

        //separate into groups
        if(arr.size() <= 1){
            return;
        }

        int mid = arr.size() / 2;
        ArrayList<E> l = new ArrayList<>();
        ArrayList<E> r = new ArrayList<>();
        
        for(int i = 0; i < mid; ++i){
            l.add(arr.remove(0));
        }
        while(arr.size() != 0){
            r.add(arr.remove(0));
        }
        merge(l);
        merge(r);

        //put back together
        while(l.size() != 0 && r.size() != 0){
            if(l.get(0).compareTo(r.get(0)) < 0){
                arr.add(l.remove(0));
            } else {
                arr.add(r.remove(0));
            }
        }
        while(l.size() != 0){
            arr.add(l.remove(0));
        }
        while(r.size() != 0){
            arr.add(r.remove(0));
        }
    }

    public static <E extends Comparable<E>> void isSorted(ArrayList<E> a){
        for(int x = 0; x < a.size() - 1; ++x){
            if(a.get(x).compareTo(a.get(x + 1)) > 0){
                System.out.println("Not Sorted!");
                return;
            }
        }
        System.out.println("Sorted :)");
        return;
    }

    public static void main(String[] args) throws Exception{
        ArrayList<every> arrayList = new ArrayList<>();
        ArrayList<Float> arrayListF = new ArrayList<>();
        Random rand = new Random();
        for(int x = 0; x < 100; x++ ){
            arrayList.add(new every(rand.nextInt(100)));
        }
        
        System.out.println(arrayList.toString());
        isSorted(arrayList);
        merge(arrayList);
        System.out.println("\n" + arrayList.toString());
        isSorted(arrayList);
        System.out.println("ints\n");

        for(int x = 0; x < 100; x++ ){
            arrayListF.add(rand.nextFloat(100));
        }

        System.out.println(arrayListF.toString());
        isSorted(arrayListF);
        merge(arrayListF);
        System.out.println("\n" + arrayListF.toString());
        System.out.println("floats");
        isSorted(arrayListF);


    }
}
