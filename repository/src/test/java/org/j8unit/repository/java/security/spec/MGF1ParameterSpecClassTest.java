package org.j8unit.repository.java.security.spec;

import java.security.spec.MGF1ParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MGF1ParameterSpec} (by simply reusing the
 * J8Unit test interface {@link MGF1ParameterSpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class MGF1ParameterSpecClassTest
implements MGF1ParameterSpecClassTests<MGF1ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.MGF1ParameterSpec]

    @Override
    public Class<MGF1ParameterSpec> createNewSUT() {
        return MGF1ParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.MGF1ParameterSpec#MGF1ParameterSpec(String) public
     * java.security.spec.MGF1ParameterSpec(java.lang.String)}.
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
    public void create_MGF1ParameterSpec_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MGF1ParameterSpec sut = null; // = new MGF1ParameterSpec(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.MGF1ParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.MGF1ParameterSpec]

}
