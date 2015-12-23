package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.text.Normalizer class java.text.Normalizer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.text.NormalizerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.text.NormalizerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.text.Normalizer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NormalizerTests<SUT extends java.text.Normalizer>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.text.Normalizer.Form class java.text.Normalizer$Form},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
     * counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.text.NormalizerTests.FormTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.text.NormalizerClassTests.FormClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.text.Normalizer.Form
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FormTests<SUT extends java.text.Normalizer.Form>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.text.Normalizer.Form> {

    }

}
