package org.j8unit.repository.org.omg.CosNaming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CosNaming.BindingType;

@RunWith(J8Unit4.class)
public class BindingTypeTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeTests<BindingType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BindingType.ncontext, //
                                BindingType.nobject);
    }

    @Parameter(0)
    public BindingType sut;

    @Override
    public BindingType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingType]

}
