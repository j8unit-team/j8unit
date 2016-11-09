package org.j8unit.repository.java.security;

import java.security.Signer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Signer} (by simply reusing the J8Unit
 * test interface {@link SignerTests}).
 */

@RunWith(J8Unit4.class)
public class SignerTest
implements SignerTests<Signer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Signer]

    @Override
    public Signer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Signer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Signer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Signer]

}
