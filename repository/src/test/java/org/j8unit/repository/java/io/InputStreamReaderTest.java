package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputStreamReaderTest
implements org.j8unit.repository.java.io.InputStreamReaderTests<java.io.InputStreamReader> {

    @Override
    public java.io.InputStreamReader createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.io.InputStreamReader] available.");
    }

}
