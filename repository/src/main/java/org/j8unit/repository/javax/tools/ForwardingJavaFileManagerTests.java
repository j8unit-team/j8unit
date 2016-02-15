package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.ForwardingJavaFileManager class
 * javax.tools.ForwardingJavaFileManager}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ForwardingJavaFileManagerClassTests}.
 * </p>
 *
 * @see javax.tools.ForwardingJavaFileManager class javax.tools.ForwardingJavaFileManager (the hereby targeted
 *      class-under-test class)
 * @see ForwardingJavaFileManagerClassTests ForwardingJavaFileManagerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForwardingJavaFileManagerTests<SUT extends javax.tools.ForwardingJavaFileManager<M>, M extends javax.tools.JavaFileManager>
extends JavaFileManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getJavaFileForInput(javax.tools.JavaFileManager.Location, String, javax.tools.JavaFileObject.Kind)
     * public javax.tools.JavaFileObject
     * javax.tools.ForwardingJavaFileManager.getJavaFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getJavaFileForInput(javax.tools.JavaFileManager.Location, String, javax.tools.JavaFileObject.Kind)
     * public javax.tools.JavaFileObject
     * javax.tools.ForwardingJavaFileManager.getJavaFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#getJavaFileForInput(javax.tools.JavaFileManager.Location, String,
     *      javax.tools.JavaFileObject.Kind) public javax.tools.JavaFileObject
     *      javax.tools.ForwardingJavaFileManager.getJavaFileForInput(javax.tools.JavaFileManager$Location,java.lang.
     *      String,javax.tools.JavaFileObject$Kind) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.tools.ForwardingJavaFileManager#flush() public void
     * javax.tools.ForwardingJavaFileManager.flush() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#flush() public void
     * javax.tools.ForwardingJavaFileManager.flush() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#flush() public void javax.tools.ForwardingJavaFileManager.flush()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#inferBinaryName(javax.tools.JavaFileManager.Location, javax.tools.JavaFileObject)
     * public java.lang.String
     * javax.tools.ForwardingJavaFileManager.inferBinaryName(javax.tools.JavaFileManager$Location,javax.tools.JavaFileObject)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#inferBinaryName(javax.tools.JavaFileManager.Location, javax.tools.JavaFileObject)
     * public java.lang.String
     * javax.tools.ForwardingJavaFileManager.inferBinaryName(javax.tools.JavaFileManager$Location,javax.tools.JavaFileObject)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#inferBinaryName(javax.tools.JavaFileManager.Location,
     *      javax.tools.JavaFileObject) public java.lang.String
     *      javax.tools.ForwardingJavaFileManager.inferBinaryName(javax.tools.JavaFileManager$Location,javax.tools.
     *      JavaFileObject) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getFileForInput(javax.tools.JavaFileManager.Location, String, String)
     * public javax.tools.FileObject
     * javax.tools.ForwardingJavaFileManager.getFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getFileForInput(javax.tools.JavaFileManager.Location, String, String)
     * public javax.tools.FileObject
     * javax.tools.ForwardingJavaFileManager.getFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#getFileForInput(javax.tools.JavaFileManager.Location, String, String)
     *      public javax.tools.FileObject
     *      javax.tools.ForwardingJavaFileManager.getFileForInput(javax.tools.JavaFileManager$Location,java.lang.String,
     *      java.lang.String) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.tools.ForwardingJavaFileManager#close() public void
     * javax.tools.ForwardingJavaFileManager.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#close() public void
     * javax.tools.ForwardingJavaFileManager.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#close() public void javax.tools.ForwardingJavaFileManager.close()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#handleOption(String, java.util.Iterator) public
     * boolean javax.tools.ForwardingJavaFileManager.handleOption(java.lang.String,java.util.Iterator
     * <java.lang.String>)}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#handleOption(String, java.util.Iterator) public
     * boolean javax.tools.ForwardingJavaFileManager.handleOption(java.lang.String,java.util.Iterator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#handleOption(String, java.util.Iterator) public boolean
     *      javax.tools.ForwardingJavaFileManager.handleOption(java.lang.String,java.util.Iterator) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location, String, javax.tools.JavaFileObject.Kind, javax.tools.FileObject)
     * public javax.tools.JavaFileObject
     * javax.tools.ForwardingJavaFileManager.getJavaFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind,javax.tools.FileObject)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location, String, javax.tools.JavaFileObject.Kind, javax.tools.FileObject)
     * public javax.tools.JavaFileObject
     * javax.tools.ForwardingJavaFileManager.getJavaFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,javax.tools.JavaFileObject$Kind,javax.tools.FileObject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location, String,
     *      javax.tools.JavaFileObject.Kind, javax.tools.FileObject) public javax.tools.JavaFileObject
     *      javax.tools.ForwardingJavaFileManager.getJavaFileForOutput(javax.tools.JavaFileManager$Location,java.lang.
     *      String,javax.tools.JavaFileObject$Kind,javax.tools.FileObject) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject) public
     * boolean javax.tools.ForwardingJavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject) public
     * boolean javax.tools.ForwardingJavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject) public
     *      boolean javax.tools.ForwardingJavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * {@link javax.tools.ForwardingJavaFileManager#getFileForOutput(javax.tools.JavaFileManager.Location, String, String, javax.tools.FileObject)
     * public javax.tools.FileObject
     * javax.tools.ForwardingJavaFileManager.getFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String,javax.tools.FileObject)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#getFileForOutput(javax.tools.JavaFileManager.Location, String, String, javax.tools.FileObject)
     * public javax.tools.FileObject
     * javax.tools.ForwardingJavaFileManager.getFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String,java.lang.String,javax.tools.FileObject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#getFileForOutput(javax.tools.JavaFileManager.Location, String, String,
     *      javax.tools.FileObject) public javax.tools.FileObject
     *      javax.tools.ForwardingJavaFileManager.getFileForOutput(javax.tools.JavaFileManager$Location,java.lang.String
     *      ,java.lang.String,javax.tools.FileObject) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.tools.ForwardingJavaFileManager#getClassLoader(javax.tools.JavaFileManager.Location)
     * public java.lang.ClassLoader
     * javax.tools.ForwardingJavaFileManager.getClassLoader(javax.tools.JavaFileManager$Location)}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#getClassLoader(javax.tools.JavaFileManager.Location)
     * public java.lang.ClassLoader
     * javax.tools.ForwardingJavaFileManager.getClassLoader(javax.tools.JavaFileManager$Location)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#getClassLoader(javax.tools.JavaFileManager.Location) public
     *      java.lang.ClassLoader
     *      javax.tools.ForwardingJavaFileManager.getClassLoader(javax.tools.JavaFileManager$Location) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.tools.ForwardingJavaFileManager#hasLocation(javax.tools.JavaFileManager.Location)
     * public boolean javax.tools.ForwardingJavaFileManager.hasLocation(javax.tools.JavaFileManager$Location)}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#hasLocation(javax.tools.JavaFileManager.Location)
     * public boolean javax.tools.ForwardingJavaFileManager.hasLocation(javax.tools.JavaFileManager$Location)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#hasLocation(javax.tools.JavaFileManager.Location) public boolean
     *      javax.tools.ForwardingJavaFileManager.hasLocation(javax.tools.JavaFileManager$Location) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * {@link javax.tools.ForwardingJavaFileManager#list(javax.tools.JavaFileManager.Location, String, java.util.Set, boolean)
     * public java.lang.Iterable<javax.tools.JavaFileObject>
     * javax.tools.ForwardingJavaFileManager.list(javax.tools.JavaFileManager$Location,java.lang.String,java.util.Set
     * <javax.tools.JavaFileObject$Kind>,boolean) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileManager#list(javax.tools.JavaFileManager.Location, String, java.util.Set, boolean)
     * public java.lang.Iterable
     * javax.tools.ForwardingJavaFileManager.list(javax.tools.JavaFileManager$Location,java.lang.String,java.util.Set,boolean)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#list(javax.tools.JavaFileManager.Location, String, java.util.Set,
     *      boolean) public java.lang.Iterable
     *      javax.tools.ForwardingJavaFileManager.list(javax.tools.JavaFileManager$Location,java.lang.String,java.util.
     *      Set,boolean) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_list_Location_String_Set_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#isSupportedOption(String) public int
     * javax.tools.ForwardingJavaFileManager.isSupportedOption(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileManager#isSupportedOption(String) public int
     * javax.tools.ForwardingJavaFileManager.isSupportedOption(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileManager#isSupportedOption(String) public int
     *      javax.tools.ForwardingJavaFileManager.isSupportedOption(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSupportedOption_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
