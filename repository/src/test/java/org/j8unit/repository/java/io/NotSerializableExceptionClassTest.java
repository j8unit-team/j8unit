package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotSerializableExceptionClassTest
implements org.j8unit.repository.java.io.NotSerializableExceptionClassTests<java.io.NotSerializableException> {

    @Override
    public Class<java.io.NotSerializableException> createNewSUT() {
        return java.io.NotSerializableException.class;
    }

}
