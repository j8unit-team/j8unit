package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.IDLType interface org.omg.CORBA.IDLType},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.IDLTypeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IDLTypeTests<SUT extends org.omg.CORBA.IDLType>
extends org.j8unit.repository.org.omg.CORBA.IDLTypeOperationsTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.IRObjectTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

}
