package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.HashPrintServiceAttributeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link HashPrintServiceAttributeSet public class javax.print.attribute.HashPrintServiceAttributeSet}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.print.attribute.HashPrintServiceAttributeSetClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HashPrintServiceAttributeSetTests<SUT extends HashPrintServiceAttributeSet>
extends org.j8unit.repository.javax.print.attribute.PrintServiceAttributeSetTests<SUT>, org.j8unit.repository.javax.print.attribute.HashAttributeSetTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.HashPrintServiceAttributeSet]

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.print.attribute.HashAttributeSet#add(javax.print.attribute.Attribute) class
     * javax.print.attribute.HashAttributeSet}</li>
     * <li>{@link javax.print.attribute.PrintServiceAttributeSet#add(javax.print.attribute.Attribute) interface
     * javax.print.attribute.PrintServiceAttributeSet}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_Attribute()
    throws Exception {
        org.j8unit.repository.javax.print.attribute.HashAttributeSetTests.super.test_add_Attribute();
        org.j8unit.repository.javax.print.attribute.PrintServiceAttributeSetTests.super.test_add_Attribute();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.print.attribute.HashAttributeSet#addAll(javax.print.attribute.AttributeSet) class
     * javax.print.attribute.HashAttributeSet}</li>
     * <li>{@link javax.print.attribute.PrintServiceAttributeSet#addAll(javax.print.attribute.AttributeSet) interface
     * javax.print.attribute.PrintServiceAttributeSet}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addAll_AttributeSet()
    throws Exception {
        org.j8unit.repository.javax.print.attribute.HashAttributeSetTests.super.test_addAll_AttributeSet();
        org.j8unit.repository.javax.print.attribute.PrintServiceAttributeSetTests.super.test_addAll_AttributeSet();
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.HashPrintServiceAttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.HashPrintServiceAttributeSet]
}
