package org.j8unit.repository.java.util;

import java.util.AbstractQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractQueue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.AbstractQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractQueueClassTest
implements AbstractQueueClassTests<AbstractQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractQueue]

    @Override
    public Class<AbstractQueue> createNewSUT() {
        return AbstractQueue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractQueue]

}
