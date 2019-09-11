package org.ysp.test;

import java.time.LocalDate;

/**
 * @author pai
 * @date 2019/7/6
 */
public class Test {

    public static void main(String[] args) {

        LocalDate date  = LocalDate.now();
        LocalDate d2 = LocalDate.parse("2019-07-02");
        System.out.println(date.toEpochDay()-d2.toEpochDay());
    }
}
