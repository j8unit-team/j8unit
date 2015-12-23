package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DialogTypeSelectionTest
implements org.j8unit.repository.javax.print.attribute.standard.DialogTypeSelectionTests<javax.print.attribute.standard.DialogTypeSelection> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.DialogTypeSelection.NATIVE, //
                                javax.print.attribute.standard.DialogTypeSelection.COMMON);
    }

    @Parameter(0)
    public javax.print.attribute.standard.DialogTypeSelection sut;

    @Override
    public javax.print.attribute.standard.DialogTypeSelection createNewSUT() {
        return this.sut;
    }

}
