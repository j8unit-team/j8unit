package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.IORInterceptor_3_0Helper class
 * org.omg.PortableInterceptor.IORInterceptor_3_0Helper}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link IORInterceptor_3_0HelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.IORInterceptor_3_0Helper class org.omg.PortableInterceptor.IORInterceptor_3_0Helper
 *      (the hereby targeted class-under-test class)
 * @see IORInterceptor_3_0HelperClassTests IORInterceptor_3_0HelperClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInterceptor_3_0HelperTests<SUT extends org.omg.PortableInterceptor.IORInterceptor_3_0Helper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
