package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.TypeInfo interface org.w3c.dom.TypeInfo}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link TypeInfoClassTests}.
 * </p>
 *
 * @see org.w3c.dom.TypeInfo interface org.w3c.dom.TypeInfo (the hereby targeted class-under-test class)
 * @see TypeInfoClassTests TypeInfoClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeInfoTests<SUT extends org.w3c.dom.TypeInfo>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.TypeInfo#isDerivedFrom(String, String, int) public abstract boolean
     * org.w3c.dom.TypeInfo.isDerivedFrom(java.lang.String,java.lang.String,int)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.TypeInfo#isDerivedFrom(String, String, int) public abstract boolean
     * org.w3c.dom.TypeInfo.isDerivedFrom(java.lang.String,java.lang.String,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.TypeInfo#isDerivedFrom(String, String, int) public abstract boolean
     *      org.w3c.dom.TypeInfo.isDerivedFrom(java.lang.String,java.lang.String,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDerivedFrom_String_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.TypeInfo#getTypeNamespace() public abstract java.lang.String
     * org.w3c.dom.TypeInfo.getTypeNamespace()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.TypeInfo#getTypeNamespace() public abstract java.lang.String
     * org.w3c.dom.TypeInfo.getTypeNamespace()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.TypeInfo#getTypeNamespace() public abstract java.lang.String
     *      org.w3c.dom.TypeInfo.getTypeNamespace() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeNamespace()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.TypeInfo#getTypeName() public abstract java.lang.String
     * org.w3c.dom.TypeInfo.getTypeName()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.TypeInfo#getTypeName() public abstract java.lang.String
     * org.w3c.dom.TypeInfo.getTypeName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.TypeInfo#getTypeName() public abstract java.lang.String org.w3c.dom.TypeInfo.getTypeName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
