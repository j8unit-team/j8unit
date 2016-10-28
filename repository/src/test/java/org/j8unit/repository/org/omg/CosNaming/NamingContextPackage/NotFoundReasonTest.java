package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CosNaming.NamingContextPackage.NotFoundReason;

@RunWith(J8Unit4.class)
public class NotFoundReasonTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundReasonTests<NotFoundReason> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundReason]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NotFoundReason.not_context, //
                                NotFoundReason.missing_node, //
                                NotFoundReason.not_object);
    }

    @Parameter(0)
    public NotFoundReason sut;

    @Override
    public NotFoundReason createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundReason]

}
