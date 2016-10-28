package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.InvocationHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvocationHandlerClassTest
implements org.j8unit.repository.java.lang.reflect.InvocationHandlerClassTests<InvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.InvocationHandler]

    @Override
    public Class<InvocationHandler> createNewSUT() {
        return InvocationHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.InvocationHandler]

}
