package bank;

import java.util.HashSet;

public class Bank {
    private static HashSet<Object> users = new HashSet<>();

    private static void addUser(Object user) {
        users.add(user);
    }

    private static TestUser francescoUser = new TestUser(10000);
    private static TestUser marioUser = new TestUser(50);


    public static void main(String[] args) throws Exception {
        addUser(francescoUser);
        addUser(marioUser);



        francescoUser.printBalance();
        francescoUser.addBalance(500);
        francescoUser.printBalance();
        francescoUser.subtractBalance(200);
        francescoUser.printBalance();

        marioUser.printBalance();
        marioUser.addBalance(100);
        marioUser.printBalance();

        francescoUser.calculateInterests(20);
    }   
    
}
