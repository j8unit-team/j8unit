package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SequenceInputStreamTest
implements org.j8unit.repository.java.io.SequenceInputStreamTests<java.io.SequenceInputStream> {

    @Override
    public java.io.SequenceInputStream createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.io.SequenceInputStream] available.");
    }

}
