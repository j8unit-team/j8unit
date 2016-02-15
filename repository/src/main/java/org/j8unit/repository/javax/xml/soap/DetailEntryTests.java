package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.DetailEntry interface javax.xml.soap.DetailEntry}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DetailEntryClassTests}.
 * </p>
 *
 * @see javax.xml.soap.DetailEntry interface javax.xml.soap.DetailEntry (the hereby targeted class-under-test class)
 * @see DetailEntryClassTests DetailEntryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DetailEntryTests<SUT extends javax.xml.soap.DetailEntry>
extends SOAPElementTests<SUT> {

}
