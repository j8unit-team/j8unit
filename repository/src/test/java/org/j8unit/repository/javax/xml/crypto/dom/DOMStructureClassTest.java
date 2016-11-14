package org.j8unit.repository.javax.xml.crypto.dom;

import javax.xml.crypto.dom.DOMStructure;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMStructure} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dom.DOMStructureClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMStructureClassTest
implements DOMStructureClassTests<DOMStructure> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dom.DOMStructure]

    @Override
    public Class<DOMStructure> createNewSUT() {
        return DOMStructure.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dom.DOMStructure#DOMStructure(org.w3c.dom.Node) public
     * javax.xml.crypto.dom.DOMStructure(org.w3c.dom.Node)}.
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
    public void create_DOMStructure_Node()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DOMStructure sut = null; // = new DOMStructure(org.w3c.dom.Node);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dom.DOMStructure]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dom.DOMStructure]

}
