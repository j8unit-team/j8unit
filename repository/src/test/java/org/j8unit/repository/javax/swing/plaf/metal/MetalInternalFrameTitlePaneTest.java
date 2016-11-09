package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MetalInternalFrameTitlePane} (by
 * simply reusing the J8Unit test interface {@link MetalInternalFrameTitlePaneTests}).
 */

@RunWith(J8Unit4.class)
public class MetalInternalFrameTitlePaneTest
implements MetalInternalFrameTitlePaneTests<MetalInternalFrameTitlePane> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalInternalFrameTitlePane]

    @Override
    public MetalInternalFrameTitlePane createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalInternalFrameTitlePane], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalInternalFrameTitlePane]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalInternalFrameTitlePane]

}
