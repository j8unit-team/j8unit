package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class YearMonthTest
implements org.j8unit.repository.java.time.YearMonthTests<java.time.YearMonth> {

    @Override
    public java.time.YearMonth createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.YearMonth] available.");
    }

}
