package org.j8unit.repository.java.security;

import java.security.KeyPair;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyPairClassTest
implements org.j8unit.repository.java.security.KeyPairClassTests<KeyPair> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyPair]

    @Override
    public Class<KeyPair> createNewSUT() {
        return KeyPair.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyPair#KeyPair(java.security.PublicKey, java.security.PrivateKey) public
     * java.security.KeyPair(java.security.PublicKey,java.security.PrivateKey)}.
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
    public void create_KeyPair_PublicKey_PrivateKey()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyPair sut = null; // = new KeyPair(java.security.PublicKey, java.security.PrivateKey);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.KeyPair]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyPair]

}
