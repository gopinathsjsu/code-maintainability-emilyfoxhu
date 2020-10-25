abstract public class GumballMachine
{
    private int num_gumballs;
    private int cost;
    private int insertedMoney;

    public GumballMachine( int size, int cost )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = cost;
        this.insertedMoney = 0;
    }

    //abstract method to check if the client inserted the required type of coin into machine
    public abstract boolean checkInsertType(int coin);

    //check if the client has inserted correct type of coin, and calculate total inserted money
    public void insertCoin(int coin)
    {
        if (checkInsertType(coin)){
            this.insertedMoney += coin;
            System.out.println("You have inserted " + coin + " cents");
        } else {
            System.out.println("You have inserted an incorrect type of coin. Sorry, can't return your money.");
        }
    }

    //if the inserted money is enough for one gumball, the client can successfully get one. If the machine runs out of gumball, cannot return money.
    public void turnCrank()
    {
        if ( this.insertedMoney >= this.cost )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs--;
                this.insertedMoney -= this.cost;
                System.out.println( "Thanks for your coins. Gumball Ejected!" );
                System.out.println("Your remaining money is: " + this.insertedMoney);
            }
            else
            {
                System.out.println( "No More Gumballs! Sorry, can't return your money." );
            }
        }
        else
        {
            System.out.println( "Not enough for one gumball. Please insert more coin!" );
        }
    }
}