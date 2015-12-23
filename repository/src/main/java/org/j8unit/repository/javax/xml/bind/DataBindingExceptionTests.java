package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.DataBindingException class
 * javax.xml.bind.DataBindingException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.DataBindingExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.DataBindingExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.DataBindingException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataBindingExceptionTests<SUT extends javax.xml.bind.DataBindingException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
