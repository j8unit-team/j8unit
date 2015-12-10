package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectStreamFieldClassTest
implements org.j8unit.repository.java.io.ObjectStreamFieldClassTests<java.io.ObjectStreamField> {

    @Override
    public Class<java.io.ObjectStreamField> createNewSUT() {
        return java.io.ObjectStreamField.class;
    }

}
