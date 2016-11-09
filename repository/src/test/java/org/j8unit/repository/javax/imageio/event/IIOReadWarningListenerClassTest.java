package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOReadWarningListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOReadWarningListener} (by simply
 * reusing the J8Unit test interface {@link IIOReadWarningListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOReadWarningListenerClassTest
implements IIOReadWarningListenerClassTests<IIOReadWarningListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.event.IIOReadWarningListener]

    @Override
    public Class<IIOReadWarningListener> createNewSUT() {
        return IIOReadWarningListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.event.IIOReadWarningListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.event.IIOReadWarningListener]

}
