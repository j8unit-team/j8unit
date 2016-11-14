package org.j8unit.repository.javax.naming.ldap;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.ldap.InitialLdapContext;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InitialLdapContextTest
implements FactoryBasedJ8UnitTest<InitialLdapContext>, InitialLdapContextTests<InitialLdapContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.InitialLdapContext]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InitialLdapContext::new);
    }

    @Parameter(0)
    public Callable<InitialLdapContext> sutFactory;

    @Override
    public Callable<InitialLdapContext> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.InitialLdapContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.InitialLdapContext]

}
