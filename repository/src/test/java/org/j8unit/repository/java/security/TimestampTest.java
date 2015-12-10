package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimestampTest
implements org.j8unit.repository.java.security.TimestampTests<java.security.Timestamp> {

    @Override
    public java.security.Timestamp createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.Timestamp] available.");
    }

}
