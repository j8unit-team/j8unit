package org.j8unit.repository.java.security;

import java.security.Key;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyTest
implements org.j8unit.repository.java.security.KeyTests<Key> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Key]

    @Override
    public Key createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Key], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Key]

}
