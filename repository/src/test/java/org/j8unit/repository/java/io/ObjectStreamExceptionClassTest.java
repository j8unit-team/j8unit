package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectStreamExceptionClassTest
implements org.j8unit.repository.java.io.ObjectStreamExceptionClassTests<java.io.ObjectStreamException> {

    @Override
    public Class<java.io.ObjectStreamException> createNewSUT() {
        return java.io.ObjectStreamException.class;
    }

}
