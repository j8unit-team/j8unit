package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.chrono.MinguoEra;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MinguoEra} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.chrono.MinguoEraTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MinguoEraTest
implements MinguoEraTests<MinguoEra> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.MinguoEra]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(MinguoEra.class);
    }

    @Parameter(0)
    public MinguoEra sut;

    @Override
    public MinguoEra createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.MinguoEra]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.MinguoEra]

}
