public class BonusMilesService {
    int miles;
    int price = 10_000;

    public int calculate(int a) {
        miles = price / 20;
        return miles;
    }
}
