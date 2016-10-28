package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.SetOverrideType;

@RunWith(J8Unit4.class)
public class SetOverrideTypeTest
implements org.j8unit.repository.org.omg.CORBA.SetOverrideTypeTests<SetOverrideType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.SetOverrideType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SetOverrideType.ADD_OVERRIDE, //
                                SetOverrideType.SET_OVERRIDE);
    }

    @Parameter(0)
    public SetOverrideType sut;

    @Override
    public SetOverrideType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.SetOverrideType]

}
