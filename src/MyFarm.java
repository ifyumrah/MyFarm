public class MyFarm {
    public static void main(String[] args) {
        MyFarm fruit = new MyFarm();
    }

    public Plot[][] grid;

    public MyFarm() {
        System.out.println("hello from my farm");
        Plot P1 = new Plot();
//        P1.printPlot();
//        P1.sum();
        grid = new Plot[4][3];
        for (int x = 0; x < grid.length; x++) {
            for (int h = 0; h < grid[x].length; h++) {
                grid[x][h] = new Plot();
                grid[x][h].printPlot();
            }
        }

        //call methods here
        totalPlants();
        printPlantNames();
    }

    public void totalPlants() {
        int sum = 0;

        for (int s = 0; s < grid.length; s++) {
            for (int u = 0; u < grid[s].length; u++) {
                sum += grid[s][u].numberOfPlant;
            }
        }
        System.out.println(sum);
    }

    public void printPlantNames() {
        for (int x = 0; x < grid.length; x++) {
            for (int h = 0; h < grid[x].length; h++) {
                System.out.println("row:" + x + " column:" + grid[x][h].numberOfPlant + " " + grid[x][h].plantName);
            }
        }
    }
}