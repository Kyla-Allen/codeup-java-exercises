public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    //eat method
    public static void eat (){
        System.out.println("nom nom nom");
    }


    //CostinCents getter and setter
    public int getCost (){
        return this.costInCents;
    }

    public void setCostinDollars(int costInCents){
        this.costInCents =  this.costInCents / 100;
    }

    //nameofdish getter and setter
    public String getName (){
        return this.nameOfDish;
    }

    public void setName (String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    //recommned getter and setter
    public boolean getRecommend (){
        return this.wouldRecommend;
    }

    public void setRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }

    //Restuarant Dish Constructor
    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }


}
