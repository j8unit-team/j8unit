package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.NoType;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link NoType public
 * abstract interface javax.lang.model.type.NoType}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.lang.model.type.NoTypeClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoTypeTests<SUT extends NoType>
extends TypeMirrorTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.NoType]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.NoType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.NoType]

}
