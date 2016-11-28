package org.j8unit.repository.javax.swing.text;

import javax.swing.text.ElementIterator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ElementIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.ElementIteratorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ElementIteratorClassTest
implements ElementIteratorClassTests<ElementIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.ElementIterator]

    @Override
    public Class<ElementIterator> createNewSUT() {
        return ElementIterator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.ElementIterator#ElementIterator(javax.swing.text.Element) public
     * javax.swing.text.ElementIterator(javax.swing.text.Element)}.
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
    public void create_ElementIterator_Element()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ElementIterator sut = null; // = new ElementIterator(javax.swing.text.Element);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.ElementIterator#ElementIterator(javax.swing.text.Document) public
     * javax.swing.text.ElementIterator(javax.swing.text.Document)}.
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
    public void create_ElementIterator_Document()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ElementIterator sut = null; // = new ElementIterator(javax.swing.text.Document);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.ElementIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.ElementIterator]

}
