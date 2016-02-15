package org.j8unit.repository.javax.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.PostConstruct interface javax.annotation.PostConstruct}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link PostConstructClassTests}.
 * </p>
 *
 * @see javax.annotation.PostConstruct interface javax.annotation.PostConstruct (the hereby targeted class-under-test
 *      class)
 * @see PostConstructClassTests PostConstructClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PostConstructTests<SUT extends javax.annotation.PostConstruct>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
