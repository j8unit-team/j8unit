package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedInputStreamTest
implements org.j8unit.repository.java.io.BufferedInputStreamTests<java.io.BufferedInputStream> {

    @Override
    public java.io.BufferedInputStream createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.io.BufferedInputStream] available.");
    }

}
