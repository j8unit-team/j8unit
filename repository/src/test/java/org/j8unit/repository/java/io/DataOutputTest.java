package org.j8unit.repository.java.io;

import java.io.DataOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DataOutput} (by simply reusing the
 * J8Unit test interface {@link DataOutputTests}).
 */

@RunWith(J8Unit4.class)
public class DataOutputTest
implements DataOutputTests<DataOutput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.DataOutput]

    @Override
    public DataOutput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.DataOutput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.DataOutput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.DataOutput]

}
