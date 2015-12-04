package org.j8unit.repository.javax.xml.transform.dom;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.transform.dom.DOMLocator interface javax.xml.transform.dom.DOMLocator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.dom.DOMLocatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DOMLocatorTests<SUT extends javax.xml.transform.dom.DOMLocator>
extends org.j8unit.repository.javax.xml.transform.SourceLocatorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.transform.dom.DOMLocator#getOriginatingNode() public abstract org.w3c.dom.Node javax.xml.transform.dom.DOMLocator.getOriginatingNode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOriginatingNode() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
