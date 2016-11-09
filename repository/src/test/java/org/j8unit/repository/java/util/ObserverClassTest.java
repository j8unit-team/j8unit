package org.j8unit.repository.java.util;

import java.util.Observer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Observer} (by simply reusing the J8Unit
 * test interface {@link ObserverClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObserverClassTest
implements ObserverClassTests<Observer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Observer]

    @Override
    public Class<Observer> createNewSUT() {
        return Observer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Observer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Observer]

}
