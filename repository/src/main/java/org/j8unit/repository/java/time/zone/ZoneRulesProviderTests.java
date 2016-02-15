package org.j8unit.repository.java.time.zone;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.zone.ZoneRulesProvider class java.time.zone.ZoneRulesProvider}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ZoneRulesProviderClassTests}.
 * </p>
 *
 * @see java.time.zone.ZoneRulesProvider class java.time.zone.ZoneRulesProvider (the hereby targeted class-under-test
 *      class)
 * @see ZoneRulesProviderClassTests ZoneRulesProviderClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZoneRulesProviderTests<SUT extends java.time.zone.ZoneRulesProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
