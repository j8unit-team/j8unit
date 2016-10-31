package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.LinkedList;
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
public class LinkedListTest<E>
implements FactoryBasedJ8UnitTest<LinkedList<E>>, org.j8unit.repository.java.util.LinkedListTests<LinkedList<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.LinkedList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LinkedList::new);
    }

    @Parameter(0)
    public Callable<LinkedList<E>> sutFactory;

    @Override
    public Callable<LinkedList<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.LinkedList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.LinkedList]

}
