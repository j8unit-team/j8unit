package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.ParameterMode;

@RunWith(J8Unit4.class)
public class ParameterModeTest
implements org.j8unit.repository.org.omg.CORBA.ParameterModeTests<ParameterMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ParameterMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ParameterMode]

}
