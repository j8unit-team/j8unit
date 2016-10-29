package org.j8unit.repository.java.security.spec;

import java.security.spec.PSSParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PSSParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.PSSParameterSpecClassTests<PSSParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.PSSParameterSpec]

    @Override
    public Class<PSSParameterSpec> createNewSUT() {
        return PSSParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.PSSParameterSpec#PSSParameterSpec(String, String, java.security.spec.AlgorithmParameterSpec, int, int)
     * public
     * java.security.spec.PSSParameterSpec(java.lang.String,java.lang.String,java.security.spec.AlgorithmParameterSpec,int,int)}.
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
    public void create_PSSParameterSpec_String_String_AlgorithmParameterSpec_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PSSParameterSpec sut = null; // = new PSSParameterSpec(String, String,
                                           // java.security.spec.AlgorithmParameterSpec, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.PSSParameterSpec#PSSParameterSpec(int) public
     * java.security.spec.PSSParameterSpec(int)}.
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
    public void create_PSSParameterSpec_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PSSParameterSpec sut = null; // = new PSSParameterSpec(int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.PSSParameterSpec]

}
