package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialArray;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SerialArray} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.serial.SerialArrayTests}).
 */

@RunWith(J8Unit4.class)
public class SerialArrayTest
implements SerialArrayTests<SerialArray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.serial.SerialArray]

    @Override
    public SerialArray createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.rowset.serial.SerialArray], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.serial.SerialArray]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.serial.SerialArray]

}
