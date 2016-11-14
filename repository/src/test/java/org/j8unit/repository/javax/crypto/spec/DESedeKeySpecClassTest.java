package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DESedeKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DESedeKeySpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.DESedeKeySpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class DESedeKeySpecClassTest
implements DESedeKeySpecClassTests<DESedeKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.DESedeKeySpec]

    @Override
    public Class<DESedeKeySpec> createNewSUT() {
        return DESedeKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.DESedeKeySpec#DESedeKeySpec(byte[]) public javax.crypto.spec.DESedeKeySpec(byte[])
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
    public void create_DESedeKeySpec_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DESedeKeySpec sut = null; // = new DESedeKeySpec(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.DESedeKeySpec#DESedeKeySpec(byte[], int) public
     * javax.crypto.spec.DESedeKeySpec(byte[],int) throws java.security.InvalidKeyException}.
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
    public void create_DESedeKeySpec_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DESedeKeySpec sut = null; // = new DESedeKeySpec(byte[], int);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.spec.DESedeKeySpec#isParityAdjusted(byte[], int) public static boolean
     * javax.crypto.spec.DESedeKeySpec.isParityAdjusted(byte[],int) throws java.security.InvalidKeyException}.
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
        // write some test for {@link javax.crypto.spec.DESedeKeySpec#isParityAdjusted(byte[], int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.DESedeKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.DESedeKeySpec]

}
