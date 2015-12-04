package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.annotation.processing.SupportedSourceVersion interface javax.annotation.processing.SupportedSourceVersion},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.annotation.processing.SupportedSourceVersionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SupportedSourceVersionTests<SUT extends javax.annotation.processing.SupportedSourceVersion>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.SupportedSourceVersion#value() public abstract javax.lang.model.SourceVersion javax.annotation.processing.SupportedSourceVersion.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
