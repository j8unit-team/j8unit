package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.Character class java.lang.Character}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.CharacterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharacterTests<SUT extends java.lang.Character>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ComparableTests<SUT, java.lang.Character>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.lang.Character$Subset class java.lang.Character$Subset}, containing all instance
     * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.lang.CharacterClassTests.SubsetClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SubsetTests<SUT extends java.lang.Character.Subset>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.lang.Character.Subset#equals(java.lang.Object) public final boolean
         * java.lang.Character$Subset.equals(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
         * Test method for {@link java.lang.Character.Subset#hashCode() public final int
         * java.lang.Character$Subset.hashCode()}.
         * </p>
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
         * Test method for {@link java.lang.Character.Subset#toString() public final java.lang.String
         * java.lang.Character$Subset.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.lang.Character$UnicodeBlock class java.lang.Character$UnicodeBlock}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.lang.CharacterClassTests.UnicodeBlockClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnicodeBlockTests<SUT extends java.lang.Character.UnicodeBlock>
    extends org.j8unit.repository.java.lang.CharacterTests.SubsetTests<SUT> {

    }

    /**
     * <p>
     * Test class for {@link java.lang.Character$UnicodeScript class java.lang.Character$UnicodeScript}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.lang.CharacterClassTests.UnicodeScriptClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnicodeScriptTests<SUT extends java.lang.Character.UnicodeScript>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.lang.Character.UnicodeScript> {

    }

    /**
     * <p>
     * Test method for {@link java.lang.Character#charValue() public char java.lang.Character.charValue()}.
     * </p>
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
     * Test method for {@link java.lang.Character#compareTo(java.lang.Character) public int
     * java.lang.Character.compareTo(java.lang.Character)}.
     * </p>
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
     * Test method for {@link java.lang.Character#equals(java.lang.Object) public boolean
     * java.lang.Character.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.Character#hashCode() public int java.lang.Character.hashCode()}.
     * </p>
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
     * Test method for {@link java.lang.Character#toString() public java.lang.String java.lang.Character.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
