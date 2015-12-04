package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.InputMethodEvent class java.awt.event.InputMethodEvent}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.InputMethodEventTests}.
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
 * @see org.j8unit.repository.java.awt.event.InputMethodEventTests
 */
@Category(J8UnitRepository.class)
public abstract interface InputMethodEventClassTests<SUT extends Class<? extends java.awt.event.InputMethodEvent>>
extends org.j8unit.repository.java.awt.AWTEventClassTests<SUT> {

    /**
     * Test method for
     * {@link java.awt.event.InputMethodEvent#InputMethodEvent(java.awt.Component,int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)
     * public
     * java.awt.event.InputMethodEvent(java.awt.Component,int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputMethodEvent_Component_int_AttributedCharacterIterator_int_TextHitInfo_TextHitInfo()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.InputMethodEvent sut = null; // = new
                                                          // InputMethodEvent(java.awt.Component,int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo);
    }

    /**
     * Test method for
     * {@link java.awt.event.InputMethodEvent#InputMethodEvent(java.awt.Component,int,long,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)
     * public
     * java.awt.event.InputMethodEvent(java.awt.Component,int,long,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputMethodEvent_Component_int_long_AttributedCharacterIterator_int_TextHitInfo_TextHitInfo()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.InputMethodEvent sut = null; // = new
                                                          // InputMethodEvent(java.awt.Component,int,long,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo);
    }

    /**
     * Test method for
     * {@link java.awt.event.InputMethodEvent#InputMethodEvent(java.awt.Component,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)
     * public
     * java.awt.event.InputMethodEvent(java.awt.Component,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputMethodEvent_Component_int_TextHitInfo_TextHitInfo()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.InputMethodEvent sut = null; // = new
                                                          // InputMethodEvent(java.awt.Component,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.event.InputMethodEvent> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.event.InputMethodEvent.class.isAssignableFrom(sut));
    }

}
