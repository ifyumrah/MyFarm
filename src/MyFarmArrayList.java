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
        printPlantNames();
        addSunflower();
        printPlantNames();
        addCorn();
        printPlantNames();
        tomatoLocations();
        totalCarrots();
        averageNumberOfPlants();
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
    public void printPlantNames(){
        for(int k = 0; k<row.size(); k++){
            System.out.print(k + " : " + row.get(k).plantName +" \t");
        }
        System.out.println();
    }
    public void addSunflower(){
        Plot sunflower = new Plot();
        sunflower.numberOfPlant = 42;
        sunflower.plantName = "sunflower";
        sunflower.needsWater = true;
        sunflower.printPlot();
        row.add(sunflower);
    }
    public void addCorn() {
        Plot corn = new Plot();
        corn.numberOfPlant = 70;
        corn.plantName = "corn";
        corn.needsWater = false;
        corn.printPlot();
        row.set(3, corn);
    }
    public void tomatoLocations() {
        for (int m = 0; m < row.size(); m++) {

            if (row.get(m).plantName.equals("tomato")) {
                System.out.println(m);
            }
        }
    }
    public void totalCarrots(){
        int carrots = 0;
        for(Plot b : row) {
            if (b.plantName.equals("carrots")) {
                carrots += b.numberOfPlant;
            }
        }
        System.out.println("the total carrots is " + carrots);
    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int sum = 0 ;
                for(Plot a : row){
                    sum += a.numberOfPlant;
                }
                System.out.println(sum / row.size());
    }

    public void numberOfCarrotPlots() {
        int carrotPlots = 0;
        // how many plots have carrots on them
// call printPlantNames() method to check
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
// call printPlantNames() method to check
    }

}
