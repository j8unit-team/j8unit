package org.j8unit.repository.javax.crypto.spec;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.crypto.spec.PBEKeySpec class javax.crypto.spec.PBEKeySpec}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.spec.PBEKeySpecTests}.
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
 * @see org.j8unit.repository.javax.crypto.spec.PBEKeySpecTests
 */
@Category(J8UnitRepository.class)
public abstract interface PBEKeySpecClassTests<SUT extends Class<? extends javax.crypto.spec.PBEKeySpec>>
extends org.j8unit.repository.java.security.spec.KeySpecClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.crypto.spec.PBEKeySpec#PBEKeySpec(char[]) public
     * javax.crypto.spec.PBEKeySpec(char[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PBEKeySpec_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.crypto.spec.PBEKeySpec sut = null; // = new PBEKeySpec(char[]);
    }

    /**
     * Test method for {@link javax.crypto.spec.PBEKeySpec#PBEKeySpec(char[],byte[],int) public
     * javax.crypto.spec.PBEKeySpec(char[],byte[],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PBEKeySpec_charArray_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.crypto.spec.PBEKeySpec sut = null; // = new PBEKeySpec(char[],byte[],int);
    }

    /**
     * Test method for {@link javax.crypto.spec.PBEKeySpec#PBEKeySpec(char[],byte[],int,int) public
     * javax.crypto.spec.PBEKeySpec(char[],byte[],int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PBEKeySpec_charArray_byteArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.crypto.spec.PBEKeySpec sut = null; // = new PBEKeySpec(char[],byte[],int,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.crypto.spec.PBEKeySpec> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.crypto.spec.PBEKeySpec.class.isAssignableFrom(sut));
    }

}
