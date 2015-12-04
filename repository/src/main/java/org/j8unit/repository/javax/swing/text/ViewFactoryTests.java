package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.ViewFactory interface javax.swing.text.ViewFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.ViewFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ViewFactoryTests<SUT extends javax.swing.text.ViewFactory>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.text.ViewFactory#create(javax.swing.text.Element) public abstract javax.swing.text.View javax.swing.text.ViewFactory.create(javax.swing.text.Element)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Element() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
