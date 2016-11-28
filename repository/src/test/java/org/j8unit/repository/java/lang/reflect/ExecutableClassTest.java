package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Executable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Executable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.ExecutableClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutableClassTest
implements ExecutableClassTests<Executable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Executable]

    @Override
    public Class<Executable> createNewSUT() {
        return Executable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Executable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Executable]

}
