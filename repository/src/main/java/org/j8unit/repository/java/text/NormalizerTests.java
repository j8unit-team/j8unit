package org.j8unit.repository.java.text;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Normalizer
 * public final class java.text.Normalizer}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.text.NormalizerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NormalizerTests<SUT extends Normalizer>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Normalizer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Normalizer]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Form public
     * static final enum java.text.Normalizer$Form}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.java.text.NormalizerClassTests.FormClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FormTests<SUT extends Form>
    extends EnumTests<SUT, Form> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer$Form]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Normalizer$Form]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Normalizer$Form]

    }

}
