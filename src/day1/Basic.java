package day1;

import java.util.Arrays;

public class Basic {
    protected int number;
    protected String str;
    protected String[] arr;

    public Basic() {
        setNumber(10);
        setStr("Ducdv");
        setArr(new String[]{"Ducdv1", "Ducdv2", "Ducdv3", "1"});
        System.out.println(getNumber());
        System.out.println(getStr());
        System.out.println(getNumber() > 20);
        System.out.println(getStr() + "ahaha");
        System.out.println(Arrays.toString(getArr()));

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getNumber() {
        return number;
    }

    public String getStr() {
        return str;
    }

    public String[] getArr() {
        return arr;
    }
}
