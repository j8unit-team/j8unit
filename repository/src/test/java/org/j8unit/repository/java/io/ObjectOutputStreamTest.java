package org.j8unit.repository.java.io;

import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectOutputStreamTest
implements org.j8unit.repository.java.io.ObjectOutputStreamTests<ObjectOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutputStream]

    @Override
    public ObjectOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.ObjectOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutputStream]

    @RunWith(J8Unit4.class)
    public static class PutFieldTest
    implements org.j8unit.repository.java.io.ObjectOutputStreamTests.PutFieldTests<PutField> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutputStream$PutField]

        @Override
        public PutField createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectOutputStream.PutField], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutputStream$PutField]

    }

}
