package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Enum class java.lang.Enum}. The complementary j8unit test interface
 * containing the class relevant aspects is {@link EnumClassTests}.
 * </p>
 *
 * @see Enum class java.lang.Enum (the hereby targeted class-under-test class)
 * @see EnumClassTests EnumClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumTests<SUT extends Enum<E>, E extends Enum<E>>
extends ComparableTests<SUT, E>, org.j8unit.repository.java.io.SerializableTests<SUT>, ObjectTests<SUT> {

    /**
     * @see Enum#getDeclaringClass() public final java.lang.Class java.lang.Enum.getDeclaringClass() (the hereby
     *      targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void getDeclaringClassMustBeAssignableFromGetClass() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<E> declaringClazz = sut.getDeclaringClass();
        final Class<? extends Enum> clazz = sut.getClass();
        assertTrue(declaringClazz.isAssignableFrom(clazz));
    }

    /**
     * @see Enum#getDeclaringClass() public final java.lang.Class java.lang.Enum.getDeclaringClass() (the hereby
     *      targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void getDeclaringClassMustBeEnum() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<E> declaringClazz = sut.getDeclaringClass();
        assertTrue(declaringClazz.isEnum());
    }

    /**
     * @see Enum#ordinal() public final int java.lang.Enum.ordinal() (the hereby targeted method-under-test)
     *
     * @since 0.9.2
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
     * Test method for {@link Enum#hashCode() public final int java.lang.Enum.hashCode()}.
     *
     * <p>
     * Test method for {@link Enum#hashCode() public final int java.lang.Enum.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#hashCode() public final int java.lang.Enum.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Enum#equals(Object) public final boolean java.lang.Enum.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link Enum#equals(Object) public final boolean java.lang.Enum.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#equals(Object) public final boolean java.lang.Enum.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Enum#getDeclaringClass() public final java.lang.Class
     * <E> java.lang.Enum.getDeclaringClass()}.
     *
     * <p>
     * Test method for {@link Enum#getDeclaringClass() public final java.lang.Class java.lang.Enum.getDeclaringClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#getDeclaringClass() public final java.lang.Class java.lang.Enum.getDeclaringClass() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link Enum#ordinal() public final int java.lang.Enum.ordinal()}.
     *
     * <p>
     * Test method for {@link Enum#ordinal() public final int java.lang.Enum.ordinal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#ordinal() public final int java.lang.Enum.ordinal() (the hereby targeted method-under-test)
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
     * Test method for {@link Enum#name() public final java.lang.String java.lang.Enum.name()}.
     *
     * <p>
     * Test method for {@link Enum#name() public final java.lang.String java.lang.Enum.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#name() public final java.lang.String java.lang.Enum.name() (the hereby targeted method-under-test)
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
     * Test method for {@link Enum#toString() public java.lang.String java.lang.Enum.toString()}.
     *
     * <p>
     * Test method for {@link Enum#toString() public java.lang.String java.lang.Enum.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#toString() public java.lang.String java.lang.Enum.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link Enum#compareTo(Enum) public final int java.lang.Enum.compareTo(E)}.
     *
     * <p>
     * Test method for {@link Enum#compareTo(Enum) public final int java.lang.Enum.compareTo(java.lang.Enum)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Enum#compareTo(Enum) public final int java.lang.Enum.compareTo(java.lang.Enum) (the hereby targeted
     *      method-under-test)
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

}
