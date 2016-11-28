package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.RC5ParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RC5ParameterSpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.RC5ParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class RC5ParameterSpecClassTest
implements RC5ParameterSpecClassTests<RC5ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.RC5ParameterSpec]

    @Override
    public Class<RC5ParameterSpec> createNewSUT() {
        return RC5ParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.RC5ParameterSpec#RC5ParameterSpec(int, int, int) public
     * javax.crypto.spec.RC5ParameterSpec(int,int,int)}.
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
    public void create_RC5ParameterSpec_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RC5ParameterSpec sut = null; // = new RC5ParameterSpec(int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.RC5ParameterSpec#RC5ParameterSpec(int, int, int, byte[], int) public
     * javax.crypto.spec.RC5ParameterSpec(int,int,int,byte[],int)}.
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
    public void create_RC5ParameterSpec_int_int_int_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RC5ParameterSpec sut = null; // = new RC5ParameterSpec(int, int, int, byte[], int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.RC5ParameterSpec#RC5ParameterSpec(int, int, int, byte[]) public
     * javax.crypto.spec.RC5ParameterSpec(int,int,int,byte[])}.
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
    public void create_RC5ParameterSpec_int_int_int_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RC5ParameterSpec sut = null; // = new RC5ParameterSpec(int, int, int, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.RC5ParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.RC5ParameterSpec]

}
