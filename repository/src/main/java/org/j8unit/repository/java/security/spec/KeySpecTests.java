package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.KeySpec interface java.security.spec.KeySpec}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeySpecClassTests}.
 * </p>
 *
 * @see java.security.spec.KeySpec interface java.security.spec.KeySpec (the hereby targeted class-under-test class)
 * @see KeySpecClassTests KeySpecClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeySpecTests<SUT extends java.security.spec.KeySpec>
extends RepositoryTests<SUT> {

}
