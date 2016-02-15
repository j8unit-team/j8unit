package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyRep class java.security.KeyRep}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link KeyRepClassTests}.
 * </p>
 *
 * @see java.security.KeyRep class java.security.KeyRep (the hereby targeted class-under-test class)
 * @see KeyRepClassTests KeyRepClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyRepTests<SUT extends java.security.KeyRep>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyRep.Type class java.security.KeyRep$Type}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link KeyRepClassTests.TypeClassTests}.
     * </p>
     *
     * @see java.security.KeyRep.Type class java.security.KeyRep$Type (the hereby targeted class-under-test class)
     * @see KeyRepClassTests.TypeClassTests KeyRepClassTests.TypeClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends java.security.KeyRep.Type>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.security.KeyRep.Type> {

    }

}
