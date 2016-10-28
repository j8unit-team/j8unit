package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.cert.PKIXReason;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PKIXReasonTest
implements org.j8unit.repository.java.security.cert.PKIXReasonTests<PKIXReason> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXReason]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(PKIXReason.class);
    }

    @Parameter(0)
    public PKIXReason sut;

    @Override
    public PKIXReason createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXReason]

}
