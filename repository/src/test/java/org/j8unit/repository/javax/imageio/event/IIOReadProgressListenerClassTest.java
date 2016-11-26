package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOReadProgressListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOReadProgressListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.imageio.event.IIOReadProgressListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class IIOReadProgressListenerClassTest
implements IIOReadProgressListenerClassTests<IIOReadProgressListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.event.IIOReadProgressListener]

    @Override
    public Class<IIOReadProgressListener> createNewSUT() {
        return IIOReadProgressListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.event.IIOReadProgressListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.event.IIOReadProgressListener]

}
