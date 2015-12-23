package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.instrument.ClassFileTransformer interface
 * java.lang.instrument.ClassFileTransformer}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.instrument.ClassFileTransformerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.instrument.ClassFileTransformerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.instrument.ClassFileTransformer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassFileTransformerTests<SUT extends java.lang.instrument.ClassFileTransformer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.ClassFileTransformer#transform(java.lang.ClassLoader, java.lang.String, java.lang.Class, java.security.ProtectionDomain, byte[])
     * public abstract byte[]
     * java.lang.instrument.ClassFileTransformer.transform(java.lang.ClassLoader,java.lang.String,java.lang.Class,java.security.ProtectionDomain,byte[])
     * throws java.lang.instrument.IllegalClassFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.instrument.ClassFileTransformer#transform(java.lang.ClassLoader, java.lang.String,
     *             java.lang.Class, java.security.ProtectionDomain, byte[])
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
