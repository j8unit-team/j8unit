package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SetOverrideTypeTest
implements org.j8unit.repository.org.omg.CORBA.SetOverrideTypeTests<org.omg.CORBA.SetOverrideType> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.CORBA.SetOverrideType.ADD_OVERRIDE, //
                                org.omg.CORBA.SetOverrideType.SET_OVERRIDE);
    }

    @Parameter(0)
    public org.omg.CORBA.SetOverrideType sut;

    @Override
    public org.omg.CORBA.SetOverrideType createNewSUT() {
        return this.sut;
    }

}
