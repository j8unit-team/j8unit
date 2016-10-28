package org.j8unit.repository.java.security;

import java.security.Principal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrincipalClassTest
implements org.j8unit.repository.java.security.PrincipalClassTests<Principal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Principal]

    @Override
    public Class<Principal> createNewSUT() {
        return Principal.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Principal]

}
