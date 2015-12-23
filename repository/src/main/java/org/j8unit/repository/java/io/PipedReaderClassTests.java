package org.j8unit.repository.java.io;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.io.PipedReader class java.io.PipedReader}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.io.PipedReaderTests}.
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
 * @see org.j8unit.repository.java.io.PipedReaderTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.io.PipedReader
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PipedReaderClassTests<SUT extends java.io.PipedReader>
extends org.j8unit.repository.java.io.ReaderClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.PipedReader#PipedReader() public java.io.PipedReader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PipedReader#PipedReader()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedReader sut = null; // = new PipedReader();
    }

    /**
     * <p>
     * Test method for {@link java.io.PipedReader#PipedReader(int) public java.io.PipedReader(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PipedReader#PipedReader(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedReader sut = null; // = new PipedReader(int);
    }

    /**
     * <p>
     * Test method for {@link java.io.PipedReader#PipedReader(java.io.PipedWriter) public
     * java.io.PipedReader(java.io.PipedWriter) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PipedReader#PipedReader(java.io.PipedWriter)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader_PipedWriter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedReader sut = null; // = new PipedReader(java.io.PipedWriter);
    }

    /**
     * <p>
     * Test method for {@link java.io.PipedReader#PipedReader(java.io.PipedWriter, int) public
     * java.io.PipedReader(java.io.PipedWriter,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.PipedReader#PipedReader(java.io.PipedWriter, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedReader_PipedWriter_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedReader sut = null; // = new PipedReader(java.io.PipedWriter, int);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.io.PipedReader#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.PipedReader.class.isAssignableFrom(sut));
    }

}
