package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.SecretKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecretKeySpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.SecretKeySpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class SecretKeySpecClassTest
implements SecretKeySpecClassTests<SecretKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.SecretKeySpec]

    @Override
    public Class<SecretKeySpec> createNewSUT() {
        return SecretKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.SecretKeySpec#SecretKeySpec(byte[], String) public
     * javax.crypto.spec.SecretKeySpec(byte[],java.lang.String)}.
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
    public void create_SecretKeySpec_byteArray_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecretKeySpec sut = null; // = new SecretKeySpec(byte[], String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.SecretKeySpec#SecretKeySpec(byte[], int, int, String) public
     * javax.crypto.spec.SecretKeySpec(byte[],int,int,java.lang.String)}.
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
    public void create_SecretKeySpec_byteArray_int_int_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecretKeySpec sut = null; // = new SecretKeySpec(byte[], int, int, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.SecretKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.SecretKeySpec]

}
