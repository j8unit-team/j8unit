package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.Normalizer class java.text.Normalizer}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link NormalizerClassTests}.
 * </p>
 *
 * @see java.text.Normalizer class java.text.Normalizer (the hereby targeted class-under-test class)
 * @see NormalizerClassTests NormalizerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NormalizerTests<SUT extends java.text.Normalizer>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.text.Normalizer.Form class java.text.Normalizer$Form}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link NormalizerClassTests.FormClassTests}.
     * </p>
     *
     * @see java.text.Normalizer.Form class java.text.Normalizer$Form (the hereby targeted class-under-test class)
     * @see NormalizerClassTests.FormClassTests NormalizerClassTests.FormClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FormTests<SUT extends java.text.Normalizer.Form>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.text.Normalizer.Form> {

    }

}
