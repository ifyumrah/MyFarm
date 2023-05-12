public class MyFarm {
//    public static void main(String[] args) {
//        MyFarm fruit = new MyFarm();
//    }

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
        numberOfEmptyPlots();
        plotWithMaxNumber();
        plantWithMaxNumber();
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
        }
        System.out.println(sum / grid.length);
    }

    public void numberOfTomatoPlots() {
        int tomatoPlots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantName.equals("tomato")) {
                    System.out.println("found tomato");
                    tomatoPlots += 1;
                }
            }
        }
        System.out.println("there are " + tomatoPlots + " plots with tomatoes");

    }

    public void numberOfEmptyPlots() {
        int emptyPlot = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantName.equals("empty")) {
                    System.out.println("empty plot");
                    emptyPlot += 1;
                }
            }
        }
        System.out.println("there are " + emptyPlot + " empty plots");
    }

    public void plotWithMaxNumber() {
        int max = grid[0][0].numberOfPlant;
        String name = grid[0][0].plantName;
        for (int x = 0; x < grid.length; x++) {
            for (int h = 0; h < grid[x].length; h++) {
                if (grid[x][h].numberOfPlant > max) {
                    max += grid[x][h].numberOfPlant;
                    name = grid[x][h].plantName;
                }
            }
        }
        System.out.println(name + " plot has the most plants with " + max + " plants");
    }

    public void plantWithMaxNumber() {
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int h = 0; h < grid[x].length; h++) {
                switch (grid[x][h].plantName) {
                    case "corn":
                        numCorn += grid[x][h].numberOfPlant;
                        break;
                    case "sunflower":
                        numSunflower += grid[x][h].numberOfPlant;
                        break;
                    case "tomato":
                        numCarrot += grid[x][h].numberOfPlant;
                        break;
                    default:
                        numCarrot += grid[x][h].numberOfPlant;
                        break;
                }
            }
        }

        if (numCorn > numCarrot && numCorn > numSunflower && numCorn > numTomato) {
            System.out.println("corn has the most plants with " + numCorn + " plants");
        }
        if (numTomato > numCarrot && numTomato > numSunflower && numTomato > numCorn) {
            System.out.println("tomat has the most plants with " + numTomato + " plants");
        }
        if (numCarrot > numCorn && numCarrot > numSunflower && numCarrot > numTomato) {
            System.out.println("carrot has the most plants with " + numCarrot + " plants");
        }
        if (numSunflower > numCorn && numSunflower > numCarrot && numSunflower > numTomato) {
            System.out.println("sunfllwoer has the most plants with " + numSunflower + " total plants");
        }
    }
}