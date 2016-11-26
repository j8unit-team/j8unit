package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.OAEPParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OAEPParameterSpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.OAEPParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class OAEPParameterSpecClassTest
implements OAEPParameterSpecClassTests<OAEPParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.OAEPParameterSpec]

    @Override
    public Class<OAEPParameterSpec> createNewSUT() {
        return OAEPParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.spec.OAEPParameterSpec#OAEPParameterSpec(String, String, java.security.spec.AlgorithmParameterSpec, javax.crypto.spec.PSource)
     * public
     * javax.crypto.spec.OAEPParameterSpec(java.lang.String,java.lang.String,java.security.spec.AlgorithmParameterSpec,javax.crypto.spec.PSource)}.
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
    public void create_OAEPParameterSpec_String_String_AlgorithmParameterSpec_PSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OAEPParameterSpec sut = null; // = new OAEPParameterSpec(String, String,
                                            // java.security.spec.AlgorithmParameterSpec, javax.crypto.spec.PSource);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.OAEPParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.OAEPParameterSpec]

}
