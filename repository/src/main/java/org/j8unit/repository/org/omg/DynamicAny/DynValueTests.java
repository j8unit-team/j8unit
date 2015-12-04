package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynValue interface org.omg.DynamicAny.DynValue},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynValueClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynValueTests<SUT extends org.omg.DynamicAny.DynValue>
extends org.j8unit.repository.org.omg.DynamicAny.DynValueOperationsTests<SUT>,
        org.j8unit.repository.org.omg.DynamicAny.DynValueCommonTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

}
