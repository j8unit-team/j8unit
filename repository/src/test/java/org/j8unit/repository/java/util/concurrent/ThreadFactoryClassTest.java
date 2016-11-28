package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ThreadFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ThreadFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ThreadFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class ThreadFactoryClassTest
implements ThreadFactoryClassTests<ThreadFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadFactory]

    @Override
    public Class<ThreadFactory> createNewSUT() {
        return ThreadFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ThreadFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadFactory]

}
