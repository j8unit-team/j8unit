package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.InvocationHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvocationHandler} (by simply reusing the
 * J8Unit test interface {@link InvocationHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvocationHandlerClassTest
implements InvocationHandlerClassTests<InvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.InvocationHandler]

    @Override
    public Class<InvocationHandler> createNewSUT() {
        return InvocationHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.InvocationHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.InvocationHandler]

}
