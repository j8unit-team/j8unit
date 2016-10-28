package org.j8unit.repository.java.io;

import java.io.ObjectStreamException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectStreamExceptionTest
implements org.j8unit.repository.java.io.ObjectStreamExceptionTests<ObjectStreamException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectStreamException]

    @Override
    public ObjectStreamException createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectStreamException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectStreamException]

}
