public class BurgerTester {

    public static void main(String[] args) {
        BurgerTools burgerbob = new BurgerTools("bacon", 125);
        burgerbob.grill();
        System.out.println(burgerbob.mostPopularTopping);
    }
}
