package org.j8unit.repository.java.io;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.io.ObjectInputValidation interface java.io.ObjectInputValidation},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.io.ObjectInputValidationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjectInputValidationTests<SUT extends java.io.ObjectInputValidation>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputValidation#validateObject() public abstract void java.io.ObjectInputValidation.validateObject() throws java.io.InvalidObjectException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validateObject() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
