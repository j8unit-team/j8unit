package org.j8unit.repository.java.security;

import java.security.KeyRep;
import java.security.KeyRep.Type;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.SerializableTests;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link KeyRep public
 * class java.security.KeyRep}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link KeyRepClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyRepTests<SUT extends KeyRep>
extends SerializableTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyRep]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyRep]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyRep]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Type public
     * static final enum java.security.KeyRep$Type}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.java.security.KeyRepClassTests.TypeClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends Type>
    extends EnumTests<SUT, Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyRep$Type]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyRep$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyRep$Type]
    }

}
