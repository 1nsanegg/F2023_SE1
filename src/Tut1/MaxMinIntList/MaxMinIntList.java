package Tut1.MaxMinIntList;

import java.util.ArrayList;

public class MaxMinIntList extends ArrayList {

    public MaxMinIntList() {
        super();
    }
    // return the min value of list
    public static int min(MaxMinIntList maxMinIntList) {
        int min = (int) maxMinIntList.get(0);
        for (Object o : maxMinIntList) {
            if (min > (int) o) {
                min = (int) o;
            }
        }
        return min;
    }
    // return the max value of list
    public static int max(MaxMinIntList maxMinIntList) {
        int max = (int) maxMinIntList.get(0);
        for (Object o : maxMinIntList) {
            if (max < (int) o) {
                max = (int) o;
            }
        }
        return max;
    }
    // check if the list is empty or not
    public static void repOk(MaxMinIntList maxMinIntList) {
        if (maxMinIntList.isEmpty()) {
            System.out.println("This list is empty!");
        } else {
            System.out.println("This list contain " + maxMinIntList);
        }
    }
}
