package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.GapContent;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class GapContentTest
implements FactoryBasedJ8UnitTest<GapContent>, GapContentTests<GapContent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.GapContent]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(GapContent::new);
    }

    @Parameter(0)
    public Callable<GapContent> sutFactory;

    @Override
    public Callable<GapContent> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.GapContent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.GapContent]

}
