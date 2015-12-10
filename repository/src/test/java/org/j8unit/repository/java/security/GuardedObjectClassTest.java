package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GuardedObjectClassTest
implements org.j8unit.repository.java.security.GuardedObjectClassTests<java.security.GuardedObject> {

    @Override
    public Class<java.security.GuardedObject> createNewSUT() {
        return java.security.GuardedObject.class;
    }

}
