package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CopyOnWriteArraySetTest<E>
implements FactoryBasedJ8UnitTest<CopyOnWriteArraySet<E>>, CopyOnWriteArraySetTests<CopyOnWriteArraySet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CopyOnWriteArraySet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CopyOnWriteArraySet::new);
    }

    @Parameter(0)
    public Callable<CopyOnWriteArraySet<E>> sutFactory;

    @Override
    public Callable<CopyOnWriteArraySet<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CopyOnWriteArraySet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CopyOnWriteArraySet]

}
