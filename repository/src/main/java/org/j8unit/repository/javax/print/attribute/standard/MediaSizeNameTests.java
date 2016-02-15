package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.attribute.standard.MediaSizeName class
 * javax.print.attribute.standard.MediaSizeName}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MediaSizeNameClassTests}.
 * </p>
 *
 * @see javax.print.attribute.standard.MediaSizeName class javax.print.attribute.standard.MediaSizeName (the hereby
 *      targeted class-under-test class)
 * @see MediaSizeNameClassTests MediaSizeNameClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MediaSizeNameTests<SUT extends javax.print.attribute.standard.MediaSizeName>
extends MediaTests<SUT> {

}
