/**
 * <p>
 * This package provides various utility and helper classes/enums to work with Java Types:
 * </p>
 *
 * <ul>
 * <li>{@linkplain org.j8unit.generator.analysis.AccessModifier Access Levels}:
 * {@link org.j8unit.generator.analysis.AccessModifier#PUBLIC},
 * {@link org.j8unit.generator.analysis.AccessModifier#PROTECTED} ,
 * {@link org.j8unit.generator.analysis.AccessModifier#PACKAGE_PRIVATE},
 * {@link org.j8unit.generator.analysis.AccessModifier#PRIVATE}</li>
 * <li>{@linkplain org.j8unit.generator.analysis.AccessScope Access Scopes}:
 * {@link org.j8unit.generator.analysis.AccessScope#INSTANCE}, {@link org.j8unit.generator.analysis.AccessScope#CLASS}
 * </li>
 * <li>{@linkplain org.j8unit.generator.analysis.TypeNatures Natures of Java Types}:
 * {@link org.j8unit.generator.analysis.TypeNatures#NON_GENERIC},
 * {@link org.j8unit.generator.analysis.TypeNatures#GENERIC}, {@link org.j8unit.generator.analysis.TypeNatures#RAW}</li>
 * <li>{@linkplain org.j8unit.generator.analysis.TypePosition Positions of Java Types}:
 * {@link org.j8unit.generator.analysis.TypePosition#TOP_LEVEL},
 * {@link org.j8unit.generator.analysis.TypePosition#NESTED}, {@link org.j8unit.generator.analysis.TypePosition#INNER},
 * {@link org.j8unit.generator.analysis.TypePosition#LOCAL},
 * {@link org.j8unit.generator.analysis.TypePosition#ANONYMOUS}</li>
 * </ul>
 *
 * <ul>
 * <li>{@link org.j8unit.generator.util.TypeAnalysis} to analyse types</li>
 * <li>{@link org.j8unit.generator.util.TypeAnalysis#classHierarchy(Class)} to iterate through some type's class
 * hierarchy</li>
 * </ul>
 */
package org.j8unit.generator.analysis;
