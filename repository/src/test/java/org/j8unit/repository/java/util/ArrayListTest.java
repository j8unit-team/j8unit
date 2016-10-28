package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.ArrayList;
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
public class ArrayListTest<E>
implements FactoryBasedJ8UnitTest<ArrayList<E>>, org.j8unit.repository.java.util.ArrayListTests<ArrayList<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ArrayList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ArrayList::new);
    }

    @Parameter(0)
    public Callable<ArrayList<E>> sutFactory;

    @Override
    public Callable<ArrayList<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ArrayList]

}
