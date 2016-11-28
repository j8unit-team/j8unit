package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractOwnableSynchronizer} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.locks.AbstractOwnableSynchronizerClassTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractOwnableSynchronizerClassTest
implements AbstractOwnableSynchronizerClassTests<AbstractOwnableSynchronizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.AbstractOwnableSynchronizer]

    @Override
    public Class<AbstractOwnableSynchronizer> createNewSUT() {
        return AbstractOwnableSynchronizer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.AbstractOwnableSynchronizer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.AbstractOwnableSynchronizer]

}
