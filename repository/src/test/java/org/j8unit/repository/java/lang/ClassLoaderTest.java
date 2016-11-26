package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ClassLoader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.ClassLoaderTests}).
 */
@RunWith(J8Unit4.class)
public class ClassLoaderTest
implements ClassLoaderTests<ClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ClassLoader]

    @Override
    public ClassLoader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.ClassLoader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.ClassLoader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.ClassLoader]

}
