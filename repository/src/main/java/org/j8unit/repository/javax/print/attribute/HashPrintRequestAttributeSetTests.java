package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link HashPrintRequestAttributeSet public class javax.print.attribute.HashPrintRequestAttributeSet}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.print.attribute.HashPrintRequestAttributeSetClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HashPrintRequestAttributeSetTests<SUT extends HashPrintRequestAttributeSet>
extends org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetTests<SUT>, org.j8unit.repository.javax.print.attribute.HashAttributeSetTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.HashPrintRequestAttributeSet]

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link HashAttributeSet#add(Attribute) class javax.print.attribute.HashAttributeSet}</li>
     * <li>{@link PrintRequestAttributeSet#add(Attribute) interface javax.print.attribute.PrintRequestAttributeSet}</li>
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
        org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetTests.super.test_add_Attribute();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link HashAttributeSet#addAll(AttributeSet) class javax.print.attribute.HashAttributeSet}</li>
     * <li>{@link PrintRequestAttributeSet#addAll(AttributeSet) interface
     * javax.print.attribute.PrintRequestAttributeSet}</li>
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
        org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetTests.super.test_addAll_AttributeSet();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.HashPrintRequestAttributeSet]

}
