package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.ServerRequestInfo interface
 * org.omg.PortableInterceptor.ServerRequestInfo}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ServerRequestInfoClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.ServerRequestInfo interface org.omg.PortableInterceptor.ServerRequestInfo (the
 *      hereby targeted class-under-test class)
 * @see ServerRequestInfoClassTests ServerRequestInfoClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerRequestInfoTests<SUT extends org.omg.PortableInterceptor.ServerRequestInfo>
extends ServerRequestInfoOperationsTests<SUT>, RequestInfoTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
