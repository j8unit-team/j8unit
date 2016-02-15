package org.j8unit.repository.java.sql;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.Ref interface java.sql.Ref}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link RefClassTests}.
 * </p>
 *
 * @see java.sql.Ref interface java.sql.Ref (the hereby targeted class-under-test class)
 * @see RefClassTests RefClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RefTests<SUT extends java.sql.Ref>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.Ref#setObject(Object) public abstract void
     * java.sql.Ref.setObject(java.lang.Object) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Ref#setObject(Object) public abstract void
     * java.sql.Ref.setObject(java.lang.Object) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Ref#setObject(Object) public abstract void java.sql.Ref.setObject(java.lang.Object) throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setObject_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Ref#getBaseTypeName() public abstract java.lang.String
     * java.sql.Ref.getBaseTypeName() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Ref#getBaseTypeName() public abstract java.lang.String
     * java.sql.Ref.getBaseTypeName() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Ref#getBaseTypeName() public abstract java.lang.String java.sql.Ref.getBaseTypeName() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBaseTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Ref#getObject() public abstract java.lang.Object java.sql.Ref.getObject() throws
     * java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Ref#getObject() public abstract java.lang.Object java.sql.Ref.getObject() throws
     * java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Ref#getObject() public abstract java.lang.Object java.sql.Ref.getObject() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Ref#getObject(java.util.Map) public abstract java.lang.Object
     * java.sql.Ref.getObject(java.util.Map<java.lang.String, java.lang.Class<?>>) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Ref#getObject(java.util.Map) public abstract java.lang.Object
     * java.sql.Ref.getObject(java.util.Map) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Ref#getObject(java.util.Map) public abstract java.lang.Object java.sql.Ref.getObject(java.util.Map)
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
