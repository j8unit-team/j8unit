package org.j8unit.repository.java.net;

import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.java.net.AuthenticatorClassTests.RequestorTypeClassTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Authenticator
 * public abstract class java.net.Authenticator}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link AuthenticatorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AuthenticatorTests<SUT extends Authenticator>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Authenticator]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Authenticator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Authenticator]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link RequestorType public static final enum java.net.Authenticator$RequestorType}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link RequestorTypeClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RequestorTypeTests<SUT extends RequestorType>
    extends EnumTests<SUT, RequestorType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Authenticator$RequestorType]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Authenticator$RequestorType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Authenticator$RequestorType]
    }

}
