package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LinkedHashSetTest<E>
implements FactoryBasedJ8UnitTest<LinkedHashSet<E>>, LinkedHashSetTests<LinkedHashSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.LinkedHashSet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LinkedHashSet::new);
    }

    @Parameter(0)
    public Callable<LinkedHashSet<E>> sutFactory;

    @Override
    public Callable<LinkedHashSet<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.LinkedHashSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.LinkedHashSet]

}
