package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.ENCODING_CDR_ENCAPS interface org.omg.IOP.ENCODING_CDR_ENCAPS}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link ENCODING_CDR_ENCAPSClassTests}.
 * </p>
 *
 * @see org.omg.IOP.ENCODING_CDR_ENCAPS interface org.omg.IOP.ENCODING_CDR_ENCAPS (the hereby targeted class-under-test
 *      class)
 * @see ENCODING_CDR_ENCAPSClassTests ENCODING_CDR_ENCAPSClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ENCODING_CDR_ENCAPSTests<SUT extends org.omg.IOP.ENCODING_CDR_ENCAPS>
extends RepositoryTests<SUT> {

}
