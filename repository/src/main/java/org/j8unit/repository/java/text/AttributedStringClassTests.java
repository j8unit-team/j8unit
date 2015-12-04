package org.j8unit.repository.java.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.text.AttributedString class java.text.AttributedString}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.text.AttributedStringTests}.
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
 * @see org.j8unit.repository.java.text.AttributedStringTests
 */
@Category(J8UnitRepository.class)
public abstract interface AttributedStringClassTests<SUT extends Class<? extends java.text.AttributedString>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for
     * {@link java.text.AttributedString#AttributedString(java.text.AttributedCharacterIterator,int,int,java.text.AttributedCharacterIterator.Attribute[])
     * public
     * java.text.AttributedString(java.text.AttributedCharacterIterator,int,int,java.text.AttributedCharacterIterator$Attribute[])}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributedString_AttributedCharacterIterator_int_int_AttributeArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.AttributedString sut = null; // = new
                                                     // AttributedString(java.text.AttributedCharacterIterator,int,int,java.text.AttributedCharacterIterator.Attribute[]);
    }

    /**
     * Test method for {@link java.text.AttributedString#AttributedString(java.text.AttributedCharacterIterator,int,int)
     * public java.text.AttributedString(java.text.AttributedCharacterIterator,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributedString_AttributedCharacterIterator_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.AttributedString sut = null; // = new
                                                     // AttributedString(java.text.AttributedCharacterIterator,int,int);
    }

    /**
     * Test method for {@link java.text.AttributedString#AttributedString(java.text.AttributedCharacterIterator) public
     * java.text.AttributedString(java.text.AttributedCharacterIterator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributedString_AttributedCharacterIterator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.AttributedString sut = null; // = new AttributedString(java.text.AttributedCharacterIterator);
    }

    /**
     * Test method for {@link java.text.AttributedString#AttributedString(java.lang.String) public
     * java.text.AttributedString(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributedString_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.AttributedString sut = null; // = new AttributedString(java.lang.String);
    }

    /**
     * Test method for {@link java.text.AttributedString#AttributedString(java.lang.String,java.util.Map) public
     * java.text.AttributedString(java.lang.String,java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributedString_String_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.AttributedString sut = null; // = new AttributedString(java.lang.String,java.util.Map);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.text.AttributedString> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.AttributedString.class.isAssignableFrom(sut));
    }

}
