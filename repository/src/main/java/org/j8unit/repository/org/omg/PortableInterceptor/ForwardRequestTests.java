package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.ForwardRequest class
 * org.omg.PortableInterceptor.ForwardRequest}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ForwardRequestClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.ForwardRequest class org.omg.PortableInterceptor.ForwardRequest (the hereby targeted
 *      class-under-test class)
 * @see ForwardRequestClassTests ForwardRequestClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForwardRequestTests<SUT extends org.omg.PortableInterceptor.ForwardRequest>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
