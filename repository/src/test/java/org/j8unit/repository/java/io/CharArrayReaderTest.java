package org.j8unit.repository.java.io;

import java.io.CharArrayReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharArrayReaderTest
implements org.j8unit.repository.java.io.CharArrayReaderTests<CharArrayReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.CharArrayReader]

    @Override
    public CharArrayReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.CharArrayReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.CharArrayReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.CharArrayReader]

}
