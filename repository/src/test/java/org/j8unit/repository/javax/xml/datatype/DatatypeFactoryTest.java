package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DatatypeFactory} (by simply reusing
 * the J8Unit test interface {@link DatatypeFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class DatatypeFactoryTest
implements DatatypeFactoryTests<DatatypeFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeFactory]

    @Override
    public DatatypeFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.datatype.DatatypeFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeFactory]

}
