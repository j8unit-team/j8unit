package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.type.NoType interface javax.lang.model.type.NoType}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link NoTypeClassTests}.
 * </p>
 *
 * @see javax.lang.model.type.NoType interface javax.lang.model.type.NoType (the hereby targeted class-under-test class)
 * @see NoTypeClassTests NoTypeClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoTypeTests<SUT extends javax.lang.model.type.NoType>
extends TypeMirrorTests<SUT> {

}
