package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.CookiePolicy;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CookiePolicyTest
implements org.j8unit.repository.java.net.CookiePolicyTests<CookiePolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.CookiePolicy]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CookiePolicy.ACCEPT_ALL, //
                                CookiePolicy.ACCEPT_NONE, //
                                CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    @Parameter(0)
    public CookiePolicy sut;

    @Override
    public CookiePolicy createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.CookiePolicy]

}
