package org.j8unit.repository.javax.activation;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.DataSource interface javax.activation.DataSource}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DataSourceClassTests}.
 * </p>
 *
 * @see javax.activation.DataSource interface javax.activation.DataSource (the hereby targeted class-under-test class)
 * @see DataSourceClassTests DataSourceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataSourceTests<SUT extends javax.activation.DataSource>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.DataSource#getContentType() public abstract java.lang.String
     * javax.activation.DataSource.getContentType()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataSource#getContentType() public abstract java.lang.String
     * javax.activation.DataSource.getContentType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataSource#getContentType() public abstract java.lang.String
     *      javax.activation.DataSource.getContentType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataSource#getOutputStream() public abstract java.io.OutputStream
     * javax.activation.DataSource.getOutputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataSource#getOutputStream() public abstract java.io.OutputStream
     * javax.activation.DataSource.getOutputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataSource#getOutputStream() public abstract java.io.OutputStream
     *      javax.activation.DataSource.getOutputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.activation.DataSource#getInputStream() public abstract java.io.InputStream
     * javax.activation.DataSource.getInputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataSource#getInputStream() public abstract java.io.InputStream
     * javax.activation.DataSource.getInputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataSource#getInputStream() public abstract java.io.InputStream
     *      javax.activation.DataSource.getInputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.activation.DataSource#getName() public abstract java.lang.String
     * javax.activation.DataSource.getName()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataSource#getName() public abstract java.lang.String
     * javax.activation.DataSource.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataSource#getName() public abstract java.lang.String javax.activation.DataSource.getName()
     *      (the hereby targeted method-under-test)
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

}
