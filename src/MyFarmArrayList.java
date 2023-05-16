import java.util.ArrayList;

public class MyFarmArrayList {
   public ArrayList<Plot> row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList(){
        System.out.println("my farm using array list");

        arr[0] = new Plot();

        for (int p = 0; p<10; p++){
            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
        row.add(new Plot());
        System.out.println(row.size());
    }
    public class Main {
        public static void main(String[] args) {
            ArrayList<String> fruit = new ArrayList<String>();
            fruit.add("elderberry");
            fruit.add("kiwi");
            fruit.add("watermelon");
            fruit.add("grapefruit");
            System.out.println(fruit);
        }
    }


}
