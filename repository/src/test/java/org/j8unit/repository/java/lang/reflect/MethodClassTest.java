package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Method;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Method} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.MethodClassTests}).
 */
@RunWith(J8Unit4.class)
public class MethodClassTest
implements MethodClassTests<Method> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Method]

    @Override
    public Class<Method> createNewSUT() {
        return Method.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Method]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Method]

}
