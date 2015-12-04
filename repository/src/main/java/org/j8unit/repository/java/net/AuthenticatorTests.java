package org.j8unit.repository.java.net;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.net.Authenticator class java.net.Authenticator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.AuthenticatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AuthenticatorTests<SUT extends java.net.Authenticator>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test class for {@link java.net.Authenticator$RequestorType class java.net.Authenticator$RequestorType},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.net.AuthenticatorClassTests.RequestorTypeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface RequestorTypeTests<SUT extends java.net.Authenticator.RequestorType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,java.net.Authenticator.RequestorType>
    {

    }

}
