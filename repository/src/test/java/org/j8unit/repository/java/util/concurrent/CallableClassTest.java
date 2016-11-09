package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Callable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Callable} (by simply reusing the J8Unit
 * test interface {@link CallableClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CallableClassTest
implements CallableClassTests<Callable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Callable]

    @Override
    public Class<Callable> createNewSUT() {
        return Callable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Callable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Callable]

}
