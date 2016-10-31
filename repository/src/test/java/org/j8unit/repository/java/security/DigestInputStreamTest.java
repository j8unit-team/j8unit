package org.j8unit.repository.java.security;

import java.security.DigestInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestInputStreamTest
implements org.j8unit.repository.java.security.DigestInputStreamTests<DigestInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.DigestInputStream]

    @Override
    public DigestInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.DigestInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.DigestInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.DigestInputStream]

}
