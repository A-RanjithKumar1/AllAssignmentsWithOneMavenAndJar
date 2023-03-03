package org.example;
import java.util.logging.Logger;
public class Main extends Simplecalci {
    private final Logger lOGGER = Logger.getLogger("InfoLogging");
    double s = 0;
    String dumy;

    void add(int a, int b) {
        setvalue(a, b);
        dumy = "The addition value is:- " + (getval1() + getval2());
        lOGGER.info(dumy);
    }


    void sub(int a, int b) {
        setvalue(a, b);
        dumy = "The subtraction value is:- " + (getval1() - getval2());
        lOGGER.info(dumy);
    }

    void div(int a, int b) {
        setvalue(a, b);
        dumy = "The divison value is:- " + (getval1() / getval2());
        lOGGER.info(dumy);
    }

    void mul(int a, int b) {
        setvalue(a, b);
        dumy = "The multiplication value is:- " + (getval1() * getval2());
        lOGGER.info(dumy);
    }
}
