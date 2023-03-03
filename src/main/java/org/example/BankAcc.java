package org.example;
import java.util.logging.*;
public class BankAcc{
    String s;
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private final String accholderName;

    private long accNumber;
    private long balance;
    BankAcc(String a,long b,long c){
        accholderName=a;accNumber=b;balance=c;
    }
    public void deposite(long namount){
        balance+=namount;
        s="Dear User! amount deposited is----- "+ namount;
        LOGGER.info(s);
    }
    public void withdraw(long mamount){
        balance-=mamount;
        s="Dear User! amount withdrawn is-----"+ mamount;
        LOGGER.info(s);
    }
    public String ame(){
        return accholderName;
    }
    public long balance(){
        return balance;
    }
}
