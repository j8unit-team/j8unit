package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IOExceptionClassTest
implements org.j8unit.repository.java.io.IOExceptionClassTests<java.io.IOException> {

    @Override
    public Class<java.io.IOException> createNewSUT() {
        return java.io.IOException.class;
    }

}
