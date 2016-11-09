package org.j8unit.repository.javax.management.loading;

import javax.management.loading.PrivateClassLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrivateClassLoader} (by simply
 * reusing the J8Unit test interface {@link PrivateClassLoaderTests}).
 */

@RunWith(J8Unit4.class)
public class PrivateClassLoaderTest
implements PrivateClassLoaderTests<PrivateClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.PrivateClassLoader]

    @Override
    public PrivateClassLoader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.loading.PrivateClassLoader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.loading.PrivateClassLoader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.PrivateClassLoader]

}
