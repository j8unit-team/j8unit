package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Transform;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Transform} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.TransformClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransformClassTest
implements TransformClassTests<Transform> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.Transform]

    @Override
    public Class<Transform> createNewSUT() {
        return Transform.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.Transform]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.Transform]

}
