package org.j8unit.repository.org.omg.IOP;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.IOP.TaggedProfileHolder class org.omg.IOP.TaggedProfileHolder}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.TaggedProfileHolderTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.IOP.TaggedProfileHolderTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TaggedProfileHolderClassTests<SUT extends org.omg.IOP.TaggedProfileHolder>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.IOP.TaggedProfileHolder#TaggedProfileHolder() public
     * org.omg.IOP.TaggedProfileHolder()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TaggedProfileHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.IOP.TaggedProfileHolder sut = null; // = new TaggedProfileHolder();
    }

    /**
     * Test method for {@link org.omg.IOP.TaggedProfileHolder#TaggedProfileHolder(org.omg.IOP.TaggedProfile) public
     * org.omg.IOP.TaggedProfileHolder(org.omg.IOP.TaggedProfile)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TaggedProfileHolder_TaggedProfile()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.IOP.TaggedProfileHolder sut = null; // = new TaggedProfileHolder(org.omg.IOP.TaggedProfile);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.IOP.TaggedProfileHolder.class.isAssignableFrom(sut));
    }

}
