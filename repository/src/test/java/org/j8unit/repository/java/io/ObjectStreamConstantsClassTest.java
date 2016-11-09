package org.j8unit.repository.java.io;

import java.io.ObjectStreamConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectStreamConstants} (by simply reusing
 * the J8Unit test interface {@link ObjectStreamConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectStreamConstantsClassTest
implements ObjectStreamConstantsClassTests<ObjectStreamConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectStreamConstants]

    @Override
    public Class<ObjectStreamConstants> createNewSUT() {
        return ObjectStreamConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectStreamConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectStreamConstants]

}
