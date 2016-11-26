package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Transform;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Transform} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.TransformTests}).
 */
@RunWith(J8Unit4.class)
public class TransformTest
implements TransformTests<Transform> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.Transform]

    @Override
    public Transform createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.Transform], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.Transform]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.Transform]

}
