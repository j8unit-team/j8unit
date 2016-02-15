package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Character class java.lang.Character}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link CharacterClassTests}.
 * </p>
 *
 * @see Character class java.lang.Character (the hereby targeted class-under-test class)
 * @see CharacterClassTests CharacterClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharacterTests<SUT extends Character>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, ComparableTests<SUT, Character>, ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link Character#charValue() public char java.lang.Character.charValue()}.
     *
     * <p>
     * Test method for {@link Character#charValue() public char java.lang.Character.charValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Character#charValue() public char java.lang.Character.charValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_charValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Character#hashCode() public int java.lang.Character.hashCode()}.
     *
     * <p>
     * Test method for {@link Character#hashCode() public int java.lang.Character.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Character#hashCode() public int java.lang.Character.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link Character#equals(Object) public boolean java.lang.Character.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link Character#equals(Object) public boolean java.lang.Character.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Character#equals(Object) public boolean java.lang.Character.equals(java.lang.Object) (the hereby targeted
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
     * Test method for {@link Character#toString() public java.lang.String java.lang.Character.toString()}.
     *
     * <p>
     * Test method for {@link Character#toString() public java.lang.String java.lang.Character.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Character#toString() public java.lang.String java.lang.Character.toString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link Character#compareTo(Character) public int
     * java.lang.Character.compareTo(java.lang.Character)}.
     *
     * <p>
     * Test method for {@link Character#compareTo(Character) public int
     * java.lang.Character.compareTo(java.lang.Character)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Character#compareTo(Character) public int java.lang.Character.compareTo(java.lang.Character) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_Character()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain Character.Subset class java.lang.Character$Subset}. The complementary
     * j8unit test interface containing the class relevant aspects is {@link CharacterClassTests.SubsetClassTests}.
     * </p>
     *
     * @see Character.Subset class java.lang.Character$Subset (the hereby targeted class-under-test class)
     * @see CharacterClassTests.SubsetClassTests CharacterClassTests.SubsetClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SubsetTests<SUT extends Character.Subset>
    extends ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link Character.Subset#toString() public final java.lang.String
         * java.lang.Character$Subset.toString()}.
         *
         * <p>
         * Test method for {@link Character.Subset#toString() public final java.lang.String
         * java.lang.Character$Subset.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see Character.Subset#toString() public final java.lang.String java.lang.Character$Subset.toString() (the
         *      hereby targeted method-under-test)
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
         * Test method for {@link Character.Subset#hashCode() public final int java.lang.Character$Subset.hashCode()}.
         *
         * <p>
         * Test method for {@link Character.Subset#hashCode() public final int java.lang.Character$Subset.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see Character.Subset#hashCode() public final int java.lang.Character$Subset.hashCode() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link Character.Subset#equals(Object) public final boolean
         * java.lang.Character$Subset.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link Character.Subset#equals(Object) public final boolean
         * java.lang.Character$Subset.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see Character.Subset#equals(Object) public final boolean java.lang.Character$Subset.equals(java.lang.Object)
         *      (the hereby targeted method-under-test)
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

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain Character.UnicodeScript class java.lang.Character$UnicodeScript}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link CharacterClassTests.UnicodeScriptClassTests}.
     * </p>
     *
     * @see Character.UnicodeScript class java.lang.Character$UnicodeScript (the hereby targeted class-under-test class)
     * @see CharacterClassTests.UnicodeScriptClassTests CharacterClassTests.UnicodeScriptClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnicodeScriptTests<SUT extends Character.UnicodeScript>
    extends EnumTests<SUT, Character.UnicodeScript> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain Character.UnicodeBlock class java.lang.Character$UnicodeBlock}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link CharacterClassTests.UnicodeBlockClassTests}.
     * </p>
     *
     * @see Character.UnicodeBlock class java.lang.Character$UnicodeBlock (the hereby targeted class-under-test class)
     * @see CharacterClassTests.UnicodeBlockClassTests CharacterClassTests.UnicodeBlockClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnicodeBlockTests<SUT extends Character.UnicodeBlock>
    extends CharacterTests.SubsetTests<SUT> {

    }

}
