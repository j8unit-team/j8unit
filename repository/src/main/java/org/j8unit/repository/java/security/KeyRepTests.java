package org.j8unit.repository.java.security;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.KeyRep class java.security.KeyRep},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.KeyRepClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyRepTests<SUT extends java.security.KeyRep>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test class for {@link java.security.KeyRep$Type class java.security.KeyRep$Type},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyRepClassTests.TypeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends java.security.KeyRep.Type>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,java.security.KeyRep.Type>
    {

    }

}
