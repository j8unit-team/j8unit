package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GuardClassTest
implements org.j8unit.repository.java.security.GuardClassTests<java.security.Guard> {

    @Override
    public Class<java.security.Guard> createNewSUT() {
        return java.security.Guard.class;
    }

}
