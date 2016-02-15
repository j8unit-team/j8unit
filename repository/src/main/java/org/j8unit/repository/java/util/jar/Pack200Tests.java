package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.jar.Pack200 class java.util.jar.Pack200}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link Pack200ClassTests}.
 * </p>
 *
 * @see java.util.jar.Pack200 class java.util.jar.Pack200 (the hereby targeted class-under-test class)
 * @see Pack200ClassTests Pack200ClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Pack200Tests<SUT extends java.util.jar.Pack200>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.jar.Pack200.Unpacker interface
     * java.util.jar.Pack200$Unpacker}. The complementary j8unit test interface containing the class relevant aspects is
     * {@link Pack200ClassTests.UnpackerClassTests}.
     * </p>
     *
     * @see java.util.jar.Pack200.Unpacker interface java.util.jar.Pack200$Unpacker (the hereby targeted
     *      class-under-test class)
     * @see Pack200ClassTests.UnpackerClassTests Pack200ClassTests.UnpackerClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnpackerTests<SUT extends java.util.jar.Pack200.Unpacker>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.jar.Pack200.Unpacker#unpack(java.io.InputStream, java.util.jar.JarOutputStream) public
         * abstract void java.util.jar.Pack200$Unpacker.unpack(java.io.InputStream,java.util.jar.JarOutputStream) throws
         * java.io.IOException}.
         *
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
         * @see java.util.jar.Pack200.Unpacker#unpack(java.io.InputStream, java.util.jar.JarOutputStream) public
         *      abstract void java.util.jar.Pack200$Unpacker.unpack(java.io.InputStream,java.util.jar.JarOutputStream)
         *      throws java.io.IOException (the hereby targeted method-under-test)
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

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Unpacker#unpack(java.io.File, java.util.jar.JarOutputStream)
         * public abstract void java.util.jar.Pack200$Unpacker.unpack(java.io.File,java.util.jar.JarOutputStream) throws
         * java.io.IOException}.
         *
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
         * @see java.util.jar.Pack200.Unpacker#unpack(java.io.File, java.util.jar.JarOutputStream) public abstract void
         *      java.util.jar.Pack200$Unpacker.unpack(java.io.File,java.util.jar.JarOutputStream) throws
         *      java.io.IOException (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.jar.Pack200.Unpacker#properties() public abstract
         * java.util.SortedMap<java.lang.String, java.lang.String> java.util.jar.Pack200$Unpacker.properties()}.
         *
         * <p>
         * Test method for {@link java.util.jar.Pack200.Unpacker#properties() public abstract java.util.SortedMap
         * java.util.jar.Pack200$Unpacker.properties()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.jar.Pack200.Unpacker#properties() public abstract java.util.SortedMap
         *      java.util.jar.Pack200$Unpacker.properties() (the hereby targeted method-under-test)
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
         * {@link java.util.jar.Pack200.Unpacker#addPropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Unpacker.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
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
         * @see java.util.jar.Pack200.Unpacker#addPropertyChangeListener(java.beans.PropertyChangeListener) public
         *      default void java.util.jar.Pack200$Unpacker.addPropertyChangeListener(java.beans.PropertyChangeListener)
         *      (the hereby targeted method-under-test)
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
         * Test method for
         * {@link java.util.jar.Pack200.Unpacker#removePropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Unpacker.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
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
         * @see java.util.jar.Pack200.Unpacker#removePropertyChangeListener(java.beans.PropertyChangeListener) public
         *      default void
         *      java.util.jar.Pack200$Unpacker.removePropertyChangeListener(java.beans.PropertyChangeListener) (the
         *      hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.jar.Pack200.Packer interface java.util.jar.Pack200$Packer}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link Pack200ClassTests.PackerClassTests}.
     * </p>
     *
     * @see java.util.jar.Pack200.Packer interface java.util.jar.Pack200$Packer (the hereby targeted class-under-test
     *      class)
     * @see Pack200ClassTests.PackerClassTests Pack200ClassTests.PackerClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PackerTests<SUT extends java.util.jar.Pack200.Packer>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.jar.Pack200.Packer#pack(java.util.jar.JarFile, java.io.OutputStream) public
         * abstract void java.util.jar.Pack200$Packer.pack(java.util.jar.JarFile,java.io.OutputStream) throws
         * java.io.IOException}.
         *
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
         * @see java.util.jar.Pack200.Packer#pack(java.util.jar.JarFile, java.io.OutputStream) public abstract void
         *      java.util.jar.Pack200$Packer.pack(java.util.jar.JarFile,java.io.OutputStream) throws java.io.IOException
         *      (the hereby targeted method-under-test)
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
         * @see java.util.jar.Pack200.Packer#pack(java.util.jar.JarInputStream, java.io.OutputStream) public abstract
         *      void java.util.jar.Pack200$Packer.pack(java.util.jar.JarInputStream,java.io.OutputStream) throws
         *      java.io.IOException (the hereby targeted method-under-test)
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
         * Test method for
         * {@link java.util.jar.Pack200.Packer#addPropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Packer.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
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
         * @see java.util.jar.Pack200.Packer#addPropertyChangeListener(java.beans.PropertyChangeListener) public default
         *      void java.util.jar.Pack200$Packer.addPropertyChangeListener(java.beans.PropertyChangeListener) (the
         *      hereby targeted method-under-test)
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
         * Test method for
         * {@link java.util.jar.Pack200.Packer#removePropertyChangeListener(java.beans.PropertyChangeListener) public
         * default void java.util.jar.Pack200$Packer.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
         *
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
         * @see java.util.jar.Pack200.Packer#removePropertyChangeListener(java.beans.PropertyChangeListener) public
         *      default void
         *      java.util.jar.Pack200$Packer.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
         *      targeted method-under-test)
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
         * Test method for {@link java.util.jar.Pack200.Packer#properties() public abstract
         * java.util.SortedMap<java.lang.String, java.lang.String> java.util.jar.Pack200$Packer.properties()}.
         *
         * <p>
         * Test method for {@link java.util.jar.Pack200.Packer#properties() public abstract java.util.SortedMap
         * java.util.jar.Pack200$Packer.properties()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.jar.Pack200.Packer#properties() public abstract java.util.SortedMap
         *      java.util.jar.Pack200$Packer.properties() (the hereby targeted method-under-test)
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

    }

}
