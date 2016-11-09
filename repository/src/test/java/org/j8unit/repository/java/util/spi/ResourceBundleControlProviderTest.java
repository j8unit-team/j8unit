package org.j8unit.repository.java.util.spi;

import java.util.spi.ResourceBundleControlProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ResourceBundleControlProvider} (by
 * simply reusing the J8Unit test interface {@link ResourceBundleControlProviderTests}).
 */

@RunWith(J8Unit4.class)
public class ResourceBundleControlProviderTest
implements ResourceBundleControlProviderTests<ResourceBundleControlProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.ResourceBundleControlProvider]

    @Override
    public ResourceBundleControlProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.ResourceBundleControlProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.spi.ResourceBundleControlProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.spi.ResourceBundleControlProvider]

}
