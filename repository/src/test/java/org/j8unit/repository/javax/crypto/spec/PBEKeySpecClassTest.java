package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.PBEKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PBEKeySpec} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.spec.PBEKeySpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class PBEKeySpecClassTest
implements PBEKeySpecClassTests<PBEKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.PBEKeySpec]

    @Override
    public Class<PBEKeySpec> createNewSUT() {
        return PBEKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.PBEKeySpec#PBEKeySpec(char[], byte[], int) public
     * javax.crypto.spec.PBEKeySpec(char[],byte[],int)}.
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
    public void create_PBEKeySpec_charArray_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PBEKeySpec sut = null; // = new PBEKeySpec(char[], byte[], int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.PBEKeySpec#PBEKeySpec(char[], byte[], int, int) public
     * javax.crypto.spec.PBEKeySpec(char[],byte[],int,int)}.
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
    public void create_PBEKeySpec_charArray_byteArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PBEKeySpec sut = null; // = new PBEKeySpec(char[], byte[], int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.crypto.spec.PBEKeySpec#PBEKeySpec(char[])
     * public javax.crypto.spec.PBEKeySpec(char[])}.
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
    public void create_PBEKeySpec_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PBEKeySpec sut = null; // = new PBEKeySpec(char[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.PBEKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.PBEKeySpec]

}
