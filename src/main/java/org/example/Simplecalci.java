package org.example;
abstract class Simplecalci {
    private int num1;
    private int num2;

    abstract void add(int a, int b);

    abstract void sub(int a, int b);

    abstract void div(int a, int b);

    abstract void mul(int a, int b);

    public void setvalue(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }


    public int getval1() {
        return num1;
    }

    public int getval2() {
        return num2;
    }
}