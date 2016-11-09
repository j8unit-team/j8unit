package org.j8unit.repository.java.security;

import java.security.SignedObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SignedObject} (by simply reusing the
 * J8Unit test interface {@link SignedObjectClassTests}).
 */

@RunWith(J8Unit4.class)
public class SignedObjectClassTest
implements SignedObjectClassTests<SignedObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.SignedObject]

    @Override
    public Class<SignedObject> createNewSUT() {
        return SignedObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SignedObject#SignedObject(java.io.Serializable, java.security.PrivateKey, java.security.Signature)
     * public java.security.SignedObject(java.io.Serializable,java.security.PrivateKey,java.security.Signature) throws
     * java.io.IOException,java.security.InvalidKeyException,java.security.SignatureException}.
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
    public void create_SignedObject_Serializable_PrivateKey_Signature()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SignedObject sut = null; // = new SignedObject(java.io.Serializable, java.security.PrivateKey,
                                       // java.security.Signature);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.SignedObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.SignedObject]

}
