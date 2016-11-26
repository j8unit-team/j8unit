package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DESKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DESKeySpec} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.spec.DESKeySpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class DESKeySpecClassTest
implements DESKeySpecClassTests<DESKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.DESKeySpec]

    @Override
    public Class<DESKeySpec> createNewSUT() {
        return DESKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.crypto.spec.DESKeySpec#DESKeySpec(byte[])
     * public javax.crypto.spec.DESKeySpec(byte[]) throws java.security.InvalidKeyException}.
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
    public void create_DESKeySpec_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DESKeySpec sut = null; // = new DESKeySpec(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.DESKeySpec#DESKeySpec(byte[], int) public javax.crypto.spec.DESKeySpec(byte[],int)
     * throws java.security.InvalidKeyException}.
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
    public void create_DESKeySpec_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DESKeySpec sut = null; // = new DESKeySpec(byte[], int);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.spec.DESKeySpec#isParityAdjusted(byte[], int) public static boolean
     * javax.crypto.spec.DESKeySpec.isParityAdjusted(byte[],int) throws java.security.InvalidKeyException}.
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
    public void test_isParityAdjusted_byteArray_int()
    throws Exception {
        // write some test for {@link javax.crypto.spec.DESKeySpec#isParityAdjusted(byte[], int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.spec.DESKeySpec#isWeak(byte[], int)
     * public static boolean javax.crypto.spec.DESKeySpec.isWeak(byte[],int) throws java.security.InvalidKeyException}.
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
    public void test_isWeak_byteArray_int()
    throws Exception {
        // write some test for {@link javax.crypto.spec.DESKeySpec#isWeak(byte[], int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.DESKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.DESKeySpec]

}
