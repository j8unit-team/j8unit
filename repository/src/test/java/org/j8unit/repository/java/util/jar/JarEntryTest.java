package org.j8unit.repository.java.util.jar;

import java.util.jar.JarEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JarEntry} (by simply reusing the
 * J8Unit test interface {@link JarEntryTests}).
 */

@RunWith(J8Unit4.class)
public class JarEntryTest
implements JarEntryTests<JarEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarEntry]

    @Override
    public JarEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.jar.JarEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.JarEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.JarEntry]

}
