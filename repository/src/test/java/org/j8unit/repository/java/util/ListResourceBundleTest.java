package org.j8unit.repository.java.util;

import java.util.ListResourceBundle;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ListResourceBundle} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.ListResourceBundleTests}).
 */

@RunWith(J8Unit4.class)
public class ListResourceBundleTest
implements ListResourceBundleTests<ListResourceBundle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ListResourceBundle]

    @Override
    public ListResourceBundle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.ListResourceBundle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.ListResourceBundle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.ListResourceBundle]

}
