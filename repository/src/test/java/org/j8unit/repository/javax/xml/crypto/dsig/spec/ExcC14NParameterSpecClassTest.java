package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExcC14NParameterSpecClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.spec.ExcC14NParameterSpecClassTests<ExcC14NParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.ExcC14NParameterSpec]

    @Override
    public Class<ExcC14NParameterSpec> createNewSUT() {
        return ExcC14NParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.ExcC14NParameterSpec#ExcC14NParameterSpec(java.util.List) public
     * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec(java.util.List)}.
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
    public void create_ExcC14NParameterSpec_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExcC14NParameterSpec sut = null; // = new ExcC14NParameterSpec(java.util.List);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.ExcC14NParameterSpec#ExcC14NParameterSpec() public
     * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec()}.
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
    public void create_ExcC14NParameterSpec()
    throws Exception {
        // create new instance
        final ExcC14NParameterSpec sut = new ExcC14NParameterSpec();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.ExcC14NParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.ExcC14NParameterSpec]

}
