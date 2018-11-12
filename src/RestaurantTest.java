public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 20;
        dish.nameOfDish = "Fish a la fish";
        dish.wouldRecommend = false;


        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);
        dish.eat();
    }
}
