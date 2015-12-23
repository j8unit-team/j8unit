package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.relation.RelationException class
 * javax.management.relation.RelationException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.relation.RelationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.relation.RelationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.relation.RelationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationExceptionTests<SUT extends javax.management.relation.RelationException>
extends org.j8unit.repository.javax.management.JMExceptionTests<SUT> {

}
