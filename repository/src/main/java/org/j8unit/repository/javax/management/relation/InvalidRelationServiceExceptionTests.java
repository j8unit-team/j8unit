package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.InvalidRelationServiceException class
 * javax.management.relation.InvalidRelationServiceException}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link InvalidRelationServiceExceptionClassTests}.
 * </p>
 *
 * @see javax.management.relation.InvalidRelationServiceException class
 *      javax.management.relation.InvalidRelationServiceException (the hereby targeted class-under-test class)
 * @see InvalidRelationServiceExceptionClassTests InvalidRelationServiceExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidRelationServiceExceptionTests<SUT extends javax.management.relation.InvalidRelationServiceException>
extends RelationExceptionTests<SUT> {

}
