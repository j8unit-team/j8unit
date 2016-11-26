package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Proxy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Proxy} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.ProxyTests}).
 */
@RunWith(J8Unit4.class)
public class ProxyTest
implements ProxyTests<Proxy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Proxy]

    @Override
    public Proxy createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.Proxy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.Proxy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.Proxy]

}
