package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.NamespaceSupport;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamespaceSupport} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.helpers.NamespaceSupportClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamespaceSupportClassTest
implements NamespaceSupportClassTests<NamespaceSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.helpers.NamespaceSupport]

    @Override
    public Class<NamespaceSupport> createNewSUT() {
        return NamespaceSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.helpers.NamespaceSupport#NamespaceSupport() public org.xml.sax.helpers.NamespaceSupport()}.
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
    public void create_NamespaceSupport()
    throws Exception {
        // create new instance
        final NamespaceSupport sut = new NamespaceSupport();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.helpers.NamespaceSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.helpers.NamespaceSupport]

}
