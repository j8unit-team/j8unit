package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReaderClassTest
implements org.j8unit.repository.java.io.ReaderClassTests<java.io.Reader> {

    @Override
    public Class<java.io.Reader> createNewSUT() {
        return java.io.Reader.class;
    }

}
