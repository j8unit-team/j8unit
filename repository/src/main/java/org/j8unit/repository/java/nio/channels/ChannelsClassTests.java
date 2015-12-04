package org.j8unit.repository.java.nio.channels;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.channels.Channels class java.nio.channels.Channels},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.nio.channels.ChannelsTests}.
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
 * @see org.j8unit.repository.java.nio.channels.ChannelsTests
 */
@Category(J8UnitRepository.class)
public abstract interface ChannelsClassTests<SUT extends Class<? extends java.nio.channels.Channels>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.nio.channels.Channels> sut = createNewSUT();
        // assert assignability
        assertTrue(java.nio.channels.Channels.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newOutputStream(java.nio.channels.AsynchronousByteChannel) public static java.io.OutputStream java.nio.channels.Channels.newOutputStream(java.nio.channels.AsynchronousByteChannel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newOutputStream_AsynchronousByteChannel() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newOutputStream(java.nio.channels.WritableByteChannel) public static java.io.OutputStream java.nio.channels.Channels.newOutputStream(java.nio.channels.WritableByteChannel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newOutputStream_WritableByteChannel() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newInputStream(java.nio.channels.AsynchronousByteChannel) public static java.io.InputStream java.nio.channels.Channels.newInputStream(java.nio.channels.AsynchronousByteChannel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInputStream_AsynchronousByteChannel() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newInputStream(java.nio.channels.ReadableByteChannel) public static java.io.InputStream java.nio.channels.Channels.newInputStream(java.nio.channels.ReadableByteChannel)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInputStream_ReadableByteChannel() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newWriter(java.nio.channels.WritableByteChannel,java.lang.String) public static java.io.Writer java.nio.channels.Channels.newWriter(java.nio.channels.WritableByteChannel,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newWriter_WritableByteChannel_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newWriter(java.nio.channels.WritableByteChannel,java.nio.charset.CharsetEncoder,int) public static java.io.Writer java.nio.channels.Channels.newWriter(java.nio.channels.WritableByteChannel,java.nio.charset.CharsetEncoder,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newWriter_WritableByteChannel_CharsetEncoder_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newChannel(java.io.InputStream) public static java.nio.channels.ReadableByteChannel java.nio.channels.Channels.newChannel(java.io.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newChannel_InputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newChannel(java.io.OutputStream) public static java.nio.channels.WritableByteChannel java.nio.channels.Channels.newChannel(java.io.OutputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newChannel_OutputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newReader(java.nio.channels.ReadableByteChannel,java.lang.String) public static java.io.Reader java.nio.channels.Channels.newReader(java.nio.channels.ReadableByteChannel,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newReader_ReadableByteChannel_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channels#newReader(java.nio.channels.ReadableByteChannel,java.nio.charset.CharsetDecoder,int) public static java.io.Reader java.nio.channels.Channels.newReader(java.nio.channels.ReadableByteChannel,java.nio.charset.CharsetDecoder,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newReader_ReadableByteChannel_CharsetDecoder_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
