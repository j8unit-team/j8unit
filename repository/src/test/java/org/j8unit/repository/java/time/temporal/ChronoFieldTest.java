package org.j8unit.repository.java.time.temporal;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.temporal.ChronoField;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ChronoFieldTest
implements org.j8unit.repository.java.time.temporal.ChronoFieldTests<ChronoField> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.ChronoField]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(ChronoField.class);
    }

    @Parameter(0)
    public ChronoField sut;

    @Override
    public ChronoField createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.ChronoField]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.ChronoField]

}
