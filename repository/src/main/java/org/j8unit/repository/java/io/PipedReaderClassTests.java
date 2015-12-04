package org.j8unit.repository.java.io;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.io.PipedReader class java.io.PipedReader},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.io.PipedReaderTests}.
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
 * @see org.j8unit.repository.java.io.PipedReaderTests
 */
@Category(J8UnitRepository.class)
public abstract interface PipedReaderClassTests<SUT extends Class<? extends java.io.PipedReader>>
extends org.j8unit.repository.java.io.ReaderClassTests<SUT>
{

    /**
     * Test method for {@link java.io.PipedReader#PipedReader(int) public java.io.PipedReader(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.PipedReader sut = null; // = new PipedReader(int);
    }

    /**
     * Test method for {@link java.io.PipedReader#PipedReader() public java.io.PipedReader()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.PipedReader sut = null; // = new PipedReader();
    }

    /**
     * Test method for {@link java.io.PipedReader#PipedReader(java.io.PipedWriter,int) public java.io.PipedReader(java.io.PipedWriter,int) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader_PipedWriter_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.PipedReader sut = null; // = new PipedReader(java.io.PipedWriter,int);
    }

    /**
     * Test method for {@link java.io.PipedReader#PipedReader(java.io.PipedWriter) public java.io.PipedReader(java.io.PipedWriter) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader_PipedWriter() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.PipedReader sut = null; // = new PipedReader(java.io.PipedWriter);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.io.PipedReader> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.PipedReader.class.isAssignableFrom(sut));
    }

}
