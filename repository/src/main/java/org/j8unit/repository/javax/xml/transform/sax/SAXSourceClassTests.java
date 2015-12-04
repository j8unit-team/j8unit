package org.j8unit.repository.javax.xml.transform.sax;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.transform.sax.SAXSource class javax.xml.transform.sax.SAXSource},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.xml.transform.sax.SAXSourceTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.sax.SAXSourceTests
 */
@Category(J8UnitRepository.class)
public abstract interface SAXSourceClassTests<SUT extends Class<? extends javax.xml.transform.sax.SAXSource>>
extends org.j8unit.repository.javax.xml.transform.SourceClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.xml.transform.sax.SAXSource#SAXSource(org.xml.sax.InputSource) public javax.xml.transform.sax.SAXSource(org.xml.sax.InputSource)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXSource_InputSource() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.transform.sax.SAXSource sut = null; // = new SAXSource(org.xml.sax.InputSource);
    }

    /**
     * Test method for {@link javax.xml.transform.sax.SAXSource#SAXSource(org.xml.sax.XMLReader,org.xml.sax.InputSource) public javax.xml.transform.sax.SAXSource(org.xml.sax.XMLReader,org.xml.sax.InputSource)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXSource_XMLReader_InputSource() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.transform.sax.SAXSource sut = null; // = new SAXSource(org.xml.sax.XMLReader,org.xml.sax.InputSource);
    }

    /**
     * Test method for {@link javax.xml.transform.sax.SAXSource#SAXSource() public javax.xml.transform.sax.SAXSource()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXSource() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.transform.sax.SAXSource sut = null; // = new SAXSource();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.xml.transform.sax.SAXSource> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.transform.sax.SAXSource.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.SAXSource#sourceToInputSource(javax.xml.transform.Source) public static org.xml.sax.InputSource javax.xml.transform.sax.SAXSource.sourceToInputSource(javax.xml.transform.Source)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sourceToInputSource_Source() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
