package org.j8unit.repository.java.io;

import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectOutputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.ObjectOutputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectOutputStreamTest
implements ObjectOutputStreamTests<ObjectOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutputStream]

    @Override
    public ObjectOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.ObjectOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectOutputStream]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PutField} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.io.ObjectOutputStreamTests.PutFieldTests}).
     */
    @RunWith(J8Unit4.class)
    public static class PutFieldTest
    implements PutFieldTests<PutField> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutputStream$PutField]

        @Override
        public PutField createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectOutputStream.PutField], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectOutputStream$PutField]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectOutputStream$PutField]

    }

}
