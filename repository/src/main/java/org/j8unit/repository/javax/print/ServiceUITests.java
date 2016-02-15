package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.ServiceUI class javax.print.ServiceUI}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ServiceUIClassTests}.
 * </p>
 *
 * @see javax.print.ServiceUI class javax.print.ServiceUI (the hereby targeted class-under-test class)
 * @see ServiceUIClassTests ServiceUIClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceUITests<SUT extends javax.print.ServiceUI>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
