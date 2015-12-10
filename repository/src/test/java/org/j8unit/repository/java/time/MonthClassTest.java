package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonthClassTest
implements org.j8unit.repository.java.time.MonthClassTests<java.time.Month> {

    @Override
    public Class<java.time.Month> createNewSUT() {
        return java.time.Month.class;
    }

}
