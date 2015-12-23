package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectOutputStreamClassTest
implements org.j8unit.repository.java.io.ObjectOutputStreamClassTests<java.io.ObjectOutputStream> {

    @Override
    public Class<java.io.ObjectOutputStream> createNewSUT() {
        return java.io.ObjectOutputStream.class;
    }

    @RunWith(J8Unit4.class)
    public static class PutFieldClassTest
    implements org.j8unit.repository.java.io.ObjectOutputStreamClassTests.PutFieldClassTests<java.io.ObjectOutputStream.PutField> {

        @Override
        public Class<java.io.ObjectOutputStream.PutField> createNewSUT() {
            return java.io.ObjectOutputStream.PutField.class;
        }

    }

}
