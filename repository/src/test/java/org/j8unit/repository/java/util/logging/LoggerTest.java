package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoggerTest
implements org.j8unit.repository.java.util.logging.LoggerTests<java.util.logging.Logger> {

    @Override
    public java.util.logging.Logger createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.logging.Logger] available.");
    }

}
