package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Runnable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.RunnableClassTests}).
 */

@RunWith(J8Unit4.class)
public class RunnableClassTest
implements RunnableClassTests<Runnable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Runnable]

    @Override
    public Class<Runnable> createNewSUT() {
        return Runnable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Runnable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Runnable]

}
