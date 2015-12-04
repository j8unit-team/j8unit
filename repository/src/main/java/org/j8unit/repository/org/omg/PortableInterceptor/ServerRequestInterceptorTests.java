package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ServerRequestInterceptor interface org.omg.PortableInterceptor.ServerRequestInterceptor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServerRequestInterceptorTests<SUT extends org.omg.PortableInterceptor.ServerRequestInterceptor>
extends org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorOperationsTests<SUT>,
        org.j8unit.repository.org.omg.PortableInterceptor.InterceptorTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

}
