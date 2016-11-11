package org.j8unit.repository.java.security;

import java.security.CodeSigner;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CodeSigner} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.CodeSignerTests}).
 */

@RunWith(J8Unit4.class)
public class CodeSignerTest
implements CodeSignerTests<CodeSigner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.CodeSigner]

    @Override
    public CodeSigner createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.CodeSigner], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.CodeSigner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.CodeSigner]

}
