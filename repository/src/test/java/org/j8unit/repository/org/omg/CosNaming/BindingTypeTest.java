package org.j8unit.repository.org.omg.CosNaming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BindingTypeTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeTests<org.omg.CosNaming.BindingType> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.CosNaming.BindingType.ncontext, //
                                org.omg.CosNaming.BindingType.nobject);
    }

    @Parameter(0)
    public org.omg.CosNaming.BindingType sut;

    @Override
    public org.omg.CosNaming.BindingType createNewSUT() {
        return this.sut;
    }

}
