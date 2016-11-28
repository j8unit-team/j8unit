package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DHParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DHParameterSpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.DHParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class DHParameterSpecClassTest
implements DHParameterSpecClassTests<DHParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.DHParameterSpec]

    @Override
    public Class<DHParameterSpec> createNewSUT() {
        return DHParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.DHParameterSpec#DHParameterSpec(java.math.BigInteger, java.math.BigInteger, int) public
     * javax.crypto.spec.DHParameterSpec(java.math.BigInteger,java.math.BigInteger,int)}.
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
    public void create_DHParameterSpec_BigInteger_BigInteger_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DHParameterSpec sut = null; // = new DHParameterSpec(java.math.BigInteger, java.math.BigInteger, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.DHParameterSpec#DHParameterSpec(java.math.BigInteger, java.math.BigInteger) public
     * javax.crypto.spec.DHParameterSpec(java.math.BigInteger,java.math.BigInteger)}.
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
    public void create_DHParameterSpec_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DHParameterSpec sut = null; // = new DHParameterSpec(java.math.BigInteger, java.math.BigInteger);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.DHParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.DHParameterSpec]

}
