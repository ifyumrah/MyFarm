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
//            a.printPlot();
        }
        row.add(new Plot());
        System.out.println(row.size());
        totalPlants();
    }

//    public class Main {
//        public static void main(String[] args) {
//            ArrayList<String> fruit = new ArrayList<String>();
//            fruit.add("elderberry");
//            fruit.add("kiwi");
//            fruit.add("watermelon");
//            fruit.add("grapefruit");
//            fruit.remove(0);
//            System.out.println(fruit);
//        }
//    }
    public void totalPlants() {
        int total = 0;
        for(Plot a : row){
            total+= a.numberOfPlant;
        }
        System.out.println("total plants in my farm is " +total);
    }


}
