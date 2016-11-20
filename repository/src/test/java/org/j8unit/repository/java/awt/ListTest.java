package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.List;
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
public class ListTest
implements FactoryBasedJ8UnitTest<List>, org.j8unit.repository.java.awt.ListTests<List> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.List]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(List::new);
    }

    @Parameter(0)
    public Callable<List> sutFactory;

    @Override
    public Callable<List> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.List]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.List]

}
