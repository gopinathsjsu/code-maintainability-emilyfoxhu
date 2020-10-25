public class GumballMachine50CAllCoins extends GumballMachine{

    public GumballMachine50CAllCoins(int size, int cost) {
        super(size, cost);
    }

    @Override
    public boolean checkInsertType(int coin){
        return coin == 5 || coin == 10 || coin == 25; //return true if coin is a nickel, dime or quarter
    }
}
