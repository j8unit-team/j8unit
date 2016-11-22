package org.j8unit.repository.javax.security.auth.login;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.auth.login.AccountLockedException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccountLockedExceptionTest
implements FactoryBasedJ8UnitTest<AccountLockedException>, AccountLockedExceptionTests<AccountLockedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.AccountLockedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(AccountLockedException::new);
    }

    @Parameter(0)
    public Callable<AccountLockedException> sutFactory;

    @Override
    public Callable<AccountLockedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.AccountLockedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.AccountLockedException]

}
