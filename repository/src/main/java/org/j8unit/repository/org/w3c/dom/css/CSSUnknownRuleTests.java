package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.css.CSSUnknownRule interface org.w3c.dom.css.CSSUnknownRule}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CSSUnknownRuleClassTests}.
 * </p>
 *
 * @see org.w3c.dom.css.CSSUnknownRule interface org.w3c.dom.css.CSSUnknownRule (the hereby targeted class-under-test
 *      class)
 * @see CSSUnknownRuleClassTests CSSUnknownRuleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSUnknownRuleTests<SUT extends org.w3c.dom.css.CSSUnknownRule>
extends CSSRuleTests<SUT> {

}
