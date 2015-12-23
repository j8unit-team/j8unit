package org.j8unit.repository.javax.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.annotation.PostConstruct interface
 * javax.annotation.PostConstruct}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.annotation.PostConstructTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.annotation.PostConstructClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.annotation.PostConstruct
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PostConstructTests<SUT extends javax.annotation.PostConstruct>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
