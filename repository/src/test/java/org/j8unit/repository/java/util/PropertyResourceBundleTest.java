package org.j8unit.repository.java.util;

import java.util.PropertyResourceBundle;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyResourceBundle} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.PropertyResourceBundleTests}).
 */
@RunWith(J8Unit4.class)
public class PropertyResourceBundleTest
implements PropertyResourceBundleTests<PropertyResourceBundle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.PropertyResourceBundle]

    @Override
    public PropertyResourceBundle createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.PropertyResourceBundle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.PropertyResourceBundle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.PropertyResourceBundle]

}
