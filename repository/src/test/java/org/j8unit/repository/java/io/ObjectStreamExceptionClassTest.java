package org.j8unit.repository.java.io;

import java.io.ObjectStreamException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectStreamExceptionClassTest
implements org.j8unit.repository.java.io.ObjectStreamExceptionClassTests<ObjectStreamException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectStreamException]

    @Override
    public Class<ObjectStreamException> createNewSUT() {
        return ObjectStreamException.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectStreamException]

}
