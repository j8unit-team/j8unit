package org.j8unit.repository.javax.xml.crypto.dsig.dom;

import javax.xml.crypto.dsig.dom.DOMValidateContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMValidateContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.dom.DOMValidateContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMValidateContextClassTest
implements DOMValidateContextClassTests<DOMValidateContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

    @Override
    public Class<DOMValidateContext> createNewSUT() {
        return DOMValidateContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.dom.DOMValidateContext#DOMValidateContext(java.security.Key, org.w3c.dom.Node)
     * public javax.xml.crypto.dsig.dom.DOMValidateContext(java.security.Key,org.w3c.dom.Node)}.
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
    public void create_DOMValidateContext_Key_Node()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DOMValidateContext sut = null; // = new DOMValidateContext(java.security.Key, org.w3c.dom.Node);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.dom.DOMValidateContext#DOMValidateContext(javax.xml.crypto.KeySelector, org.w3c.dom.Node)
     * public javax.xml.crypto.dsig.dom.DOMValidateContext(javax.xml.crypto.KeySelector,org.w3c.dom.Node)}.
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
    public void create_DOMValidateContext_KeySelector_Node()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DOMValidateContext sut = null; // = new DOMValidateContext(javax.xml.crypto.KeySelector,
                                             // org.w3c.dom.Node);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

}
