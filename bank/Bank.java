package bank;

import java.util.HashSet;

public class Bank {
    private static HashSet<Object> users = new HashSet<>();

    private static void addUser(Object user) {
        users.add(user);
    }

    private static TestFrancesco francescoUser = new TestFrancesco(10000);
    private static TestMario marioUser = new TestMario(50);


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
