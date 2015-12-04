package org.j8unit.repository.javax.xml.validation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.validation.SchemaFactoryLoader class javax.xml.validation.SchemaFactoryLoader},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.validation.SchemaFactoryLoaderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SchemaFactoryLoaderTests<SUT extends javax.xml.validation.SchemaFactoryLoader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.validation.SchemaFactoryLoader#newFactory(java.lang.String) public abstract javax.xml.validation.SchemaFactory javax.xml.validation.SchemaFactoryLoader.newFactory(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newFactory_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
