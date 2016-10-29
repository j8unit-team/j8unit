package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.chrono.JapaneseEra;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JapaneseEraTest
implements org.j8unit.repository.java.time.chrono.JapaneseEraTests<JapaneseEra> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.JapaneseEra]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JapaneseEra.SHOWA, //
                                JapaneseEra.HEISEI, //
                                JapaneseEra.TAISHO, //
                                JapaneseEra.MEIJI);
    }

    @Parameter(0)
    public JapaneseEra sut;

    @Override
    public JapaneseEra createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.JapaneseEra]

}
