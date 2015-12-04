package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.text.Normalizer class java.text.Normalizer}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.text.NormalizerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NormalizerTests<SUT extends java.text.Normalizer>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.text.Normalizer$Form class java.text.Normalizer$Form}, containing all instance
     * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.text.NormalizerClassTests.FormClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FormTests<SUT extends java.text.Normalizer.Form>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.text.Normalizer.Form> {

    }

}
