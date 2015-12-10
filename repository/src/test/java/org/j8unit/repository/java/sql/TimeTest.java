package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeTest
implements org.j8unit.repository.java.sql.TimeTests<java.sql.Time> {

    @Override
    public java.sql.Time createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.sql.Time] available.");
    }

}
