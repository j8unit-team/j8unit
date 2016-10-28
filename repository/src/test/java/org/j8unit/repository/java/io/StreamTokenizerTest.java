package org.j8unit.repository.java.io;

import java.io.StreamTokenizer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamTokenizerTest
implements org.j8unit.repository.java.io.StreamTokenizerTests<StreamTokenizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.StreamTokenizer]

    @Override
    public StreamTokenizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.StreamTokenizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.StreamTokenizer]

}
