package org.j8unit.repository.java.applet;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.applet.Applet;
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
public class AppletTest
implements FactoryBasedJ8UnitTest<Applet>, org.j8unit.repository.java.applet.AppletTests<Applet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.Applet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Applet::new);
    }

    @Parameter(0)
    public Callable<Applet> sutFactory;

    @Override
    public Callable<Applet> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.Applet]

}
