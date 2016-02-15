package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.IsoFields class java.time.temporal.IsoFields}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link IsoFieldsClassTests}.
 * </p>
 *
 * @see java.time.temporal.IsoFields class java.time.temporal.IsoFields (the hereby targeted class-under-test class)
 * @see IsoFieldsClassTests IsoFieldsClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IsoFieldsTests<SUT extends java.time.temporal.IsoFields>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
