package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.ParameterMode;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParameterMode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ParameterModeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ParameterModeTest
implements ParameterModeTests<ParameterMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ParameterMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ParameterMode.PARAM_INOUT, //
                                ParameterMode.PARAM_OUT, //
                                ParameterMode.PARAM_IN);
    }

    @Parameter(0)
    public ParameterMode sut;

    @Override
    public ParameterMode createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.ParameterMode]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.ParameterMode]

}
