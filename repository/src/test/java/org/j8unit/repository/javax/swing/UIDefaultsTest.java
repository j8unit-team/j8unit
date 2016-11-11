package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.UIDefaults;
import javax.swing.UIDefaults.ActiveValue;
import javax.swing.UIDefaults.LazyInputMap;
import javax.swing.UIDefaults.LazyValue;
import javax.swing.UIDefaults.ProxyLazyValue;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UIDefaultsTest
implements FactoryBasedJ8UnitTest<UIDefaults>, UIDefaultsTests<UIDefaults> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIDefaults]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UIDefaults::new);
    }

    @Parameter(0)
    public Callable<UIDefaults> sutFactory;

    @Override
    public Callable<UIDefaults> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIDefaults]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIDefaults]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ActiveValue} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.UIDefaultsTests.ActiveValueTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ActiveValueTest
    implements ActiveValueTests<ActiveValue> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIDefaults$ActiveValue]

        @Override
        public ActiveValue createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.UIDefaults.ActiveValue], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIDefaults$ActiveValue]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIDefaults$ActiveValue]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link LazyInputMap} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.UIDefaultsTests.LazyInputMapTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LazyInputMapTest
    implements LazyInputMapTests<LazyInputMap> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIDefaults$LazyInputMap]

        @Override
        public LazyInputMap createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.UIDefaults.LazyInputMap], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIDefaults$LazyInputMap]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIDefaults$LazyInputMap]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ProxyLazyValue} (by simply
     * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.UIDefaultsTests.ProxyLazyValueTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ProxyLazyValueTest
    implements ProxyLazyValueTests<ProxyLazyValue> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIDefaults$ProxyLazyValue]

        @Override
        public ProxyLazyValue createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.UIDefaults.ProxyLazyValue], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIDefaults$ProxyLazyValue]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIDefaults$ProxyLazyValue]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link LazyValue} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.UIDefaultsTests.LazyValueTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LazyValueTest
    implements LazyValueTests<LazyValue> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIDefaults$LazyValue]

        @Override
        public LazyValue createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.UIDefaults.LazyValue], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIDefaults$LazyValue]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIDefaults$LazyValue]

    }

}
