package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ConcurrentLinkedQueueTest<E>
implements FactoryBasedJ8UnitTest<ConcurrentLinkedQueue<E>>,
org.j8unit.repository.java.util.concurrent.ConcurrentLinkedQueueTests<ConcurrentLinkedQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ConcurrentLinkedQueue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ConcurrentLinkedQueue::new);
    }

    @Parameter(0)
    public Callable<ConcurrentLinkedQueue<E>> sutFactory;

    @Override
    public Callable<ConcurrentLinkedQueue<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ConcurrentLinkedQueue]

}
