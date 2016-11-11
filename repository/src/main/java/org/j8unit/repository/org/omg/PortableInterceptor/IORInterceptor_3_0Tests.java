package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;
import org.omg.PortableInterceptor.IORInterceptor_3_0;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link IORInterceptor_3_0 public abstract interface org.omg.PortableInterceptor.IORInterceptor_3_0}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0ClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInterceptor_3_0Tests<SUT extends IORInterceptor_3_0>
extends IORInterceptor_3_0OperationsTests<SUT>, IORInterceptorTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0]

}
