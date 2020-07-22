public class BonusMilesService {
    public int calculate(int price) {
        int amount = 20;
        int bonus = price / amount;

        return bonus;
    }
}
