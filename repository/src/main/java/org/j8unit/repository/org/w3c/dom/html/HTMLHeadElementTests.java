package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.html.HTMLHeadElement interface org.w3c.dom.html.HTMLHeadElement},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.html.HTMLHeadElementClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLHeadElementTests<SUT extends org.w3c.dom.html.HTMLHeadElement>
extends org.j8unit.repository.org.w3c.dom.html.HTMLElementTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLHeadElement#getProfile() public abstract java.lang.String org.w3c.dom.html.HTMLHeadElement.getProfile()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProfile() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLHeadElement#setProfile(java.lang.String) public abstract void org.w3c.dom.html.HTMLHeadElement.setProfile(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setProfile_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
