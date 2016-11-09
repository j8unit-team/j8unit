package org.j8unit.repository.java.awt.image.renderable;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.image.renderable.ParameterBlock;
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
public class ParameterBlockTest
implements FactoryBasedJ8UnitTest<ParameterBlock>, ParameterBlockTests<ParameterBlock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.renderable.ParameterBlock]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ParameterBlock::new);
    }

    @Parameter(0)
    public Callable<ParameterBlock> sutFactory;

    @Override
    public Callable<ParameterBlock> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.renderable.ParameterBlock]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.renderable.ParameterBlock]

}
