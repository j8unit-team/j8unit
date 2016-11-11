package org.j8unit.repository.java.util;

import java.util.Deque;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Deque} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.util.DequeClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DequeClassTest
implements DequeClassTests<Deque> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Deque]

    @Override
    public Class<Deque> createNewSUT() {
        return Deque.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Deque]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Deque]

}
