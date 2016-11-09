package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirObjectFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DirObjectFactory} (by simply reusing
 * the J8Unit test interface {@link DirObjectFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class DirObjectFactoryTest
implements DirObjectFactoryTests<DirObjectFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirObjectFactory]

    @Override
    public DirObjectFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.DirObjectFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirObjectFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirObjectFactory]

}
