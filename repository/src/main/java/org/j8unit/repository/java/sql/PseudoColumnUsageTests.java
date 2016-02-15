package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.PseudoColumnUsage class java.sql.PseudoColumnUsage}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PseudoColumnUsageClassTests}.
 * </p>
 *
 * @see java.sql.PseudoColumnUsage class java.sql.PseudoColumnUsage (the hereby targeted class-under-test class)
 * @see PseudoColumnUsageClassTests PseudoColumnUsageClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PseudoColumnUsageTests<SUT extends java.sql.PseudoColumnUsage>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.sql.PseudoColumnUsage> {

}
