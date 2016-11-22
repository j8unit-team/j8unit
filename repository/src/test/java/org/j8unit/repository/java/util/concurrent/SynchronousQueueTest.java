package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.SynchronousQueue;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SynchronousQueueTest<E>
implements FactoryBasedJ8UnitTest<SynchronousQueue<E>>, SynchronousQueueTests<SynchronousQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.SynchronousQueue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SynchronousQueue::new);
    }

    @Parameter(0)
    public Callable<SynchronousQueue<E>> sutFactory;

    @Override
    public Callable<SynchronousQueue<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.SynchronousQueue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.SynchronousQueue]

}
