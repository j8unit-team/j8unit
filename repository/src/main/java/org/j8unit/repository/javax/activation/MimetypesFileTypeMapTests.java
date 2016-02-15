package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.MimetypesFileTypeMap class
 * javax.activation.MimetypesFileTypeMap}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MimetypesFileTypeMapClassTests}.
 * </p>
 *
 * @see javax.activation.MimetypesFileTypeMap class javax.activation.MimetypesFileTypeMap (the hereby targeted
 *      class-under-test class)
 * @see MimetypesFileTypeMapClassTests MimetypesFileTypeMapClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MimetypesFileTypeMapTests<SUT extends javax.activation.MimetypesFileTypeMap>
extends FileTypeMapTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.MimetypesFileTypeMap#getContentType(java.io.File) public java.lang.String
     * javax.activation.MimetypesFileTypeMap.getContentType(java.io.File)}.
     *
     * <p>
     * Test method for {@link javax.activation.MimetypesFileTypeMap#getContentType(java.io.File) public java.lang.String
     * javax.activation.MimetypesFileTypeMap.getContentType(java.io.File)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.MimetypesFileTypeMap#getContentType(java.io.File) public java.lang.String
     *      javax.activation.MimetypesFileTypeMap.getContentType(java.io.File) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getContentType_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.MimetypesFileTypeMap#getContentType(String) public synchronized
     * java.lang.String javax.activation.MimetypesFileTypeMap.getContentType(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.activation.MimetypesFileTypeMap#getContentType(String) public synchronized
     * java.lang.String javax.activation.MimetypesFileTypeMap.getContentType(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.MimetypesFileTypeMap#getContentType(String) public synchronized java.lang.String
     *      javax.activation.MimetypesFileTypeMap.getContentType(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getContentType_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.MimetypesFileTypeMap#addMimeTypes(String) public synchronized void
     * javax.activation.MimetypesFileTypeMap.addMimeTypes(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.activation.MimetypesFileTypeMap#addMimeTypes(String) public synchronized void
     * javax.activation.MimetypesFileTypeMap.addMimeTypes(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.MimetypesFileTypeMap#addMimeTypes(String) public synchronized void
     *      javax.activation.MimetypesFileTypeMap.addMimeTypes(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMimeTypes_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
