package org.j8unit.repository.javax.xml.crypto.dsig.dom;

import java.security.Key;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(J8Unit4.class)
public class DOMValidateContextClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.dom.DOMValidateContextClassTests<DOMValidateContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

    @Override
    public Class<DOMValidateContext> createNewSUT() {
        return DOMValidateContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link DOMValidateContext#DOMValidateContext(KeySelector, Node) public
     * javax.xml.crypto.dsig.dom.DOMValidateContext(javax.xml.crypto.KeySelector,org.w3c.dom.Node)}.
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
        final DOMValidateContext sut = null; // = new DOMValidateContext(KeySelector, Node);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link DOMValidateContext#DOMValidateContext(Key, Node) public
     * javax.xml.crypto.dsig.dom.DOMValidateContext(java.security.Key,org.w3c.dom.Node)}.
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
        final DOMValidateContext sut = null; // = new DOMValidateContext(Key, Node);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

}
