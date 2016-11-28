package org.j8unit.repository.java.security.spec;

import java.security.spec.ECPoint;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ECPoint} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.spec.ECPointClassTests}).
 */
@RunWith(J8Unit4.class)
public class ECPointClassTest
implements ECPointClassTests<ECPoint> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.ECPoint]

    @Override
    public Class<ECPoint> createNewSUT() {
        return ECPoint.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.ECPoint#ECPoint(java.math.BigInteger, java.math.BigInteger) public
     * java.security.spec.ECPoint(java.math.BigInteger,java.math.BigInteger)}.
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
    public void create_ECPoint_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ECPoint sut = null; // = new ECPoint(java.math.BigInteger, java.math.BigInteger);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.ECPoint]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.ECPoint]

}
