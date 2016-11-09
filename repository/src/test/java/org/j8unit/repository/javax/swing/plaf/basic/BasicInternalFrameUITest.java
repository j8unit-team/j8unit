package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout;
import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BasicInternalFrameUI} (by simply
 * reusing the J8Unit test interface {@link BasicInternalFrameUITests}).
 */

@RunWith(J8Unit4.class)
public class BasicInternalFrameUITest
implements BasicInternalFrameUITests<BasicInternalFrameUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI]

    @Override
    public BasicInternalFrameUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicInternalFrameUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type
     * {@link InternalFramePropertyChangeListener} (by simply reusing the J8Unit test interface
     * {@link InternalFramePropertyChangeListenerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InternalFramePropertyChangeListenerTest
    implements InternalFramePropertyChangeListenerTests<InternalFramePropertyChangeListener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI$InternalFramePropertyChangeListener]

        @Override
        public InternalFramePropertyChangeListener createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI$InternalFramePropertyChangeListener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI$InternalFramePropertyChangeListener]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link InternalFrameLayout} (by simply
     * reusing the J8Unit test interface {@link InternalFrameLayoutTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InternalFrameLayoutTest
    implements InternalFrameLayoutTests<InternalFrameLayout> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI$InternalFrameLayout]

        @Override
        public InternalFrameLayout createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI$InternalFrameLayout]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicInternalFrameUI$InternalFrameLayout]

    }

}
