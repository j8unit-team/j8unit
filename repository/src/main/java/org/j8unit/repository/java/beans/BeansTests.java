package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.Beans class java.beans.Beans}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link BeansClassTests}.
 * </p>
 *
 * @see java.beans.Beans class java.beans.Beans (the hereby targeted class-under-test class)
 * @see BeansClassTests BeansClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeansTests<SUT extends java.beans.Beans>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
