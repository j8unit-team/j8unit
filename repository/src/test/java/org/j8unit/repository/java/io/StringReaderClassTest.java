package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringReaderClassTest
implements org.j8unit.repository.java.io.StringReaderClassTests<java.io.StringReader> {

    @Override
    public Class<java.io.StringReader> createNewSUT() {
        return java.io.StringReader.class;
    }

}
