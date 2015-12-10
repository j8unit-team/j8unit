package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PKIXReasonTest
implements org.j8unit.repository.java.security.cert.PKIXReasonTests<java.security.cert.PKIXReason> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.security.cert.PKIXReason.class);
    }

    @Parameter(0)
    public java.security.cert.PKIXReason sut;

    @Override
    public java.security.cert.PKIXReason createNewSUT() {
        return this.sut;
    }

}
