package org.j8unit.repository.javax.swing.text;

import javax.swing.text.AsyncBoxView;
import javax.swing.text.AsyncBoxView.ChildLocator;
import javax.swing.text.AsyncBoxView.ChildState;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AsyncBoxView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewTests}).
 */
@RunWith(J8Unit4.class)
public class AsyncBoxViewTest
implements AsyncBoxViewTests<AsyncBoxView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AsyncBoxView]

    @Override
    public AsyncBoxView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.AsyncBoxView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AsyncBoxView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AsyncBoxView]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ChildState} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewTests.ChildStateTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ChildStateTest
    implements ChildStateTests<ChildState> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AsyncBoxView$ChildState]

        @Override
        public ChildState createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.AsyncBoxView.ChildState], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AsyncBoxView$ChildState]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AsyncBoxView$ChildState]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ChildLocator} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewTests.ChildLocatorTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ChildLocatorTest
    implements ChildLocatorTests<ChildLocator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AsyncBoxView$ChildLocator]

        @Override
        public ChildLocator createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.AsyncBoxView.ChildLocator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AsyncBoxView$ChildLocator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AsyncBoxView$ChildLocator]

    }

}
