public class GumballMachine25C1Q extends GumballMachine{

    public GumballMachine25C1Q(int size, int cost) {
        super(size, cost);
    }

    @Override
    public boolean checkInsertType(int coin) {
        return coin == 25;//return true if coin is a quarter
    }
}
