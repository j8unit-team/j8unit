package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.CardLayout;
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
public class CardLayoutTest
implements FactoryBasedJ8UnitTest<CardLayout>, CardLayoutTests<CardLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.CardLayout]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CardLayout::new);
    }

    @Parameter(0)
    public Callable<CardLayout> sutFactory;

    @Override
    public Callable<CardLayout> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.CardLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.CardLayout]

}
