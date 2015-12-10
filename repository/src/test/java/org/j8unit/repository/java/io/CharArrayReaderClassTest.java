package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharArrayReaderClassTest
implements org.j8unit.repository.java.io.CharArrayReaderClassTests<java.io.CharArrayReader> {

    @Override
    public Class<java.io.CharArrayReader> createNewSUT() {
        return java.io.CharArrayReader.class;
    }

}
