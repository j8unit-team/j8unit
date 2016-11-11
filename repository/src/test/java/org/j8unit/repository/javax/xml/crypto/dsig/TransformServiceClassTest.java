package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.TransformService;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransformService} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.TransformServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransformServiceClassTest
implements TransformServiceClassTests<TransformService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.TransformService]

    @Override
    public Class<TransformService> createNewSUT() {
        return TransformService.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.TransformService#getInstance(String, String) public static
     * javax.xml.crypto.dsig.TransformService
     * javax.xml.crypto.dsig.TransformService.getInstance(java.lang.String,java.lang.String) throws
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
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link javax.xml.crypto.dsig.TransformService#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.TransformService#getInstance(String, String, java.security.Provider) public static
     * javax.xml.crypto.dsig.TransformService
     * javax.xml.crypto.dsig.TransformService.getInstance(java.lang.String,java.lang.String,java.security.Provider)
     * throws java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_String_Provider()
    throws Exception {
        // write some test for {@link javax.xml.crypto.dsig.TransformService#getInstance(String, String,
        // java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.TransformService#getInstance(String, String, String) public static
     * javax.xml.crypto.dsig.TransformService
     * javax.xml.crypto.dsig.TransformService.getInstance(java.lang.String,java.lang.String,java.lang.String) throws
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
    public void test_getInstance_String_String_String()
    throws Exception {
        // write some test for {@link javax.xml.crypto.dsig.TransformService#getInstance(String, String, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.TransformService]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.TransformService]

}
