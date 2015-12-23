package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.ServiceUI class javax.print.ServiceUI}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.print.ServiceUITests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.javax.print.ServiceUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.ServiceUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceUITests<SUT extends javax.print.ServiceUI>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
