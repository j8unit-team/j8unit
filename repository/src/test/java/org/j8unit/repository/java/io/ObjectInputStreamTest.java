package org.j8unit.repository.java.io;

import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectInputStreamTest
implements org.j8unit.repository.java.io.ObjectInputStreamTests<ObjectInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectInputStream]

    @Override
    public ObjectInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.ObjectInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectInputStream]

    @RunWith(J8Unit4.class)
    public static class GetFieldTest
    implements org.j8unit.repository.java.io.ObjectInputStreamTests.GetFieldTests<GetField> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectInputStream$GetField]

        @Override
        public GetField createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectInputStream.GetField], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectInputStream$GetField]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectInputStream$GetField]

    }

}
