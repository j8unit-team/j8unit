package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.net.Proxy;
import java.net.Proxy.Type;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Proxy} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.net.ProxyTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ProxyTest
implements org.j8unit.repository.java.net.ProxyTests<Proxy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Proxy]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Proxy.NO_PROXY);
    }

    @Parameter(0)
    public Proxy sut;

    @Override
    public Proxy createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Proxy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Proxy]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.net.ProxyTests.TypeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.java.net.ProxyTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Proxy$Type]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Type.class);
        }

        @Parameter(0)
        public Type sut;

        @Override
        public Type createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Proxy$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Proxy$Type]

    }

}
