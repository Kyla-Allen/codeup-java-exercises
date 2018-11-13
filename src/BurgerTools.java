public class BurgerTools {
    public String mostPopularTopping;
    public int temperatureWhenCooked;

    public static void grill(){
        System.out.println("Grilling Burger....");
    }

    public BurgerTools (String mostPopularTopping, int temperatureWhenCooked){
        this.mostPopularTopping = mostPopularTopping;
        this.temperatureWhenCooked = temperatureWhenCooked;
    }

//    String mostPopularTopping;
//    int temperatureWhenCooked;
}