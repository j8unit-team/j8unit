package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.xpath.XPathFunction interface javax.xml.xpath.XPathFunction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.xpath.XPathFunctionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XPathFunctionTests<SUT extends javax.xml.xpath.XPathFunction>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.xpath.XPathFunction#evaluate(java.util.List) public abstract java.lang.Object javax.xml.xpath.XPathFunction.evaluate(java.util.List) throws javax.xml.xpath.XPathFunctionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
