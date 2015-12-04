package org.j8unit.repository.java.nio.file.attribute;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.attribute.PosixFilePermissions class
 * java.nio.file.attribute.PosixFilePermissions}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.java.nio.file.attribute.PosixFilePermissionsTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.PosixFilePermissionsTests
 */
@Category(J8UnitRepository.class)
public abstract interface PosixFilePermissionsClassTests<SUT extends Class<? extends java.nio.file.attribute.PosixFilePermissions>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.nio.file.attribute.PosixFilePermissions> sut = createNewSUT();
        // assert assignability
        assertTrue(java.nio.file.attribute.PosixFilePermissions.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFilePermissions#toString(java.util.Set) public static
     * java.lang.String java.nio.file.attribute.PosixFilePermissions.toString(java.util.Set)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFilePermissions#asFileAttribute(java.util.Set) public static
     * java.nio.file.attribute.FileAttribute
     * java.nio.file.attribute.PosixFilePermissions.asFileAttribute(java.util.Set)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asFileAttribute_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFilePermissions#fromString(java.lang.String) public static
     * java.util.Set java.nio.file.attribute.PosixFilePermissions.fromString(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fromString_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
