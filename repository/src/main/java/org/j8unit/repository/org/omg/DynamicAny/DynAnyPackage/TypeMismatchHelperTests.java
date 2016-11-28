package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.experimental.categories.Category;
import org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link TypeMismatchHelper public abstract class org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelperClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeMismatchHelperTests<SUT extends TypeMismatchHelper>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper]

}
