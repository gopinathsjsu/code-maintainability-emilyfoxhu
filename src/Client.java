public class Client {

    public static void runTest()
    {

        GumballMachine GumballMachine25C1Q = new GumballMachine25C1Q(3, 25);
        System.out.println("This is a test for the first Gumball Machine(Quarter is the only correct type of coin):");
        GumballMachine25C1Q.insertCoin(25);
        GumballMachine25C1Q.turnCrank();//Gumball Ejected
        GumballMachine25C1Q.insertCoin(25);
        GumballMachine25C1Q.insertCoin(25);
        GumballMachine25C1Q.turnCrank();//Gumball Ejected
        GumballMachine25C1Q.turnCrank();//Gumball Ejected
        GumballMachine25C1Q.insertCoin(5);//Incorrect type of coin. Sorry, can't return your money.
        GumballMachine25C1Q.insertCoin(25);
        GumballMachine25C1Q.turnCrank();//No More Gumballs! Sorry, can't return your money.

        GumballMachine GumballMachine50C2Q = new GumballMachine50C2Q(3, 50);
        System.out.println("\nThis is a test for the second Gumball Machine(Quarter is the only correct type of coin):");
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.turnCrank();//Gumball Ejected
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.turnCrank();//Not enough for one gumball. Please insert more coin!
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.turnCrank();//Gumball Ejected
        GumballMachine50C2Q.insertCoin(10);//Incorrect type of coin. Sorry, can't return your money.
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.turnCrank();//Gumball Ejected
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.insertCoin(25);
        GumballMachine50C2Q.turnCrank();//No More Gumballs! Sorry, can't return your money.

        GumballMachine GumballMachine50CAllCoins = new GumballMachine50CAllCoins(5, 50);
        System.out.println("\nThis is a test for the third Gumball Machine(Nickle/Dime/Quarter are the correct types of coin):");
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.turnCrank();//Gumball Ejected
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.insertCoin(10);
        GumballMachine50CAllCoins.insertCoin(10);
        GumballMachine50CAllCoins.insertCoin(5);
        GumballMachine50CAllCoins.turnCrank();//Gumball Ejected
        GumballMachine50CAllCoins.insertCoin(10);
        GumballMachine50CAllCoins.insertCoin(10);
        GumballMachine50CAllCoins.insertCoin(10);
        GumballMachine50CAllCoins.insertCoin(10);
        GumballMachine50CAllCoins.insertCoin(5);
        GumballMachine50CAllCoins.insertCoin(5);
        GumballMachine50CAllCoins.turnCrank();//Gumball Ejected
        GumballMachine50CAllCoins.insertCoin(100);//Incorrect type of coin. Sorry, can't return your money.
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.turnCrank();//Not enough for one gumball. Please insert more coin!
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.turnCrank();//Gumball Ejected    Your remaining money is: 25
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.turnCrank();//Gumball Ejected    Your remaining money is: 0
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.insertCoin(25);
        GumballMachine50CAllCoins.turnCrank();//No More Gumballs! Sorry, can't return your money.
    }

    public static void main(String[] args) {
        runTest();
    }
}
