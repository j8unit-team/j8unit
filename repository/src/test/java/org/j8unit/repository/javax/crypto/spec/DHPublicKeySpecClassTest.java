package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DHPublicKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DHPublicKeySpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.DHPublicKeySpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class DHPublicKeySpecClassTest
implements DHPublicKeySpecClassTests<DHPublicKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.DHPublicKeySpec]

    @Override
    public Class<DHPublicKeySpec> createNewSUT() {
        return DHPublicKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.DHPublicKeySpec#DHPublicKeySpec(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger)
     * public javax.crypto.spec.DHPublicKeySpec(java.math.BigInteger,java.math.BigInteger,java.math.BigInteger)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DHPublicKeySpec_BigInteger_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DHPublicKeySpec sut = null; // = new DHPublicKeySpec(java.math.BigInteger, java.math.BigInteger,
                                          // java.math.BigInteger);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.DHPublicKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.DHPublicKeySpec]

}
