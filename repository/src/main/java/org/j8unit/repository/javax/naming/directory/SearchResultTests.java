package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.SearchResult class
 * javax.naming.directory.SearchResult}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SearchResultClassTests}.
 * </p>
 *
 * @see javax.naming.directory.SearchResult class javax.naming.directory.SearchResult (the hereby targeted
 *      class-under-test class)
 * @see SearchResultClassTests SearchResultClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SearchResultTests<SUT extends javax.naming.directory.SearchResult>
extends org.j8unit.repository.javax.naming.BindingTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.directory.SearchResult#toString() public java.lang.String
     * javax.naming.directory.SearchResult.toString()}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.SearchResult#toString() public java.lang.String
     * javax.naming.directory.SearchResult.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.SearchResult#toString() public java.lang.String
     *      javax.naming.directory.SearchResult.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.directory.SearchResult#setAttributes(javax.naming.directory.Attributes)
     * public void javax.naming.directory.SearchResult.setAttributes(javax.naming.directory.Attributes)}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.SearchResult#setAttributes(javax.naming.directory.Attributes)
     * public void javax.naming.directory.SearchResult.setAttributes(javax.naming.directory.Attributes)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.SearchResult#setAttributes(javax.naming.directory.Attributes) public void
     *      javax.naming.directory.SearchResult.setAttributes(javax.naming.directory.Attributes) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributes_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.directory.SearchResult#getAttributes() public
     * javax.naming.directory.Attributes javax.naming.directory.SearchResult.getAttributes()}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.SearchResult#getAttributes() public
     * javax.naming.directory.Attributes javax.naming.directory.SearchResult.getAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.SearchResult#getAttributes() public javax.naming.directory.Attributes
     *      javax.naming.directory.SearchResult.getAttributes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
