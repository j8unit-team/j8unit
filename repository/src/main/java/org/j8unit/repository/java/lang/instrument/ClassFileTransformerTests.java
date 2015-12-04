package org.j8unit.repository.java.lang.instrument;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.instrument.ClassFileTransformer interface java.lang.instrument.ClassFileTransformer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.instrument.ClassFileTransformerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ClassFileTransformerTests<SUT extends java.lang.instrument.ClassFileTransformer>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.instrument.ClassFileTransformer#transform(java.lang.ClassLoader,java.lang.String,java.lang.Class,java.security.ProtectionDomain,byte[]) public abstract byte[] java.lang.instrument.ClassFileTransformer.transform(java.lang.ClassLoader,java.lang.String,java.lang.Class,java.security.ProtectionDomain,byte[]) throws java.lang.instrument.IllegalClassFormatException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_ClassLoader_String_Class_ProtectionDomain_byteArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
