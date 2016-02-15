package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.URLDataSource class javax.activation.URLDataSource}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link URLDataSourceClassTests}.
 * </p>
 *
 * @see javax.activation.URLDataSource class javax.activation.URLDataSource (the hereby targeted class-under-test class)
 * @see URLDataSourceClassTests URLDataSourceClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URLDataSourceTests<SUT extends javax.activation.URLDataSource>
extends DataSourceTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getName() public java.lang.String
     * javax.activation.URLDataSource.getName()}.
     *
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getName() public java.lang.String
     * javax.activation.URLDataSource.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.URLDataSource#getName() public java.lang.String javax.activation.URLDataSource.getName()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.activation.URLDataSource#getURL() public java.net.URL
     * javax.activation.URLDataSource.getURL()}.
     *
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getURL() public java.net.URL
     * javax.activation.URLDataSource.getURL()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.URLDataSource#getURL() public java.net.URL javax.activation.URLDataSource.getURL() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getInputStream() public java.io.InputStream
     * javax.activation.URLDataSource.getInputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getInputStream() public java.io.InputStream
     * javax.activation.URLDataSource.getInputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.URLDataSource#getInputStream() public java.io.InputStream
     *      javax.activation.URLDataSource.getInputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getOutputStream() public java.io.OutputStream
     * javax.activation.URLDataSource.getOutputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getOutputStream() public java.io.OutputStream
     * javax.activation.URLDataSource.getOutputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.URLDataSource#getOutputStream() public java.io.OutputStream
     *      javax.activation.URLDataSource.getOutputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getContentType() public java.lang.String
     * javax.activation.URLDataSource.getContentType()}.
     *
     * <p>
     * Test method for {@link javax.activation.URLDataSource#getContentType() public java.lang.String
     * javax.activation.URLDataSource.getContentType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.URLDataSource#getContentType() public java.lang.String
     *      javax.activation.URLDataSource.getContentType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getContentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
