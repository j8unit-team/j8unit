package org.j8unit.repository.org.omg.IOP.CodecPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.CodecPackage.FormatMismatch class
 * org.omg.IOP.CodecPackage.FormatMismatch}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link FormatMismatchClassTests}.
 * </p>
 *
 * @see org.omg.IOP.CodecPackage.FormatMismatch class org.omg.IOP.CodecPackage.FormatMismatch (the hereby targeted
 *      class-under-test class)
 * @see FormatMismatchClassTests FormatMismatchClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatMismatchTests<SUT extends org.omg.IOP.CodecPackage.FormatMismatch>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
