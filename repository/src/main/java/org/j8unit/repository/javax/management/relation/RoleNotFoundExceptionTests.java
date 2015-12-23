package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.relation.RoleNotFoundException class
 * javax.management.relation.RoleNotFoundException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.relation.RoleNotFoundExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.relation.RoleNotFoundExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.relation.RoleNotFoundException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoleNotFoundExceptionTests<SUT extends javax.management.relation.RoleNotFoundException>
extends org.j8unit.repository.javax.management.relation.RelationExceptionTests<SUT> {

}
