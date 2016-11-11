package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler;
import javax.swing.plaf.basic.BasicComboPopup.ListDataHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BasicComboPopup} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests}).
 */

@RunWith(J8Unit4.class)
public class BasicComboPopupTest
implements BasicComboPopupTests<BasicComboPopup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup]

    @Override
    public BasicComboPopup createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboPopup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ListDataHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.ListDataHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListDataHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.ListDataHandlerTests<ListDataHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup$ListDataHandler]

        @Override
        public ListDataHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboPopup.ListDataHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup$ListDataHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup$ListDataHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link InvocationKeyHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.InvocationKeyHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InvocationKeyHandlerTest
    implements InvocationKeyHandlerTests<InvocationKeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler]

        @Override
        public InvocationKeyHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler]

    }

}
