package org.j8unit.repository.javax.tools;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.tools.JavaFileManager interface javax.tools.JavaFileManager}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.JavaFileManagerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JavaFileManagerTests<SUT extends javax.tools.JavaFileManager>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.io.FlushableTests<SUT>,
org.j8unit.repository.javax.tools.OptionCheckerTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.tools.JavaFileManager$Location interface javax.tools.JavaFileManager$Location},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.tools.JavaFileManagerClassTests.LocationClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LocationTests<SUT extends javax.tools.JavaFileManager.Location>
    extends J8UnitTest<SUT> {

        /**
         * <p>
         * Test method for {@link javax.tools.JavaFileManager.Location#getName() public abstract java.lang.String
         * javax.tools.JavaFileManager$Location.getName()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.JavaFileManager.Location#isOutputLocation() public abstract boolean
         * javax.tools.JavaFileManager$Location.isOutputLocation()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isOutputLocation()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileManager#close() public abstract void
     * javax.tools.JavaFileManager.close() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileManager#flush() public abstract void
     * javax.tools.JavaFileManager.flush() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileManager#getClassLoader(javax.tools.JavaFileManager.Location) public
     * abstract java.lang.ClassLoader javax.tools.JavaFileManager.getClassLoader(javax.tools.JavaFileManager$Location)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoader_Location()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaFileManager#getFileForInput(javax.tools.JavaFileManager.Location,java.lang.String,java.lang.String)
     * public abstract javax.tools.FileObject
     * javax.tools.JavaFileManager.getFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileForInput_Location_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaFileManager#getFileForOutput(javax.tools.JavaFileManager.Location,java.lang.String,java.lang.String,javax.tools.FileObject)
     * public abstract javax.tools.FileObject
     * javax.tools.JavaFileManager.getFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String,javax.tools.FileObject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileForOutput_Location_String_String_FileObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaFileManager#getJavaFileForInput(javax.tools.JavaFileManager.Location,java.lang.String,javax.tools.JavaFileObject.Kind)
     * public abstract javax.tools.JavaFileObject
     * javax.tools.JavaFileManager.getJavaFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJavaFileForInput_Location_String_Kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location,java.lang.String,javax.tools.JavaFileObject.Kind,javax.tools.FileObject)
     * public abstract javax.tools.JavaFileObject
     * javax.tools.JavaFileManager.getJavaFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind,javax.tools.FileObject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJavaFileForOutput_Location_String_Kind_FileObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileManager#handleOption(java.lang.String,java.util.Iterator) public
     * abstract boolean javax.tools.JavaFileManager.handleOption(java.lang.String,java.util.Iterator)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleOption_String_Iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileManager#hasLocation(javax.tools.JavaFileManager.Location) public
     * abstract boolean javax.tools.JavaFileManager.hasLocation(javax.tools.JavaFileManager$Location)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasLocation_Location()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaFileManager#inferBinaryName(javax.tools.JavaFileManager.Location,javax.tools.JavaFileObject)
     * public abstract java.lang.String
     * javax.tools.JavaFileManager.inferBinaryName(javax.tools.JavaFileManager$Location,javax.tools.JavaFileObject)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inferBinaryName_Location_JavaFileObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.JavaFileManager#isSameFile(javax.tools.FileObject,javax.tools.FileObject)
     * public abstract boolean javax.tools.JavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSameFile_FileObject_FileObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaFileManager#list(javax.tools.JavaFileManager.Location,java.lang.String,java.util.Set,boolean)
     * public abstract java.lang.Iterable
     * javax.tools.JavaFileManager.list(javax.tools.JavaFileManager$Location,java.lang.String,java.util.Set,boolean)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list_Location_String_Set_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
