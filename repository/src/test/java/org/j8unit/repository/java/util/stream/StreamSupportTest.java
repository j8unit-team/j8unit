package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamSupportTest
implements org.j8unit.repository.java.util.stream.StreamSupportTests<java.util.stream.StreamSupport> {

    @Override
    public java.util.stream.StreamSupport createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.stream.StreamSupport] available.");
    }

}
