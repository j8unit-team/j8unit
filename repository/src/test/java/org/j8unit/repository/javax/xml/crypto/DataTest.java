package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.Data;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Data} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.DataTests}).
 */

@RunWith(J8Unit4.class)
public class DataTest
implements DataTests<Data> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.Data]

    @Override
    public Data createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.Data], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.Data]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.Data]

}
