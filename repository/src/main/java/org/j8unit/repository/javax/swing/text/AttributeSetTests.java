package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.AttributeSet interface javax.swing.text.AttributeSet}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.AttributeSetTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.AttributeSetClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.AttributeSet
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeSetTests<SUT extends javax.swing.text.AttributeSet>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AttributeSet.CharacterAttribute interface
     * javax.swing.text.AttributeSet$CharacterAttribute}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.AttributeSetTests.CharacterAttributeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AttributeSet.CharacterAttribute
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacterAttributeTests<SUT extends javax.swing.text.AttributeSet.CharacterAttribute>
    extends RepositoryTests<SUT> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AttributeSet.ColorAttribute interface
     * javax.swing.text.AttributeSet$ColorAttribute}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.AttributeSetTests.ColorAttributeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ColorAttributeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AttributeSet.ColorAttribute
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ColorAttributeTests<SUT extends javax.swing.text.AttributeSet.ColorAttribute>
    extends RepositoryTests<SUT> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AttributeSet.FontAttribute interface
     * javax.swing.text.AttributeSet$FontAttribute}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.AttributeSetTests.FontAttributeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.AttributeSetClassTests.FontAttributeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AttributeSet.FontAttribute
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontAttributeTests<SUT extends javax.swing.text.AttributeSet.FontAttribute>
    extends RepositoryTests<SUT> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AttributeSet.ParagraphAttribute interface
     * javax.swing.text.AttributeSet$ParagraphAttribute}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.AttributeSetTests.ParagraphAttributeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ParagraphAttributeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AttributeSet.ParagraphAttribute
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParagraphAttributeTests<SUT extends javax.swing.text.AttributeSet.ParagraphAttribute>
    extends RepositoryTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#containsAttribute(java.lang.Object, java.lang.Object) public
     * abstract boolean javax.swing.text.AttributeSet.containsAttribute(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#containsAttribute(java.lang.Object, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsAttribute_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#containsAttributes(javax.swing.text.AttributeSet) public
     * abstract boolean javax.swing.text.AttributeSet.containsAttributes(javax.swing.text.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#containsAttributes(javax.swing.text.AttributeSet)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsAttributes_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#copyAttributes() public abstract
     * javax.swing.text.AttributeSet javax.swing.text.AttributeSet.copyAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#copyAttributes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copyAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#getAttribute(java.lang.Object) public abstract
     * java.lang.Object javax.swing.text.AttributeSet.getAttribute(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#getAttribute(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#getAttributeCount() public abstract int
     * javax.swing.text.AttributeSet.getAttributeCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#getAttributeCount()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#getAttributeNames() public abstract java.util.Enumeration
     * javax.swing.text.AttributeSet.getAttributeNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#getAttributeNames()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#getResolveParent() public abstract
     * javax.swing.text.AttributeSet javax.swing.text.AttributeSet.getResolveParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#getResolveParent()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResolveParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#isDefined(java.lang.Object) public abstract boolean
     * javax.swing.text.AttributeSet.isDefined(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#isDefined(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDefined_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AttributeSet#isEqual(javax.swing.text.AttributeSet) public abstract
     * boolean javax.swing.text.AttributeSet.isEqual(javax.swing.text.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AttributeSet#isEqual(javax.swing.text.AttributeSet)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEqual_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
