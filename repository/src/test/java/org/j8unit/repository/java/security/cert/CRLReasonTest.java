package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.cert.CRLReason;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CRLReason} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CRLReasonTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CRLReasonTest
implements CRLReasonTests<CRLReason> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CRLReason]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(CRLReason.class);
    }

    @Parameter(0)
    public CRLReason sut;

    @Override
    public CRLReason createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CRLReason]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CRLReason]

}
