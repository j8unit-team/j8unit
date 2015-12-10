package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyClassTest
implements org.j8unit.repository.javax.security.auth.PolicyClassTests<javax.security.auth.Policy> {

    @Override
    public Class<javax.security.auth.Policy> createNewSUT() {
        return javax.security.auth.Policy.class;
    }

}
