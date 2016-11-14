package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HMACParameterSpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.HMACParameterSpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class HMACParameterSpecClassTest
implements HMACParameterSpecClassTests<HMACParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.HMACParameterSpec]

    @Override
    public Class<HMACParameterSpec> createNewSUT() {
        return HMACParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.HMACParameterSpec#HMACParameterSpec(int) public
     * javax.xml.crypto.dsig.spec.HMACParameterSpec(int)}.
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
    public void create_HMACParameterSpec_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HMACParameterSpec sut = null; // = new HMACParameterSpec(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.HMACParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.HMACParameterSpec]

}
