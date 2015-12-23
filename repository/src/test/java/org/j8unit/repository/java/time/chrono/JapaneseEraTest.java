package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JapaneseEraTest
implements org.j8unit.repository.java.time.chrono.JapaneseEraTests<java.time.chrono.JapaneseEra> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.time.chrono.JapaneseEra.SHOWA, //
                                java.time.chrono.JapaneseEra.HEISEI, //
                                java.time.chrono.JapaneseEra.TAISHO, //
                                java.time.chrono.JapaneseEra.MEIJI);
    }

    @Parameter(0)
    public java.time.chrono.JapaneseEra sut;

    @Override
    public java.time.chrono.JapaneseEra createNewSUT() {
        return this.sut;
    }

}
