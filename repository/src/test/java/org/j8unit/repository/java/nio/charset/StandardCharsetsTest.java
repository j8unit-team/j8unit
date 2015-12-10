package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardCharsetsTest
implements org.j8unit.repository.java.nio.charset.StandardCharsetsTests<java.nio.charset.StandardCharsets> {

    @Override
    public java.nio.charset.StandardCharsets createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.charset.StandardCharsets] available.");
    }

}
