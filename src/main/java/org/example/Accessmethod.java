package org.example;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Accessmethod {
    Scanner sc = new Scanner(System.in);

    private static final Logger LOG = Logger.getLogger("InfoLogging");

    protected void bankAccount() {
        String s;
        LOG.info("Enter the userName");
        String name = sc.next();
        LOG.info("Enter the AccountNumber");
        long num = sc.nextLong();
        LOG.info("Enter the Initial Amount to be deposited");
        long bal = sc.nextLong();
        BankAcc bob = new BankAcc(name, num, bal);
        int op = 0;
        while (op != 4) {
            LOG.info("Dear User! Please Go through the below option and Enter the option" + "\n" + "1.Deposite 2.Withdraw 3.Balance 4.Exit");
            op = sc.nextInt();
            if (op == 1) {
                LOG.info("Enter the Deposite");
                long dep = sc.nextLong();
                bob.deposite(dep);
            } else if (op == 2) {
                LOG.info("Enter the Amount  to be withdrawn");
                long dra = sc.nextLong();
                bob.withdraw(dra);
            } else if (op == 3) {
                long b1 = bob.balance();
                String na = bob.ame();
                s = "The Account holder Name is---" + na;
                LOG.info(s);
                s = "The Current Available Balance is" + b1;
                LOG.info(s);
            }
        }
    }

    public void basicShape() {
        final String triangle = "triangle";
        final String rectangle = "rectangle";
        final String circle = "circle";
        final String option = "Select the Below required option\n1.Perimeter\n2.Area\n3.Both";
        final String query = "Oh! choose the correct option";
        LOG.info("Please enter the shape for which you want to find Area and Perimeter");
        String op = sc.next();
        String st;
        if (((op.toUpperCase()).compareTo(rectangle)) == 0) {
            LOG.info("Enter the length of the Rectangle");
            float l = sc.nextFloat();
            LOG.info("Enter the breadth of the Rectangle");
            float b = sc.nextFloat();
            ShapeAndDim figure = new ShapeAndDim(l, b);
            double pm = figure.perimeter(rectangle);
            st = "The perimeter of the Rectangle is-----" + pm;
            LOG.info(st);
            double ar = figure.area(rectangle);
            st = "The Area of the Rectangle is-----" + ar;
            LOG.info(st);
        } else if (((op.toUpperCase()).compareTo(triangle)) == 0) {
            LOG.info("Enter the base of the Triangle");
            float b1 = sc.nextFloat();
            LOG.info("Enter the height of the Triangle");
            float h1 = sc.nextFloat();
            LOG.info("Enter the three sides of the Triangle");
            float s1 = sc.nextFloat();
            float s2 = sc.nextFloat();
            float s3 = sc.nextFloat();
            ShapeAndDim figure = new ShapeAndDim(b1, h1, s1, s2, s3);
            double pm1 = figure.perimeter(triangle);
            st = "The perimeter of the Triangle is-----" + pm1;
            LOG.info(st);
            double ar1 = figure.area(triangle);
            st = "The Area of the Rectangle is-----" + ar1;
            LOG.info(st);
        } else if (((op.toUpperCase()).compareTo(circle)) == 0) {
            LOG.info("Enter the radius of the Circle");
            float r = sc.nextFloat();
            ShapeAndDim figure = new ShapeAndDim(r);
            double pm2 = figure.perimeter(circle);
            st = "The perimeter of the circle is-----" + pm2;
            LOG.info(st);
            ShapeAndDim figure3 = new ShapeAndDim(r);
            double ar2 = figure3.area(circle);
            st = "The Area of the circle is-----" + ar2;
            LOG.info(st);
        } else {
            LOG.info(query);
        }
    }

    void student() {
        LOG.info("Please Enter the Student Name");
        String name = sc.next();
        LOG.info("Enter the Grade level");
        char gr = sc.next().charAt(0);
        LOG.info("Enter your GPA");
        float gp = sc.nextFloat();
        Student calculation = new Student(name, gr, gp);
        boolean choose = true;
        while (choose) {
            LOG.info("Do you need to update your GPA" + "\n" + "1.Yes" + "\n" + "2.No" + "\n" + "3.View Student Name and GPA" + "\n" + "4.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                LOG.info("Enter the GPA to be Upated");
                float updated = sc.nextFloat();
                calculation.update(updated);
            } else if (ch == 2) {
                LOG.info("Its Okay");
            } else if (ch == 3) {
                String result = calculation.nameAndgPA();
                LOG.info(result);
                choose = false;
            }
        }
    }

    void dataBase() {
        LOG.info("Enter the Connection Name");
        String con = sc.nextLine();
        // Instantiating Singleton class with variable x
        DataConnection x = DataConnection.getInstance(con);
        boolean choose = true;
        while (choose) {
            LOG.info("Select the option \n 1.New Connection\n 2.Close all connections");
            int op = sc.nextInt();
            sc.nextLine();
            if (op == 1) {
                LOG.info("Enter the new Connection Name");
                String ns = sc.nextLine();
                String con1 = x.newConnection(ns);
                LOG.info(con1);
            } else if (op == 2) {
                x.close();
                choose = false;
            } else {
                LOG.info("Please Try Again!");
            }
        }
    }

    void basicPoint() {
        try {
            String dumy = "";
            LOG.log(Level.INFO, "Enter the X-coordinate");
            double x1 = sc.nextDouble();
            LOG.log(Level.INFO, "Enter the Y-coordinate");
            double y1 = sc.nextDouble();
            BasicPoint p = new BasicPoint(x1, y1);
            BasicPoint p1 = p.copy();
            LOG.info("Enter the New X coordinate");
            p1.x = sc.nextDouble();
            LOG.info("Enter the New Y coordinate");
            p1.y = sc.nextDouble();
            boolean confm = p.eql(p1.x, p1.y);
            if (confm) {
                LOG.info("TRUE! Both are same");
            } else {
                LOG.info("False! Both are Not Same");
            }
            dumy = "Original points are " + p.x + "and " + p.y;
            LOG.info(dumy);
            dumy = "Cloned points are " + p1.x + "and " + p1.y;
            LOG.info(dumy);
        } catch (Exception e) {
            LOG.info("Something went wrong while giving input! " + e);
        }
    }

    void creditCard() {
        try {
            String dumy = "";
            LOG.log(Level.INFO, "Enter the CardHolder Name");
            String name = sc.nextLine();
            LOG.log(Level.INFO, "Enter the CardNumber");
            long cdnumber = sc.nextLong();
            LOG.log(Level.INFO, "Enter the Expiry Date");
            sc.nextLine();
            String expDate = sc.nextLine();
            CreditCard p = new CreditCard(name, cdnumber, expDate);
            CreditCard p1 = p.copy();
            LOG.info("Enter the New Card Number");
            p1.cardNumber = sc.nextLong();
            boolean conf = p.eql(p1.cardNumber);
            if (conf) {
                LOG.info("True! They are same as Original Details ");
            } else {
                LOG.info("False! Both are Not Same");
                LOG.info("Want to see the New DebitCard Details with the Original Details\n1.yes\n2.No");
                int op = sc.nextInt();
                if (op == 1) {
                    dumy = "The New Credit Card with Details is \nName of the holder " + p.cardHolder + "\n CardNumber " + p.cardNumber + "\n Expiary Date " + p.expiaryDate;
                    LOG.info(dumy);
                } else if (op == 2) {
                    LOG.info("Okay");
                } else {
                    LOG.info("Something Went Wrong");
                }

            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone Error");
        }
    }

    void arrayList() {
        java.util.ArrayList<Integer> myArray = new ArrayList<Integer>();
        int op = 1;
        while (op >= 1 && op <= 4) {
            LOG.info("Select the below Operations \n 1. add \n 2. remove \n 3.Print elements \n 4.exit");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    LOG.info("Enter the no of element to be added");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        int element = sc.nextInt();
                        myArray.add(element);
                    }
                    break;
                case 2:
                    LOG.info("enter the element to be removed");
                    int search = sc.nextInt();
                    if (myArray.contains(search)) {
                        myArray.remove(myArray.indexOf(search));
                    }
                    break;
                case 3:
                    for (int i : myArray) {
                        String s = String.valueOf(i);
                        LOG.info(s);
                    }
                    break;
                case 4:
                    op = 10;
                    break;
                default:
                    LOG.info("Something went Wrong");

            }
        }
    }

    void ticTacToe() {
        LOG.info("Enter the Dimensions");
        int dimension = sc.nextInt();
        char[][] disp = new char[dimension][dimension];
        LOG.info("Enter the Player1 choice to choose X or O");
        char player1 = Character.toUpperCase(sc.next().charAt(0));
        char player2;
        if (player1 == 'X') {
            player2 = 'O';
        } else {
            player2 = 'X';
        }
        TicTacToe a = new TicTacToe();
        while (a.control < (dimension * dimension)) {
            if (a.check(dimension) == 0) {
                a.player1(dimension, disp, player1);
                if (a.check(dimension) == 0) {
                    a.player2(dimension, disp, player2);
                }
            }
        }
    }

    void hashSet() {
        String s;
        String s2 = "Enter your choice\n1.Add\n2.Print\n3.Size\n4.Remove";


        HashSet<String> hs = new HashSet<>();

        while (true) {
            LOG.info(s2);
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    hs.add(sc.next());
                    LOG.info("Added the element");
                    break;
                }
                case 2: {
                    String s1 = "The values in Set are " + hs;
                    LOG.info(s1);
                    break;
                }
                case 3: {
                    String k = String.valueOf(hs.size());
                    LOG.info(k);
                    break;
                }
                case 4: {
                    s = sc.next();
                    hs.remove(s);
                    LOG.info("Removed the element");
                    break;
                }
                default: {
                    System.exit(0);
                }
            }
        }
    }

    void treeSet() {
        TreeSet<String> ts = new TreeSet<>();
        String s;
        String s2 = "Enter your choice\n1.Add\n2.Remove\n3.size\n4.Print\n";
        while (true) {
            LOG.info(s2);
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    ts.add(sc.next());
                    LOG.info("The element is added");
                    break;
                }
                case 2: {
                    s = sc.next();
                    ts.remove(s);
                    LOG.info("The element is removed");
                    break;
                }
                case 3: {
                    String k = String.valueOf(ts.size());
                    LOG.info(k);
                    break;
                }
                case 4: {
                    String s1 = "The values in Set are " + ts;
                    LOG.info(s1);
                    break;
                }
                default: {
                    System.exit(0);
                }
            }
        }
    }

    void hashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        String s1 = "Key-Value pairs: ";

        map.put(4, "ram");
        map.put(2, "shyam");
        map.put(3, "jam");
        map.put(1, "spam");

        LOG.log(Level.INFO, () -> "Size: " + map.size());
        LOG.log(Level.INFO, () -> "Values : " + map.values());
        LOG.log(Level.INFO, () -> "Keys : " + map.keySet());
        LOG.log(Level.INFO, () -> s1 + map.entrySet());

        LOG.log(Level.INFO, () -> "Getting a value" + map.get(2));

        LOG.info("After removing ");
        map.remove(2);
        LOG.log(Level.INFO, () -> s1 + map.entrySet());

        LOG.info("After replacing ");
        map.replace(1, "Friends");
        LOG.log(Level.INFO, () -> s1 + map.entrySet());
        LOG.log(Level.INFO, () -> "Size: " + map.size());
        LOG.log(Level.INFO, () -> "Values : " + map.values());
        LOG.log(Level.INFO, () -> "Keys : " + map.keySet());
        LOG.log(Level.INFO, () -> s1 + map.entrySet());

        LOG.log(Level.INFO, () -> "Getting a value" + map.get(2));

        LOG.info("After removing ");
        map.remove(2);
        LOG.log(Level.INFO, () -> s1 + map.entrySet());

        LOG.info("After replacing ");
        map.replace(1, "Friends");
        LOG.log(Level.INFO, () -> s1 + map.entrySet());
    }

    void studentGpa() {
        ArrayList<StudentGpa> al = new ArrayList<StudentGpa>();
        LOG.info("Enter the no of students details to be registered");
        int n = sc.nextInt();
        while (n > 0) {
            LOG.info("Please Enter the Student Name");
            String name = sc.next();
            LOG.info("Enter the Age");
            int age = sc.nextInt();
            LOG.info("Enter the Gpa");
            float gpa = sc.nextFloat();
            al.add(new StudentGpa(name, age, gpa));
            n -= 1;
        }
        int op = 1;
        while (op > 0 && op <= 2) {
            LOG.info("Select the below Operations" + "\n" + "1.PrintDetails of each Student" + "\n" + "2.Sort the list by highest to lowest with respect to GPA and Display" + "\n" + "3.Exit");
            op = sc.nextInt();
            if (op == 1) {
                StudentGpa.printDetails(al);
            } else if (op == 2) {
                Collections.sort(al, new SortbyGpa());
                LOG.info("After Sorting");
                for (StudentGpa st : al) {
                    LOG.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
                }
                op = 10;
            } else {
                op = 10;
            }
        }
    }

    void textFile() {
        try {

            List<String> s = new ArrayList<String>();
            String dump;
            Map<String, Integer> words = new HashMap<String, Integer>();
            Frequency f = new Frequency();
            f.countWords("C:\\Users\\Tringapps-User13\\OneDrive\\Desktop\\Demo.txt", words);
            LOG.log(Level.INFO, () -> " " + words);
            List<String> keyList = new ArrayList<String>(words.keySet());
            List<Integer> valueList = new ArrayList<Integer>(words.values());
            LOG.log(Level.INFO, () -> " " + keyList);
            LOG.log(Level.INFO, () -> " " + valueList);
            Collections.sort(valueList, Collections.reverseOrder());
            for (int i : (valueList)) {
                for (Map.Entry<String, Integer> entry : words.entrySet()) {
                    if (entry.getValue() == i) {
                        dump = entry.getKey() + "--" + i;
                        s.add(dump);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            LOG.info("File not Found");
        }
    }

    void calculator() {
        LOG.info("Enter the operand value1 to perform the mathematical operation");
        int first = sc.nextInt();
        LOG.info("Enter the operand value2 to perform the mathematical operation");
        int second = sc.nextInt();
        boolean choose = true;
        Simplecalci cal = new Main();
        while (choose) {
            LOG.info("Select the below operation to be formed 1.Add 2.subract 3.divide 4.multiply 5.exit");
            int op = sc.nextInt();
            if (op == 1) {
                cal.add(first, second);
            } else if (op == 2) {
                cal.sub(first, second);
            } else if (op == 3) {
                cal.div(first, second);
            } else if (op == 4) {
                cal.mul(first, second);
            } else {
                choose = false;
            }
        }
    }
    void contacts(){
        LinkedList l=new LinkedList();
        int ch;
        String s1="Enter the Name :";
        String s2="Enter the Email :";
        String s3="Enter the Number :";
        do{
            LOG.info("1.InsertFirst \n 2.InsertLast\n3.InsertAtPos\n4.RemoveFirst\n5.RemoveLast\n6.RemoveAtPos\n7.Display\n8.search by Name");
            LOG.info("Enter the Choice :");
            ch= sc.nextInt();
            switch (ch){
                case 1->{
                    LOG.info(s1);
                    String nameInsertFirst= sc.next();
                    LOG.info(s2);
                    String emailInsertFirst=sc.next();
                    LOG.info(s3);
                    String numberInsertFirst=sc.next();
                    l.insertFirst(nameInsertFirst,emailInsertFirst,numberInsertFirst);
                }
                case 2->{
                    LOG.info(s1);
                    String nameInsertLast= sc.next();
                    LOG.info(s2);
                    String emailInsertLast=sc.next();
                    LOG.info(s3);
                    String numberInsertLast=sc.next();
                    l.insertLast(nameInsertLast,emailInsertLast,numberInsertLast);
                }
                case 3->{
                    LOG.info(s1);
                    String nameInsertAt=sc.next();
                    LOG.info(s2);
                    String emailInsertAt= sc.next();
                    LOG.info(s3);
                    String numberInsertAt=sc.next();
                    LOG.info("Enter the Position :");
                    int index=sc.nextInt();
                    l.insertAt(nameInsertAt,emailInsertAt,numberInsertAt,index);
                }
                case 4-> l.removeFirst();
                case 5-> l.removeLast();
                case 6-> {
                    LOG.info("Enter the Position :");
                    int index = sc.nextInt();
                    l.removeAt(index);
                }
                case 7->
                        l.display();
                case 8->
                {
                    LOG.info(s1);
                    String name=sc.next();
                    int res=l.search(name);
                    if(res>0)
                    {
                        String s="Element is At Position :"+res;
                        LOG.info(s);

                    }
                    else
                    {
                        LOG.info("The name is not found");
                    }

                }

                default ->
                        LOG.info("Wrong Choice !");

            }
        }while(ch>0 && ch<=8);
    }
    }

