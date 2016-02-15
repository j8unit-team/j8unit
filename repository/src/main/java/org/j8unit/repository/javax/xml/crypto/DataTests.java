package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.Data interface javax.xml.crypto.Data}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link DataClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.Data interface javax.xml.crypto.Data (the hereby targeted class-under-test class)
 * @see DataClassTests DataClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataTests<SUT extends javax.xml.crypto.Data>
extends RepositoryTests<SUT> {

}
