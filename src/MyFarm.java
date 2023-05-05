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
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
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
                System.out.println("row:" + x + " column:" + h + " " + grid[x][h].plantName);
            }
        }
    }

    public void totalCarrots() {
        int carrots = 0;
        for (int k = 0; k < grid.length; k++) {
            for (int c = 0; c < grid[k].length; c++) {
                if (grid[k][c].plantName.equals("carrots")) {
                    carrots += grid[k][c].numberOfPlant;

                }
            }
        }
        System.out.println("the total carrots are " + carrots);
    }
    public void averageNumberOfPlants() {
        int sum = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int h = 0; h < grid[x].length; h++) {
                sum += grid[x][h].numberOfPlant;
            }
        } System.out.println(sum/grid.length);
    }
    public void numberOfTomatoPlots() {
        { int tomatoPlots = 0;
            for (int h = 0; h < grid.length; h++) {
                for (int k = 0; k < grid[h].length; k++) {
                    if (grid[h][k].plantName.equals("tomato")) {
//                        (tomatoPlots=grid[h].length/tomatoPlots+=grid[k].length);

                    }
                }
            }
            System.out.println("there are " + tomatoPlots + " plots with tomatoes");
        }
    }
}