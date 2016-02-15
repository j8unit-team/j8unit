package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.DataBindingException class
 * javax.xml.bind.DataBindingException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DataBindingExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.bind.DataBindingException class javax.xml.bind.DataBindingException (the hereby targeted
 *      class-under-test class)
 * @see DataBindingExceptionClassTests DataBindingExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataBindingExceptionTests<SUT extends javax.xml.bind.DataBindingException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
