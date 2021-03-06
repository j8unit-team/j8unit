package org.j8unit.repository.java.nio.charset;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.charset.CodingErrorAction;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CodingErrorAction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.charset.CodingErrorActionTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CodingErrorActionTest
implements CodingErrorActionTests<CodingErrorAction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.CodingErrorAction]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CodingErrorAction.IGNORE, //
                                CodingErrorAction.REPLACE, //
                                CodingErrorAction.REPORT);
    }

    @Parameter(0)
    public CodingErrorAction sut;

    @Override
    public CodingErrorAction createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.CodingErrorAction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.CodingErrorAction]

}
