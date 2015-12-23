package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.jar.Pack200 class java.util.jar.Pack200}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.util.jar.Pack200Tests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.java.util.jar.Pack200ClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.jar.Pack200
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Pack200Tests<SUT extends java.util.jar.Pack200>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.jar.Pack200.Packer interface
     * java.util.jar.Pack200$Packer}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
     * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.jar.Pack200Tests.PackerTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.jar.Pack200ClassTests.PackerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.jar.Pack200.Packer
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PackerTests<SUT extends java.util.jar.Pack200.Packer>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.jar.Pack200.Packer#addPropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Packer.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Packer#addPropertyChangeListener(java.beans.PropertyChangeListener)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addPropertyChangeListener_PropertyChangeListener()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Packer#pack(java.util.jar.JarFile, java.io.OutputStream) public
         * abstract void java.util.jar.Pack200$Packer.pack(java.util.jar.JarFile,java.io.OutputStream) throws
         * java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Packer#pack(java.util.jar.JarFile, java.io.OutputStream)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_pack_JarFile_OutputStream()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Packer#pack(java.util.jar.JarInputStream, java.io.OutputStream)
         * public abstract void java.util.jar.Pack200$Packer.pack(java.util.jar.JarInputStream,java.io.OutputStream)
         * throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Packer#pack(java.util.jar.JarInputStream, java.io.OutputStream)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_pack_JarInputStream_OutputStream()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Packer#properties() public abstract java.util.SortedMap
         * java.util.jar.Pack200$Packer.properties()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Packer#properties()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_properties()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.jar.Pack200.Packer#removePropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Packer.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Packer#removePropertyChangeListener(java.beans.PropertyChangeListener)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_removePropertyChangeListener_PropertyChangeListener()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.jar.Pack200.Unpacker interface
     * java.util.jar.Pack200$Unpacker}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.jar.Pack200Tests.UnpackerTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.jar.Pack200ClassTests.UnpackerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.jar.Pack200.Unpacker
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnpackerTests<SUT extends java.util.jar.Pack200.Unpacker>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.jar.Pack200.Unpacker#addPropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Unpacker.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Unpacker#addPropertyChangeListener(java.beans.PropertyChangeListener)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addPropertyChangeListener_PropertyChangeListener()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Unpacker#properties() public abstract java.util.SortedMap
         * java.util.jar.Pack200$Unpacker.properties()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Unpacker#properties()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_properties()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.jar.Pack200.Unpacker#removePropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Unpacker.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Unpacker#removePropertyChangeListener(java.beans.PropertyChangeListener)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_removePropertyChangeListener_PropertyChangeListener()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Unpacker#unpack(java.io.File, java.util.jar.JarOutputStream)
         * public abstract void java.util.jar.Pack200$Unpacker.unpack(java.io.File,java.util.jar.JarOutputStream) throws
         * java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Unpacker#unpack(java.io.File, java.util.jar.JarOutputStream)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unpack_File_JarOutputStream()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.jar.Pack200.Unpacker#unpack(java.io.InputStream, java.util.jar.JarOutputStream) public
         * abstract void java.util.jar.Pack200$Unpacker.unpack(java.io.InputStream,java.util.jar.JarOutputStream) throws
         * java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.jar.Pack200.Unpacker#unpack(java.io.InputStream, java.util.jar.JarOutputStream)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unpack_InputStream_JarOutputStream()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
