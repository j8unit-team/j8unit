package org.j8unit.repository.javax.swing.text.html.parser;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.parser.AttributeList class javax.swing.text.html.parser.AttributeList},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.html.parser.AttributeListTests}.
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
 * @see org.j8unit.repository.javax.swing.text.html.parser.AttributeListTests
 */
@Category(J8UnitRepository.class)
public abstract interface AttributeListClassTests<SUT extends Class<? extends javax.swing.text.html.parser.AttributeList>>
extends org.j8unit.repository.javax.swing.text.html.parser.DTDConstantsClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.text.html.parser.AttributeList#AttributeList(java.lang.String) public
     * javax.swing.text.html.parser.AttributeList(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributeList_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.parser.AttributeList sut = null; // = new AttributeList(java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.swing.text.html.parser.AttributeList#AttributeList(java.lang.String,int,int,java.lang.String,java.util.Vector,javax.swing.text.html.parser.AttributeList)
     * public
     * javax.swing.text.html.parser.AttributeList(java.lang.String,int,int,java.lang.String,java.util.Vector,javax.swing.text.html.parser.AttributeList)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AttributeList_String_int_int_String_Vector_AttributeList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.parser.AttributeList sut = null; // = new
                                                                     // AttributeList(java.lang.String,int,int,java.lang.String,java.util.Vector,javax.swing.text.html.parser.AttributeList);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.parser.AttributeList#name2type(java.lang.String) public static int
     * javax.swing.text.html.parser.AttributeList.name2type(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name2type_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.parser.AttributeList#type2name(int) public static java.lang.String
     * javax.swing.text.html.parser.AttributeList.type2name(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type2name_int()
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
        final Class<? extends javax.swing.text.html.parser.AttributeList> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.html.parser.AttributeList.class.isAssignableFrom(sut));
    }

}
