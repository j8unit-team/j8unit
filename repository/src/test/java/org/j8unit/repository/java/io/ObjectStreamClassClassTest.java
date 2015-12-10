package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectStreamClassClassTest
implements org.j8unit.repository.java.io.ObjectStreamClassClassTests<java.io.ObjectStreamClass> {

    @Override
    public Class<java.io.ObjectStreamClass> createNewSUT() {
        return java.io.ObjectStreamClass.class;
    }

}
