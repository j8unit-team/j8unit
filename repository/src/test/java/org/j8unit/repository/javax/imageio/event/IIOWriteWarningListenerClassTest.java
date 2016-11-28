package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOWriteWarningListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOWriteWarningListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.imageio.event.IIOWriteWarningListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class IIOWriteWarningListenerClassTest
implements IIOWriteWarningListenerClassTests<IIOWriteWarningListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.event.IIOWriteWarningListener]

    @Override
    public Class<IIOWriteWarningListener> createNewSUT() {
        return IIOWriteWarningListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.event.IIOWriteWarningListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.event.IIOWriteWarningListener]

}
