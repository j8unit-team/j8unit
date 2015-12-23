package org.j8unit.repository.java.nio.charset;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CodingErrorActionTest
implements org.j8unit.repository.java.nio.charset.CodingErrorActionTests<java.nio.charset.CodingErrorAction> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.nio.charset.CodingErrorAction.IGNORE, //
                                java.nio.charset.CodingErrorAction.REPLACE, //
                                java.nio.charset.CodingErrorAction.REPORT);
    }

    @Parameter(0)
    public java.nio.charset.CodingErrorAction sut;

    @Override
    public java.nio.charset.CodingErrorAction createNewSUT() {
        return this.sut;
    }

}
