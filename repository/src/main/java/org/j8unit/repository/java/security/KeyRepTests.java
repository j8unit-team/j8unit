package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.KeyRep class java.security.KeyRep}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.security.KeyRepTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.KeyRepClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.KeyRep
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyRepTests<SUT extends java.security.KeyRep>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyRep.Type class java.security.KeyRep$Type},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
     * counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyRepTests.TypeTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyRepClassTests.TypeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyRep.Type
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends java.security.KeyRep.Type>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.security.KeyRep.Type> {

    }

}
