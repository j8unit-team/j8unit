package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.CODESET_INCOMPATIBLE class
 * org.omg.CORBA.CODESET_INCOMPATIBLE}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CODESET_INCOMPATIBLEClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.CODESET_INCOMPATIBLE class org.omg.CORBA.CODESET_INCOMPATIBLE (the hereby targeted
 *      class-under-test class)
 * @see CODESET_INCOMPATIBLEClassTests CODESET_INCOMPATIBLEClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CODESET_INCOMPATIBLETests<SUT extends org.omg.CORBA.CODESET_INCOMPATIBLE>
extends SystemExceptionTests<SUT> {

}
