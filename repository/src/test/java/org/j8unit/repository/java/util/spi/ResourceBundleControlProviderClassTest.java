package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResourceBundleControlProviderClassTest
implements org.j8unit.repository.java.util.spi.ResourceBundleControlProviderClassTests<java.util.spi.ResourceBundleControlProvider> {

    @Override
    public Class<java.util.spi.ResourceBundleControlProvider> createNewSUT() {
        return java.util.spi.ResourceBundleControlProvider.class;
    }

}
