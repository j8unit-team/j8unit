package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CopyOnWriteArrayListTest<E>
implements FactoryBasedJ8UnitTest<CopyOnWriteArrayList<E>>, CopyOnWriteArrayListTests<CopyOnWriteArrayList<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CopyOnWriteArrayList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CopyOnWriteArrayList::new);
    }

    @Parameter(0)
    public Callable<CopyOnWriteArrayList<E>> sutFactory;

    @Override
    public Callable<CopyOnWriteArrayList<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CopyOnWriteArrayList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CopyOnWriteArrayList]

}
