package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessBuilderTest
implements org.j8unit.repository.java.lang.ProcessBuilderTests<java.lang.ProcessBuilder> {

    @Override
    public java.lang.ProcessBuilder createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.ProcessBuilder] available.");
    }

}
