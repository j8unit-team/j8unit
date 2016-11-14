package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Executable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Executable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.ExecutableTests}).
 */

@RunWith(J8Unit4.class)
public class ExecutableTest
implements ExecutableTests<Executable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Executable]

    @Override
    public Executable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.Executable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.Executable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.Executable]

}
