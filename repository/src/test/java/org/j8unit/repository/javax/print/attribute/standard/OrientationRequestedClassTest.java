package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.OrientationRequested;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OrientationRequested} (by simply reusing
 * the J8Unit test interface {@link OrientationRequestedClassTests}).
 */

@RunWith(J8Unit4.class)
public class OrientationRequestedClassTest
implements OrientationRequestedClassTests<OrientationRequested> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.OrientationRequested]

    @Override
    public Class<OrientationRequested> createNewSUT() {
        return OrientationRequested.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.OrientationRequested]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.OrientationRequested]

}
