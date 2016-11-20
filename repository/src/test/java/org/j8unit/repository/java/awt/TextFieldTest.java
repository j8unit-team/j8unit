package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.TextField;
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
public class TextFieldTest
implements FactoryBasedJ8UnitTest<TextField>, TextFieldTests<TextField> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.TextField]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(TextField::new);
    }

    @Parameter(0)
    public Callable<TextField> sutFactory;

    @Override
    public Callable<TextField> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.TextField]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.TextField]

}
