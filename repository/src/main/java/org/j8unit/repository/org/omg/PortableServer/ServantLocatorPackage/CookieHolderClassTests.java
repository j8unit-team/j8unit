package org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ServantLocatorPackage.CookieHolder class
 * org.omg.PortableServer.ServantLocatorPackage.CookieHolder}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage.CookieHolderTests}.
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
 * @see org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage.CookieHolderTests
 */
@Category(J8UnitRepository.class)
public abstract interface CookieHolderClassTests<SUT extends Class<? extends org.omg.PortableServer.ServantLocatorPackage.CookieHolder>>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.PortableServer.ServantLocatorPackage.CookieHolder#CookieHolder() public
     * org.omg.PortableServer.ServantLocatorPackage.CookieHolder()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CookieHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableServer.ServantLocatorPackage.CookieHolder sut = null; // = new CookieHolder();
    }

    /**
     * Test method for {@link org.omg.PortableServer.ServantLocatorPackage.CookieHolder#CookieHolder(java.lang.Object)
     * public org.omg.PortableServer.ServantLocatorPackage.CookieHolder(java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CookieHolder_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableServer.ServantLocatorPackage.CookieHolder sut = null; // = new
                                                                                    // CookieHolder(java.lang.Object);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.PortableServer.ServantLocatorPackage.CookieHolder> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableServer.ServantLocatorPackage.CookieHolder.class.isAssignableFrom(sut));
    }

}
