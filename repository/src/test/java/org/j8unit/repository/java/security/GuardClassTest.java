package org.j8unit.repository.java.security;

import java.security.Guard;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GuardClassTest
implements org.j8unit.repository.java.security.GuardClassTests<Guard> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Guard]

    @Override
    public Class<Guard> createNewSUT() {
        return Guard.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Guard]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Guard]

}
