package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.StandardJavaFileManager interface
 * javax.tools.StandardJavaFileManager}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link StandardJavaFileManagerClassTests}.
 * </p>
 *
 * @see javax.tools.StandardJavaFileManager interface javax.tools.StandardJavaFileManager (the hereby targeted
 *      class-under-test class)
 * @see StandardJavaFileManagerClassTests StandardJavaFileManagerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardJavaFileManagerTests<SUT extends javax.tools.StandardJavaFileManager>
extends JavaFileManagerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.tools.StandardJavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject) public
     * abstract boolean javax.tools.StandardJavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.StandardJavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject) public
     * abstract boolean javax.tools.StandardJavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#isSameFile(javax.tools.FileObject, javax.tools.FileObject) public
     *      abstract boolean
     *      javax.tools.StandardJavaFileManager.isSameFile(javax.tools.FileObject,javax.tools.FileObject) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.tools.StandardJavaFileManager#getLocation(javax.tools.JavaFileManager.Location)
     * public abstract java.lang.Iterable<? extends java.io.File>
     * javax.tools.StandardJavaFileManager.getLocation(javax.tools.JavaFileManager$Location)}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getLocation(javax.tools.JavaFileManager.Location)
     * public abstract java.lang.Iterable
     * javax.tools.StandardJavaFileManager.getLocation(javax.tools.JavaFileManager$Location)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#getLocation(javax.tools.JavaFileManager.Location) public abstract
     *      java.lang.Iterable javax.tools.StandardJavaFileManager.getLocation(javax.tools.JavaFileManager$Location)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocation_Location()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjectsFromFiles(Iterable) public abstract
     * java.lang.Iterable<? extends javax.tools.JavaFileObject>
     * javax.tools.StandardJavaFileManager.getJavaFileObjectsFromFiles(java.lang.Iterable<? extends java.io.File>)}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjectsFromFiles(Iterable) public abstract
     * java.lang.Iterable javax.tools.StandardJavaFileManager.getJavaFileObjectsFromFiles(java.lang.Iterable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#getJavaFileObjectsFromFiles(Iterable) public abstract java.lang.Iterable
     *      javax.tools.StandardJavaFileManager.getJavaFileObjectsFromFiles(java.lang.Iterable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJavaFileObjectsFromFiles_Iterable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.StandardJavaFileManager#setLocation(javax.tools.JavaFileManager.Location, Iterable) public
     * abstract void
     * javax.tools.StandardJavaFileManager.setLocation(javax.tools.JavaFileManager$Location,java.lang.Iterable<? extends
     * java.io.File>) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.StandardJavaFileManager#setLocation(javax.tools.JavaFileManager.Location, Iterable) public
     * abstract void
     * javax.tools.StandardJavaFileManager.setLocation(javax.tools.JavaFileManager$Location,java.lang.Iterable) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#setLocation(javax.tools.JavaFileManager.Location, Iterable) public
     *      abstract void
     *      javax.tools.StandardJavaFileManager.setLocation(javax.tools.JavaFileManager$Location,java.lang.Iterable)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLocation_Location_Iterable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjects(String...) public abstract
     * java.lang.Iterable<? extends javax.tools.JavaFileObject>
     * javax.tools.StandardJavaFileManager.getJavaFileObjects(java.lang.String...)}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjects(String...) public abstract
     * java.lang.Iterable javax.tools.StandardJavaFileManager.getJavaFileObjects(java.lang.String...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#getJavaFileObjects(String...) public abstract java.lang.Iterable
     *      javax.tools.StandardJavaFileManager.getJavaFileObjects(java.lang.String[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJavaFileObjects_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjects(java.io.File...) public abstract
     * java.lang.Iterable<? extends javax.tools.JavaFileObject>
     * javax.tools.StandardJavaFileManager.getJavaFileObjects(java.io.File...)}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjects(java.io.File...) public abstract
     * java.lang.Iterable javax.tools.StandardJavaFileManager.getJavaFileObjects(java.io.File...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#getJavaFileObjects(java.io.File...) public abstract java.lang.Iterable
     *      javax.tools.StandardJavaFileManager.getJavaFileObjects(java.io.File[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJavaFileObjects_FileArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjectsFromStrings(Iterable) public
     * abstract java.lang.Iterable<? extends javax.tools.JavaFileObject>
     * javax.tools.StandardJavaFileManager.getJavaFileObjectsFromStrings(java.lang.Iterable<java.lang.String>)}.
     *
     * <p>
     * Test method for {@link javax.tools.StandardJavaFileManager#getJavaFileObjectsFromStrings(Iterable) public
     * abstract java.lang.Iterable
     * javax.tools.StandardJavaFileManager.getJavaFileObjectsFromStrings(java.lang.Iterable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.StandardJavaFileManager#getJavaFileObjectsFromStrings(Iterable) public abstract
     *      java.lang.Iterable javax.tools.StandardJavaFileManager.getJavaFileObjectsFromStrings(java.lang.Iterable)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJavaFileObjectsFromStrings_Iterable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
