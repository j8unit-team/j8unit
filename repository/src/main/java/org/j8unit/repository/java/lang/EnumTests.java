package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.Enum class java.lang.Enum}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
 * containing the class relevant test methods is {@link org.j8unit.repository.java.lang.EnumTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.EnumClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.Enum
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumTests<SUT extends java.lang.Enum<E>, E extends java.lang.Enum<E>>
extends org.j8unit.repository.java.lang.ComparableTests<SUT, E>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Enum#getDeclaringClass()
     */
    @Test
    public default void getDeclaringClassMustBeAssignableFromGetClass() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<E> declaringClazz = sut.getDeclaringClass();
        final @SuppressWarnings("rawtypes") Class<? extends Enum> clazz = sut.getClass();
        assertTrue(declaringClazz.isAssignableFrom(clazz));
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Enum#getDeclaringClass()
     */
    @Test
    public default void getDeclaringClassMustBeEnum() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<E> declaringClazz = sut.getDeclaringClass();
        assertTrue(declaringClazz.isEnum());
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Enum#ordinal()
     */
    @Test
    public default void ordinalMustBePositive()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertTrue(sut.ordinal() >= 0);
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#compareTo(java.lang.Enum) public final int
     * java.lang.Enum.compareTo(java.lang.Enum)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#compareTo(java.lang.Enum)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_Enum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#equals(java.lang.Object) public final boolean
     * java.lang.Enum.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#equals(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#getDeclaringClass() public final java.lang.Class
     * java.lang.Enum.getDeclaringClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#getDeclaringClass()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaringClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#hashCode() public final int java.lang.Enum.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#hashCode()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#name() public final java.lang.String java.lang.Enum.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#name()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#ordinal() public final int java.lang.Enum.ordinal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#ordinal()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ordinal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#toString() public java.lang.String java.lang.Enum.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Enum#toString()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
