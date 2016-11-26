package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOWriteProgressListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOWriteProgressListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.imageio.event.IIOWriteProgressListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class IIOWriteProgressListenerClassTest
implements IIOWriteProgressListenerClassTests<IIOWriteProgressListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.event.IIOWriteProgressListener]

    @Override
    public Class<IIOWriteProgressListener> createNewSUT() {
        return IIOWriteProgressListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.event.IIOWriteProgressListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.event.IIOWriteProgressListener]

}
