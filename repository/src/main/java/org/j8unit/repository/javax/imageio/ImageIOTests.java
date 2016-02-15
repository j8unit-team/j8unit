package org.j8unit.repository.javax.imageio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.imageio.ImageIO class javax.imageio.ImageIO}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ImageIOClassTests}.
 * </p>
 *
 * @see javax.imageio.ImageIO class javax.imageio.ImageIO (the hereby targeted class-under-test class)
 * @see ImageIOClassTests ImageIOClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ImageIOTests<SUT extends javax.imageio.ImageIO>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
