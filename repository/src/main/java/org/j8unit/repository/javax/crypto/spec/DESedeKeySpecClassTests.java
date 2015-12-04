package org.j8unit.repository.javax.crypto.spec;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.crypto.spec.DESedeKeySpec class javax.crypto.spec.DESedeKeySpec}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.spec.DESedeKeySpecTests}.
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
 * @see org.j8unit.repository.javax.crypto.spec.DESedeKeySpecTests
 */
@Category(J8UnitRepository.class)
public abstract interface DESedeKeySpecClassTests<SUT extends Class<? extends javax.crypto.spec.DESedeKeySpec>>
extends org.j8unit.repository.java.security.spec.KeySpecClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.crypto.spec.DESedeKeySpec#DESedeKeySpec(byte[]) public
     * javax.crypto.spec.DESedeKeySpec(byte[]) throws java.security.InvalidKeyException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DESedeKeySpec_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.crypto.spec.DESedeKeySpec sut = null; // = new DESedeKeySpec(byte[]);
    }

    /**
     * Test method for {@link javax.crypto.spec.DESedeKeySpec#DESedeKeySpec(byte[],int) public
     * javax.crypto.spec.DESedeKeySpec(byte[],int) throws java.security.InvalidKeyException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DESedeKeySpec_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.crypto.spec.DESedeKeySpec sut = null; // = new DESedeKeySpec(byte[],int);
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DESedeKeySpec#isParityAdjusted(byte[],int) public static boolean
     * javax.crypto.spec.DESedeKeySpec.isParityAdjusted(byte[],int) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isParityAdjusted_byteArray_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.crypto.spec.DESedeKeySpec> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.crypto.spec.DESedeKeySpec.class.isAssignableFrom(sut));
    }

}
