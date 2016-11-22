package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CosNaming.NamingContextPackage.NotFoundReason;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotFoundReason} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundReasonTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NotFoundReasonTest
implements NotFoundReasonTests<NotFoundReason> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundReason]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundReason]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundReason]

}
