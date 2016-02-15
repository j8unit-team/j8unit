package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.InvalidRelationTypeException class
 * javax.management.relation.InvalidRelationTypeException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidRelationTypeExceptionClassTests}.
 * </p>
 *
 * @see javax.management.relation.InvalidRelationTypeException class
 *      javax.management.relation.InvalidRelationTypeException (the hereby targeted class-under-test class)
 * @see InvalidRelationTypeExceptionClassTests InvalidRelationTypeExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidRelationTypeExceptionTests<SUT extends javax.management.relation.InvalidRelationTypeException>
extends RelationExceptionTests<SUT> {

}
