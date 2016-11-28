package org.j8unit.repository.java.net;

import java.net.URLClassLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URLClassLoader} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.net.URLClassLoaderTests}).
 */
@RunWith(J8Unit4.class)
public class URLClassLoaderTest
implements URLClassLoaderTests<URLClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLClassLoader]

    @Override
    public URLClassLoader createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URLClassLoader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.URLClassLoader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.URLClassLoader]

}
