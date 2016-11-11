package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOWriteProgressListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOWriteProgressListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.event.IIOWriteProgressListenerTests}).
 */

@RunWith(J8Unit4.class)
public class IIOWriteProgressListenerTest
implements IIOWriteProgressListenerTests<IIOWriteProgressListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.event.IIOWriteProgressListener]

    @Override
    public IIOWriteProgressListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.event.IIOWriteProgressListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.event.IIOWriteProgressListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.event.IIOWriteProgressListener]

}
