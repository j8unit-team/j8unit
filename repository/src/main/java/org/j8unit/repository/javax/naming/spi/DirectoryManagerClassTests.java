package org.j8unit.repository.javax.naming.spi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.spi.DirectoryManager class javax.naming.spi.DirectoryManager}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.naming.spi.DirectoryManagerTests}.
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
 * @see org.j8unit.repository.javax.naming.spi.DirectoryManagerTests
 */
@Category(J8UnitRepository.class)
public abstract interface DirectoryManagerClassTests<SUT extends Class<? extends javax.naming.spi.DirectoryManager>>
extends org.j8unit.repository.javax.naming.spi.NamingManagerClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.naming.spi.DirectoryManager> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.naming.spi.DirectoryManager.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.DirectoryManager#getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * public static java.lang.Object
     * javax.naming.spi.DirectoryManager.getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * throws java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.DirectoryManager#getContinuationDirContext(javax.naming.CannotProceedException) public
     * static javax.naming.directory.DirContext
     * javax.naming.spi.DirectoryManager.getContinuationDirContext(javax.naming.CannotProceedException) throws
     * javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContinuationDirContext_CannotProceedException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.DirectoryManager#getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * public static javax.naming.spi.DirStateFactory$Result
     * javax.naming.spi.DirectoryManager.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStateToBind_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
