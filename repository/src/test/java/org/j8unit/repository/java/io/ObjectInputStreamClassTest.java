package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectInputStreamClassTest
implements org.j8unit.repository.java.io.ObjectInputStreamClassTests<java.io.ObjectInputStream> {

    @Override
    public Class<java.io.ObjectInputStream> createNewSUT() {
        return java.io.ObjectInputStream.class;
    }

    @RunWith(J8Unit4.class)
    public static class GetFieldClassTest
    implements org.j8unit.repository.java.io.ObjectInputStreamClassTests.GetFieldClassTests<java.io.ObjectInputStream.GetField> {

        @Override
        public Class<java.io.ObjectInputStream.GetField> createNewSUT() {
            return java.io.ObjectInputStream.GetField.class;
        }

    }

}
