package org.j8unit.repository.javax.security.auth.spi;

import javax.security.auth.spi.LoginModule;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoginModuleTest
implements org.j8unit.repository.javax.security.auth.spi.LoginModuleTests<LoginModule> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.spi.LoginModule]

    @Override
    public LoginModule createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.spi.LoginModule], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.spi.LoginModule]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.spi.LoginModule]

}
