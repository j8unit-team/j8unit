package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.PBEParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PBEParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.PBEParameterSpecClassTests<PBEParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.PBEParameterSpec]

    @Override
    public Class<PBEParameterSpec> createNewSUT() {
        return PBEParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.PBEParameterSpec#PBEParameterSpec(byte[], int) public
     * javax.crypto.spec.PBEParameterSpec(byte[],int)}.
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
    public void create_PBEParameterSpec_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PBEParameterSpec sut = null; // = new PBEParameterSpec(byte[], int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.PBEParameterSpec#PBEParameterSpec(byte[], int, java.security.spec.AlgorithmParameterSpec)
     * public javax.crypto.spec.PBEParameterSpec(byte[],int,java.security.spec.AlgorithmParameterSpec)}.
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
    public void create_PBEParameterSpec_byteArray_int_AlgorithmParameterSpec()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PBEParameterSpec sut = null; // = new PBEParameterSpec(byte[], int,
                                           // java.security.spec.AlgorithmParameterSpec);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.PBEParameterSpec]

}
