package org.j8unit.repository.java.io;

import java.io.StringReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringReaderTest
implements org.j8unit.repository.java.io.StringReaderTests<StringReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.StringReader]

    @Override
    public StringReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.StringReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.StringReader]

}
