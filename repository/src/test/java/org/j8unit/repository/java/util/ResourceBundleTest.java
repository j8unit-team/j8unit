package org.j8unit.repository.java.util;

import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ResourceBundle} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.ResourceBundleTests}).
 */
@RunWith(J8Unit4.class)
public class ResourceBundleTest
implements ResourceBundleTests<ResourceBundle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ResourceBundle]

    @Override
    public ResourceBundle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.ResourceBundle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.ResourceBundle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.ResourceBundle]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Control} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.ResourceBundleTests.ControlTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ControlTest
    implements ControlTests<Control> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ResourceBundle$Control]

        @Override
        public Control createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.ResourceBundle.Control], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.ResourceBundle$Control]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.ResourceBundle$Control]

    }

}
