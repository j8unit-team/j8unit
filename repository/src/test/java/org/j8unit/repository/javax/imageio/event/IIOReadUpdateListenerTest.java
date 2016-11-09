package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOReadUpdateListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOReadUpdateListener} (by simply
 * reusing the J8Unit test interface {@link IIOReadUpdateListenerTests}).
 */

@RunWith(J8Unit4.class)
public class IIOReadUpdateListenerTest
implements IIOReadUpdateListenerTests<IIOReadUpdateListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.event.IIOReadUpdateListener]

    @Override
    public IIOReadUpdateListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.event.IIOReadUpdateListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.event.IIOReadUpdateListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.event.IIOReadUpdateListener]

}
