package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.CDATASection interface org.w3c.dom.CDATASection},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.CDATASectionTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.CDATASectionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.CDATASection
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CDATASectionTests<SUT extends org.w3c.dom.CDATASection>
extends org.j8unit.repository.org.w3c.dom.TextTests<SUT> {

}
