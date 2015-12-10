package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GuardedObjectTest
implements org.j8unit.repository.java.security.GuardedObjectTests<java.security.GuardedObject> {

    @Override
    public java.security.GuardedObject createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.GuardedObject] available.");
    }

}
