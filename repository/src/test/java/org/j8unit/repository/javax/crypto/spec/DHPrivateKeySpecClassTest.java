package org.j8unit.repository.javax.crypto.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPrivateKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DHPrivateKeySpecClassTests<DHPrivateKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.DHPrivateKeySpec]

    @Override
    public Class<DHPrivateKeySpec> createNewSUT() {
        return DHPrivateKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link DHPrivateKeySpec#DHPrivateKeySpec(BigInteger, BigInteger, BigInteger) public
     * javax.crypto.spec.DHPrivateKeySpec(java.math.BigInteger,java.math.BigInteger,java.math.BigInteger)}.
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
    public void create_DHPrivateKeySpec_BigInteger_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DHPrivateKeySpec sut = null; // = new DHPrivateKeySpec(BigInteger, BigInteger, BigInteger);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.DHPrivateKeySpec]

}
