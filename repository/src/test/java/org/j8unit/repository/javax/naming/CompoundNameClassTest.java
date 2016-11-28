package org.j8unit.repository.javax.naming;

import javax.naming.CompoundName;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompoundName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.CompoundNameClassTests}).
 */
@RunWith(J8Unit4.class)
public class CompoundNameClassTest
implements CompoundNameClassTests<CompoundName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.CompoundName]

    @Override
    public Class<CompoundName> createNewSUT() {
        return CompoundName.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.CompoundName#CompoundName(String, java.util.Properties) public
     * javax.naming.CompoundName(java.lang.String,java.util.Properties) throws javax.naming.InvalidNameException}.
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
    public void create_CompoundName_String_Properties()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CompoundName sut = null; // = new CompoundName(String, java.util.Properties);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.CompoundName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.CompoundName]

}
