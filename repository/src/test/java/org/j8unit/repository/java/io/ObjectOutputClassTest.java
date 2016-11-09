package org.j8unit.repository.java.io;

import java.io.ObjectOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectOutput} (by simply reusing the
 * J8Unit test interface {@link ObjectOutputClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectOutputClassTest
implements ObjectOutputClassTests<ObjectOutput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectOutput]

    @Override
    public Class<ObjectOutput> createNewSUT() {
        return ObjectOutput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectOutput]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectOutput]

}
