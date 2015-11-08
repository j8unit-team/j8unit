/**
 * <p>
 * According to the goals of <em><a href="j8unit.org">J8Unit</a></em>, this packages contains any required extension of
 * {@code org.junit.runners.model}' classes.
 *
 * In detail, this package contains the indispensable extension of {@link org.junit.runners.model.TestClass} in order to
 * support awareness of {@code default} methods. Unfortunately, JUnit does not provide injection of the class model to
 * be used; Thus, you have to specify an according test runner when running J8Unit tests.
 * </p>
 *
 * @see org.j8unit.runners.model.J8TestClass
 * @see org.j8unit.runners.J8Unit4
 * @see org.j8unit.runners.J8Parameterized
 *
 * @author <a href="mailto:stefan@gasterstädt.de">Stefan Gasterst&auml;dt</a>
 * @author <a href="mailto:sascha.zak@zak-digital.de">Sascha Zak</a>
 *
 * @since 4.12
 */
package org.j8unit.runners.model;
