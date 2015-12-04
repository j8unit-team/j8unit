package org.j8unit.repository.org.xml.sax;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.xml.sax.XMLFilter interface org.xml.sax.XMLFilter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.xml.sax.XMLFilterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLFilterTests<SUT extends org.xml.sax.XMLFilter>
extends org.j8unit.repository.org.xml.sax.XMLReaderTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#getParent() public abstract org.xml.sax.XMLReader org.xml.sax.XMLFilter.getParent()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.XMLFilter#setParent(org.xml.sax.XMLReader) public abstract void org.xml.sax.XMLFilter.setParent(org.xml.sax.XMLReader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParent_XMLReader() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
