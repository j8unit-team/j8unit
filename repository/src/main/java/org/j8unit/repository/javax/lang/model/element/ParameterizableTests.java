package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.Parameterizable interface javax.lang.model.element.Parameterizable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.ParameterizableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ParameterizableTests<SUT extends javax.lang.model.element.Parameterizable>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Parameterizable#getTypeParameters() public abstract java.util.List javax.lang.model.element.Parameterizable.getTypeParameters()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeParameters() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
