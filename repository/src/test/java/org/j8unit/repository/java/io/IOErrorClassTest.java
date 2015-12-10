package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IOErrorClassTest
implements org.j8unit.repository.java.io.IOErrorClassTests<java.io.IOError> {

    @Override
    public Class<java.io.IOError> createNewSUT() {
        return java.io.IOError.class;
    }

}
