package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.Authenticator class java.net.Authenticator}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link AuthenticatorClassTests}.
 * </p>
 *
 * @see java.net.Authenticator class java.net.Authenticator (the hereby targeted class-under-test class)
 * @see AuthenticatorClassTests AuthenticatorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AuthenticatorTests<SUT extends java.net.Authenticator>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.net.Authenticator.RequestorType class
     * java.net.Authenticator$RequestorType}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link AuthenticatorClassTests.RequestorTypeClassTests}.
     * </p>
     *
     * @see java.net.Authenticator.RequestorType class java.net.Authenticator$RequestorType (the hereby targeted
     *      class-under-test class)
     * @see AuthenticatorClassTests.RequestorTypeClassTests AuthenticatorClassTests.RequestorTypeClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RequestorTypeTests<SUT extends java.net.Authenticator.RequestorType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.net.Authenticator.RequestorType> {

    }

}
