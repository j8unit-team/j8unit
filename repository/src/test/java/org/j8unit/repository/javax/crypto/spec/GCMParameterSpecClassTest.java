package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.GCMParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GCMParameterSpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.GCMParameterSpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class GCMParameterSpecClassTest
implements GCMParameterSpecClassTests<GCMParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.GCMParameterSpec]

    @Override
    public Class<GCMParameterSpec> createNewSUT() {
        return GCMParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.GCMParameterSpec#GCMParameterSpec(int, byte[]) public
     * javax.crypto.spec.GCMParameterSpec(int,byte[])}.
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
    public void create_GCMParameterSpec_int_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GCMParameterSpec sut = null; // = new GCMParameterSpec(int, byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.GCMParameterSpec#GCMParameterSpec(int, byte[], int, int) public
     * javax.crypto.spec.GCMParameterSpec(int,byte[],int,int)}.
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
    public void create_GCMParameterSpec_int_byteArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GCMParameterSpec sut = null; // = new GCMParameterSpec(int, byte[], int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.GCMParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.GCMParameterSpec]

}
