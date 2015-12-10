package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class YearMonthClassTest
implements org.j8unit.repository.java.time.YearMonthClassTests<java.time.YearMonth> {

    @Override
    public Class<java.time.YearMonth> createNewSUT() {
        return java.time.YearMonth.class;
    }

}
