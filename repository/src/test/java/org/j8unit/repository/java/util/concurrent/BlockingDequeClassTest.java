package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BlockingDeque;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BlockingDeque} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.BlockingDequeClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BlockingDequeClassTest
implements BlockingDequeClassTests<BlockingDeque> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.BlockingDeque]

    @Override
    public Class<BlockingDeque> createNewSUT() {
        return BlockingDeque.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.BlockingDeque]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.BlockingDeque]

}
