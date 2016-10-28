package org.j8unit.repository.java.lang.ref;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.ref.ReferenceQueue;
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
public class ReferenceQueueTest<T>
implements FactoryBasedJ8UnitTest<ReferenceQueue<T>>, org.j8unit.repository.java.lang.ref.ReferenceQueueTests<ReferenceQueue<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ref.ReferenceQueue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ReferenceQueue::new);
    }

    @Parameter(0)
    public Callable<ReferenceQueue<T>> sutFactory;

    @Override
    public Callable<ReferenceQueue<T>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ref.ReferenceQueue]

}
