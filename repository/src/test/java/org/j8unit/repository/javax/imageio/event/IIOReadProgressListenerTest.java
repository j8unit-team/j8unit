package org.j8unit.repository.javax.imageio.event;

import javax.imageio.event.IIOReadProgressListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOReadProgressListenerTest
implements org.j8unit.repository.javax.imageio.event.IIOReadProgressListenerTests<IIOReadProgressListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.event.IIOReadProgressListener]

    @Override
    public IIOReadProgressListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.event.IIOReadProgressListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.event.IIOReadProgressListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.event.IIOReadProgressListener]

}
