package org.j8unit.repository.javax.tools;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.tools.JavaFileManager interface javax.tools.JavaFileManager},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.tools.JavaFileManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.tools.JavaFileManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.tools.JavaFileManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JavaFileManagerTests<SUT extends javax.tools.JavaFileManager>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.io.FlushableTests<SUT>,
org.j8unit.repository.javax.tools.OptionCheckerTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.tools.JavaFileManager.Location interface
     * javax.tools.JavaFileManager$Location}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.javax.tools.JavaFileManagerTests.LocationTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.tools.JavaFileManagerClassTests.LocationClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.tools.JavaFileManager.Location
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LocationTests<SUT extends javax.tools.JavaFileManager.Location>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.tools.JavaFileManager.Location#getName() public abstract java.lang.String
         * javax.tools.JavaFileManager$Location.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.tools.JavaFileManager.Location#getName()
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
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.tools.JavaFileManager.Location#isOutputLocation()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#close()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#flush()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#getClassLoader(javax.tools.JavaFileManager.Location)
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
     * {@link javax.tools.JavaFileManager#getFileForInput(javax.tools.JavaFileManager.Location, java.lang.String, java.lang.String)
     * public abstract javax.tools.FileObject
     * javax.tools.JavaFileManager.getFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#getFileForInput(javax.tools.JavaFileManager.Location, java.lang.String,
     *             java.lang.String)
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
     * {@link javax.tools.JavaFileManager#getFileForOutput(javax.tools.JavaFileManager.Location, java.lang.String, java.lang.String, javax.tools.FileObject)
     * public abstract javax.tools.FileObject
     * javax.tools.JavaFileManager.getFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String,javax.tools.FileObject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#getFileForOutput(javax.tools.JavaFileManager.Location, java.lang.String,
     *             java.lang.String, javax.tools.FileObject)
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
     * {@link javax.tools.JavaFileManager#getJavaFileForInput(javax.tools.JavaFileManager.Location, java.lang.String, javax.tools.JavaFileObject.Kind)
     * public abstract javax.tools.JavaFileObject
     * javax.tools.JavaFileManager.getJavaFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#getJavaFileForInput(javax.tools.JavaFileManager.Location,
     *             java.lang.String, javax.tools.JavaFileObject.Kind)
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
     * {@link javax.tools.JavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location, java.lang.String, javax.tools.JavaFileObject.Kind, javax.tools.FileObject)
     * public abstract javax.tools.JavaFileObject
     * javax.tools.JavaFileManager.getJavaFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind,javax.tools.FileObject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location,
     *             java.lang.String, javax.tools.JavaFileObject.Kind, javax.tools.FileObject)
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
     * Test method for {@link javax.tools.JavaFileManager#handleOption(java.lang.String, java.util.Iterator) public
     * abstract boolean javax.tools.JavaFileManager.handleOption(java.lang.String,java.util.Iterator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#handleOption(java.lang.String, java.util.Iterator)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#hasLocation(javax.tools.JavaFileManager.Location)
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
     * {@link javax.tools.JavaFileManager#inferBinaryName(javax.tools.JavaFileManager.Location, javax.tools.JavaFileObject)
     * public abstract java.lang.String
     * javax.tools.JavaFileManager.inferBinaryName(javax.tools.JavaFileManager$Location,javax.tools.JavaFileObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#inferBinaryName(javax.tools.JavaFileManager.Location,
     *             javax.tools.JavaFileObject)
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
     * Test method for {@link javax.tools.JavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject)
     * public abstract boolean javax.tools.JavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject)
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
     * {@link javax.tools.JavaFileManager#list(javax.tools.JavaFileManager.Location, java.lang.String, java.util.Set, boolean)
     * public abstract java.lang.Iterable
     * javax.tools.JavaFileManager.list(javax.tools.JavaFileManager$Location,java.lang.String,java.util.Set,boolean)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.JavaFileManager#list(javax.tools.JavaFileManager.Location, java.lang.String,
     *             java.util.Set, boolean)
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
