package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.InternalFrameUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InternalFrameUITest
implements org.j8unit.repository.javax.swing.plaf.InternalFrameUITests<InternalFrameUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.InternalFrameUI]

    @Override
    public InternalFrameUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.InternalFrameUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.InternalFrameUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.InternalFrameUI]

}
