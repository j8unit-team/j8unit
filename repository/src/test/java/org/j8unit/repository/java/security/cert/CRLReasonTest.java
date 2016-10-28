package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.cert.CRLReason;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class CRLReasonTest
implements org.j8unit.repository.java.security.cert.CRLReasonTests<CRLReason> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CRLReason]

}
