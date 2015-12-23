package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.soap.DetailEntry interface javax.xml.soap.DetailEntry},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.soap.DetailEntryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.soap.DetailEntryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.soap.DetailEntry
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DetailEntryTests<SUT extends javax.xml.soap.DetailEntry>
extends org.j8unit.repository.javax.xml.soap.SOAPElementTests<SUT> {

}
