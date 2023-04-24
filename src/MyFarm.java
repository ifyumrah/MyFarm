public class MyFarm {
    public static void main(String[] args) {
        MyFarm fruit = new  MyFarm();
    }
    public MyFarm(){
        System.out.println("hello from my farm");
        Plot P1 = new Plot();
        P1.printPlot();

        Plot[][] grid = new Plot [10][10];
        for (int x = 0; x < grid.length; x++) {
            for (int h = 0; h < grid[x].length; h++) {
            grid[x][h] = new Plot();
            grid[x][h].printPlot();
            }
        }
    }
}