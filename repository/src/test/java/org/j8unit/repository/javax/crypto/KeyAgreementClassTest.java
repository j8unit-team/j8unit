package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyAgreement;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyAgreementClassTest
implements org.j8unit.repository.javax.crypto.KeyAgreementClassTests<KeyAgreement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.KeyAgreement]

    @Override
    public Class<KeyAgreement> createNewSUT() {
        return KeyAgreement.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.KeyAgreement#getInstance(String, String) public static final javax.crypto.KeyAgreement
     * javax.crypto.KeyAgreement.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
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
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link javax.crypto.KeyAgreement#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.KeyAgreement#getInstance(String, java.security.Provider) public static final
     * javax.crypto.KeyAgreement javax.crypto.KeyAgreement.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_Provider()
    throws Exception {
        // write some test for {@link javax.crypto.KeyAgreement#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.KeyAgreement#getInstance(String) public
     * static final javax.crypto.KeyAgreement javax.crypto.KeyAgreement.getInstance(java.lang.String) throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link javax.crypto.KeyAgreement#getInstance(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.KeyAgreement]

}
