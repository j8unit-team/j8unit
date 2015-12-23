package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.TransactionService interface
 * org.omg.IOP.TransactionService}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.TransactionServiceTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.IOP.TransactionServiceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.TransactionService
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransactionServiceTests<SUT extends org.omg.IOP.TransactionService>
extends RepositoryTests<SUT> {

}
