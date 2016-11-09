package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOReadUpdateListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOReadUpdateListener} (by simply reusing
 * the J8Unit test interface {@link IIOReadUpdateListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOReadUpdateListenerClassTest
implements IIOReadUpdateListenerClassTests<IIOReadUpdateListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.event.IIOReadUpdateListener]

    @Override
    public Class<IIOReadUpdateListener> createNewSUT() {
        return IIOReadUpdateListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.event.IIOReadUpdateListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.event.IIOReadUpdateListener]

}
