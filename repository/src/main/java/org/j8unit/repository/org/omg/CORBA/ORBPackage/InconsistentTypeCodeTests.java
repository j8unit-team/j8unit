package org.j8unit.repository.org.omg.CORBA.ORBPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.ORBPackage.InconsistentTypeCode class
 * org.omg.CORBA.ORBPackage.InconsistentTypeCode}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InconsistentTypeCodeClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.ORBPackage.InconsistentTypeCode class org.omg.CORBA.ORBPackage.InconsistentTypeCode (the hereby
 *      targeted class-under-test class)
 * @see InconsistentTypeCodeClassTests InconsistentTypeCodeClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InconsistentTypeCodeTests<SUT extends org.omg.CORBA.ORBPackage.InconsistentTypeCode>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
