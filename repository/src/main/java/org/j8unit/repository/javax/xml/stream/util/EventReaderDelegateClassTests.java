package org.j8unit.repository.javax.xml.stream.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.stream.util.EventReaderDelegate class javax.xml.stream.util.EventReaderDelegate},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.stream.util.EventReaderDelegateTests}.
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
 * @see org.j8unit.repository.javax.xml.stream.util.EventReaderDelegateTests
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventReaderDelegateClassTests<SUT extends javax.xml.stream.util.EventReaderDelegate>
extends org.j8unit.repository.javax.xml.stream.XMLEventReaderClassTests, org.j8unit.repository.java.lang.ObjectClassTests {

    /**
     * Test method for {@link javax.xml.stream.util.EventReaderDelegate#EventReaderDelegate() public
     * javax.xml.stream.util.EventReaderDelegate()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_EventReaderDelegate()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.util.EventReaderDelegate sut = null; // = new EventReaderDelegate();
    }

    /**
     * Test method for
     * {@link javax.xml.stream.util.EventReaderDelegate#EventReaderDelegate(javax.xml.stream.XMLEventReader) public
     * javax.xml.stream.util.EventReaderDelegate(javax.xml.stream.XMLEventReader)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_EventReaderDelegate_XMLEventReader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.util.EventReaderDelegate sut = null; // = new
                                                                    // EventReaderDelegate(javax.xml.stream.XMLEventReader);
    }

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this test class (caused
    // by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract Class<SUT> createNewSUT();

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.stream.util.EventReaderDelegate.class.isAssignableFrom(sut));
    }

}
