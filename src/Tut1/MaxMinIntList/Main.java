package Tut1.MaxMinIntList;


import static Tut1.MaxMinIntList.MaxMinIntList.*;

public class Main {
    public static void main(String[] args) {
        MaxMinIntList testList = new MaxMinIntList();
        MaxMinIntList example = new MaxMinIntList();
        testList.add(30);
        testList.add(20);
        testList.add(25);
        testList.add(1);
        testList.add(21);
        testList.add(23);
        testList.add(-1);

        repOk(example);


        System.out.println("The max value of this list is " + max(testList));
        System.out.println("The max value of this list is " + min(testList));

        repOk(testList);

    }
}