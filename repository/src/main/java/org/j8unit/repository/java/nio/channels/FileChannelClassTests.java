package org.j8unit.repository.java.nio.channels;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.FileChannel class java.nio.channels.FileChannel}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.FileChannelTests}.
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
 * @see org.j8unit.repository.java.nio.channels.FileChannelTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileChannelClassTests<SUT extends Class<? extends java.nio.channels.FileChannel>>
extends org.j8unit.repository.java.nio.channels.SeekableByteChannelClassTests<SUT>, org.j8unit.repository.java.nio.channels.GatheringByteChannelClassTests<SUT>,
org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests<SUT>,
org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.nio.channels.FileChannel$MapMode class java.nio.channels.FileChannel$MapMode},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.nio.channels.FileChannelTests.MapModeTests}.
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
     * @see org.j8unit.repository.java.nio.channels.FileChannelTests.MapModeTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MapModeClassTests<SUT extends Class<? extends java.nio.channels.FileChannel.MapMode>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.nio.channels.FileChannel.MapMode> sut = createNewSUT();
            // assert assignability
            assertTrue(java.nio.channels.FileChannel.MapMode.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#open(java.nio.file.Path,java.nio.file.OpenOption...) public
     * static java.nio.channels.FileChannel
     * java.nio.channels.FileChannel.open(java.nio.file.Path,java.nio.file.OpenOption...) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.FileChannel#open(java.nio.file.Path,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * public static java.nio.channels.FileChannel
     * java.nio.channels.FileChannel.open(java.nio.file.Path,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_Path_Set_FileAttributeArray()
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
        final Class<? extends java.nio.channels.FileChannel> sut = createNewSUT();
        // assert assignability
        assertTrue(java.nio.channels.FileChannel.class.isAssignableFrom(sut));
    }

}
