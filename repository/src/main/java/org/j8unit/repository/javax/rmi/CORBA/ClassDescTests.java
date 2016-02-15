package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.rmi.CORBA.ClassDesc class javax.rmi.CORBA.ClassDesc}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ClassDescClassTests}.
 * </p>
 *
 * @see javax.rmi.CORBA.ClassDesc class javax.rmi.CORBA.ClassDesc (the hereby targeted class-under-test class)
 * @see ClassDescClassTests ClassDescClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassDescTests<SUT extends javax.rmi.CORBA.ClassDesc>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
