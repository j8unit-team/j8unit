package org.j8unit.repository.java.io;

import java.io.DataInput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DataInput} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.DataInputTests}).
 */

@RunWith(J8Unit4.class)
public class DataInputTest
implements DataInputTests<DataInput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.DataInput]

    @Override
    public DataInput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.DataInput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.DataInput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.DataInput]

}
