package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NotFoundReasonTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundReasonTests<org.omg.CosNaming.NamingContextPackage.NotFoundReason> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.CosNaming.NamingContextPackage.NotFoundReason.not_context, //
                                org.omg.CosNaming.NamingContextPackage.NotFoundReason.missing_node, //
                                org.omg.CosNaming.NamingContextPackage.NotFoundReason.not_object);
    }

    @Parameter(0)
    public org.omg.CosNaming.NamingContextPackage.NotFoundReason sut;

    @Override
    public org.omg.CosNaming.NamingContextPackage.NotFoundReason createNewSUT() {
        return this.sut;
    }

}
