package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
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
public class ConcurrentHashMapTest<K, V>
implements FactoryBasedJ8UnitTest<ConcurrentHashMap<K, V>>, ConcurrentHashMapTests<ConcurrentHashMap<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ConcurrentHashMap]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ConcurrentHashMap::new);
    }

    @Parameter(0)
    public Callable<ConcurrentHashMap<K, V>> sutFactory;

    @Override
    public Callable<ConcurrentHashMap<K, V>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ConcurrentHashMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ConcurrentHashMap]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeySetView} (by simply reusing
     * the J8Unit test interface {@link KeySetViewTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeySetViewTest<K, V>
    implements KeySetViewTests<KeySetView<K, V>, K, V> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ConcurrentHashMap$KeySetView]

        @Override
        public KeySetView<K, V> createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ConcurrentHashMap.KeySetView], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ConcurrentHashMap$KeySetView]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ConcurrentHashMap$KeySetView]

    }

}
