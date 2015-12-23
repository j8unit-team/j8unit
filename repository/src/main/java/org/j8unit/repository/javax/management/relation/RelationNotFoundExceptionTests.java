package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.relation.RelationNotFoundException class
 * javax.management.relation.RelationNotFoundException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.relation.RelationNotFoundExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.relation.RelationNotFoundExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.relation.RelationNotFoundException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationNotFoundExceptionTests<SUT extends javax.management.relation.RelationNotFoundException>
extends org.j8unit.repository.javax.management.relation.RelationExceptionTests<SUT> {

}
