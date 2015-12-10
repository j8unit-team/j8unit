package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputStreamReaderClassTest
implements org.j8unit.repository.java.io.InputStreamReaderClassTests<java.io.InputStreamReader> {

    @Override
    public Class<java.io.InputStreamReader> createNewSUT() {
        return java.io.InputStreamReader.class;
    }

}
