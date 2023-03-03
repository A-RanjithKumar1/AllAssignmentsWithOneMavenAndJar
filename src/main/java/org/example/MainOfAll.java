package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
public class MainOfAll {
    public static void main(String[] args) {
        Accessmethod access = new Accessmethod();
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("MainOfAll");
        try {

            int choose;
            do {
                log.info("1.BankAccount\n 2.BasicShape\n 3.Student\n 4.DataBase\n 5.BasicPoint\n 6.CreditCard\n 7.StudentGpa\n 8.TreeSet\n 9.HashSet\n 10.HashMap\n 11.Calculator\n 12.Contacts\n 13.TextFile\n 14.TicTacToe\n 15.ArrayList\n 16.Exit");
                log.info("Please Select the above Operation");
                choose = sc.nextInt();
                switch (choose) {
                    case 1 -> access.bankAccount();
                    case 2 -> access.basicShape();
                    case 3 -> access.student();
                    case 4 -> access.dataBase();
                    case 5 -> access.basicPoint();
                    case 6 -> access.creditCard();
                    case 7 -> access.studentGpa();
                    case 8 -> access.treeSet();
                    case 9 -> access.hashSet();
                    case 10 -> access.hashMap();
                    case 11 -> access.calculator();
                    case 12 -> access.contacts();
                    case 13 -> access.textFile();
                    case 14 -> access.ticTacToe();
                    case 15 -> access.arrayList();
                    case 16 -> System.exit(0);
                    default -> {
                        log.info("Wrong choice");
                    }
                }
            } while (choose >0 && choose<=15);
        }

        catch (Exception e) {
            log.info("InputMissMatched! Please Check Again");
        }
    }
}
