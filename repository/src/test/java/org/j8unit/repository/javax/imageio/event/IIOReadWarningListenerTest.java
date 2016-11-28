package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOReadWarningListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOReadWarningListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.event.IIOReadWarningListenerTests}).
 */
@RunWith(J8Unit4.class)
public class IIOReadWarningListenerTest
implements IIOReadWarningListenerTests<IIOReadWarningListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.event.IIOReadWarningListener]

    @Override
    public IIOReadWarningListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.event.IIOReadWarningListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.event.IIOReadWarningListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.event.IIOReadWarningListener]

}
