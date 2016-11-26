package org.j8unit.repository.java.util.spi;

import java.util.spi.ResourceBundleControlProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ResourceBundleControlProvider} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.spi.ResourceBundleControlProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ResourceBundleControlProviderClassTest
implements ResourceBundleControlProviderClassTests<ResourceBundleControlProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.ResourceBundleControlProvider]

    @Override
    public Class<ResourceBundleControlProvider> createNewSUT() {
        return ResourceBundleControlProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.spi.ResourceBundleControlProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.ResourceBundleControlProvider]

}
