package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.instrument.ClassFileTransformer interface
 * java.lang.instrument.ClassFileTransformer}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ClassFileTransformerClassTests}.
 * </p>
 *
 * @see java.lang.instrument.ClassFileTransformer interface java.lang.instrument.ClassFileTransformer (the hereby
 *      targeted class-under-test class)
 * @see ClassFileTransformerClassTests ClassFileTransformerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassFileTransformerTests<SUT extends java.lang.instrument.ClassFileTransformer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.ClassFileTransformer#transform(ClassLoader, String, Class, java.security.ProtectionDomain, byte[])
     * public abstract byte[]
     * java.lang.instrument.ClassFileTransformer.transform(java.lang.ClassLoader,java.lang.String,java.lang.Class
     * <?>,java.security.ProtectionDomain,byte[]) throws java.lang.instrument.IllegalClassFormatException}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.ClassFileTransformer#transform(ClassLoader, String, Class, java.security.ProtectionDomain, byte[])
     * public abstract byte[]
     * java.lang.instrument.ClassFileTransformer.transform(java.lang.ClassLoader,java.lang.String,java.lang.Class,java.security.ProtectionDomain,byte[])
     * throws java.lang.instrument.IllegalClassFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.ClassFileTransformer#transform(ClassLoader, String, Class,
     *      java.security.ProtectionDomain, byte[]) public abstract byte[]
     *      java.lang.instrument.ClassFileTransformer.transform(java.lang.ClassLoader,java.lang.String,java.lang.Class,
     *      java.security.ProtectionDomain,byte[]) throws java.lang.instrument.IllegalClassFormatException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_ClassLoader_String_Class_ProtectionDomain_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
