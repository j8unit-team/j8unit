package org.j8unit.repository.java.io;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.io.PrintStream class java.io.PrintStream}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.io.PrintStreamTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.io.PrintStreamTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.io.PrintStream
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintStreamClassTests<SUT extends java.io.PrintStream>
extends org.j8unit.repository.java.lang.AppendableClassTests<SUT>, org.j8unit.repository.java.io.CloseableClassTests<SUT>,
org.j8unit.repository.java.io.FilterOutputStreamClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.io.File) public java.io.PrintStream(java.io.File)
     * throws java.io.FileNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.io.File);
    }

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.io.File, java.lang.String) public
     * java.io.PrintStream(java.io.File,java.lang.String) throws
     * java.io.FileNotFoundException,java.io.UnsupportedEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.io.File, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_File_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.io.File, java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.io.OutputStream) public
     * java.io.PrintStream(java.io.OutputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.io.OutputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.io.OutputStream);
    }

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.io.OutputStream, boolean) public
     * java.io.PrintStream(java.io.OutputStream,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.io.OutputStream, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_OutputStream_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.io.OutputStream, boolean);
    }

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.io.OutputStream, boolean, java.lang.String) public
     * java.io.PrintStream(java.io.OutputStream,boolean,java.lang.String) throws java.io.UnsupportedEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.io.OutputStream, boolean, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_OutputStream_boolean_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.io.OutputStream, boolean, java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.lang.String) public
     * java.io.PrintStream(java.lang.String) throws java.io.FileNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.io.PrintStream#PrintStream(java.lang.String, java.lang.String) public
     * java.io.PrintStream(java.lang.String,java.lang.String) throws
     * java.io.FileNotFoundException,java.io.UnsupportedEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PrintStream#PrintStream(java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintStream_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PrintStream sut = null; // = new PrintStream(java.lang.String, java.lang.String);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.io.PrintStream#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.PrintStream.class.isAssignableFrom(sut));
    }

}
