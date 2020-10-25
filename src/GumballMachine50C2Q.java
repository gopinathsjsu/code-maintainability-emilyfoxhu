public class GumballMachine50C2Q extends GumballMachine{

    public GumballMachine50C2Q(int size, int cost) {
        super(size, cost);
    }

    @Override
    public boolean checkInsertType(int coin) {
        return coin == 25;//return true if coin is a quarter
    }
}
