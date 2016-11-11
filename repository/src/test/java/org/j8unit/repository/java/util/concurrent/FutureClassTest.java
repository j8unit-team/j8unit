package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Future;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Future} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.FutureClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class FutureClassTest
implements FutureClassTests<Future> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Future]

    @Override
    public Class<Future> createNewSUT() {
        return Future.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Future]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Future]

}
