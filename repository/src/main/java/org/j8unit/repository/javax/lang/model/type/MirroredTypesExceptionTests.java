package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.type.MirroredTypesException class javax.lang.model.type.MirroredTypesException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.type.MirroredTypesExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MirroredTypesExceptionTests<SUT extends javax.lang.model.type.MirroredTypesException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.MirroredTypesException#getTypeMirrors() public java.util.List javax.lang.model.type.MirroredTypesException.getTypeMirrors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeMirrors() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
