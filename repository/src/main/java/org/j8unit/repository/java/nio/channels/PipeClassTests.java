package org.j8unit.repository.java.nio.channels;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.Pipe class java.nio.channels.Pipe}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.PipeTests}.
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
 * @see org.j8unit.repository.java.nio.channels.PipeTests
 */
@Category(J8UnitRepository.class)
public abstract interface PipeClassTests<SUT extends Class<? extends java.nio.channels.Pipe>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.nio.channels.Pipe$SinkChannel class java.nio.channels.Pipe$SinkChannel}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.nio.channels.PipeTests.SinkChannelTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.nio.channels.PipeTests.SinkChannelTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SinkChannelClassTests<SUT extends Class<? extends java.nio.channels.Pipe.SinkChannel>>
    extends org.j8unit.repository.java.nio.channels.WritableByteChannelClassTests<SUT>,
    org.j8unit.repository.java.nio.channels.GatheringByteChannelClassTests<SUT>,
    org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.nio.channels.Pipe.SinkChannel> sut = createNewSUT();
            // assert assignability
            assertTrue(java.nio.channels.Pipe.SinkChannel.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.nio.channels.Pipe$SourceChannel class java.nio.channels.Pipe$SourceChannel},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.nio.channels.PipeTests.SourceChannelTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.nio.channels.PipeTests.SourceChannelTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SourceChannelClassTests<SUT extends Class<? extends java.nio.channels.Pipe.SourceChannel>>
    extends org.j8unit.repository.java.nio.channels.ReadableByteChannelClassTests<SUT>,
    org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests<SUT>,
    org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.nio.channels.Pipe.SourceChannel> sut = createNewSUT();
            // assert assignability
            assertTrue(java.nio.channels.Pipe.SourceChannel.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Pipe#open() public static java.nio.channels.Pipe
     * java.nio.channels.Pipe.open() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open()
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
        final Class<? extends java.nio.channels.Pipe> sut = createNewSUT();
        // assert assignability
        assertTrue(java.nio.channels.Pipe.class.isAssignableFrom(sut));
    }

}
