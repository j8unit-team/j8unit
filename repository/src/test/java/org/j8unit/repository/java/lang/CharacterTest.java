package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CharacterTest
implements org.j8unit.repository.java.lang.CharacterTests<java.lang.Character> {

    @Override
    public java.lang.Character createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.Character] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UnicodeScriptTest
    implements org.j8unit.repository.java.lang.CharacterTests.UnicodeScriptTests<java.lang.Character.UnicodeScript> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.lang.Character.UnicodeScript.class);
        }

        @Parameter(0)
        public java.lang.Character.UnicodeScript sut;

        @Override
        public java.lang.Character.UnicodeScript createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SubsetTest
    implements org.j8unit.repository.java.lang.CharacterTests.SubsetTests<java.lang.Character.Subset> {

        @Override
        public java.lang.Character.Subset createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.lang.Character.Subset] available.");
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UnicodeBlockTest
    implements org.j8unit.repository.java.lang.CharacterTests.UnicodeBlockTests<java.lang.Character.UnicodeBlock> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.lang.Character.UnicodeBlock.LIMBU, //
                                    java.lang.Character.UnicodeBlock.DESERET, //
                                    java.lang.Character.UnicodeBlock.LYCIAN, //
                                    java.lang.Character.UnicodeBlock.CURRENCY_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.GEORGIAN_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.LEPCHA, //
                                    java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.TAKRI, //
                                    java.lang.Character.UnicodeBlock.KHAROSHTHI, //
                                    java.lang.Character.UnicodeBlock.INSCRIPTIONAL_PAHLAVI, //
                                    java.lang.Character.UnicodeBlock.MEETEI_MAYEK, //
                                    java.lang.Character.UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.LISU, //
                                    java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS, //
                                    java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES, //
                                    java.lang.Character.UnicodeBlock.SUNDANESE, //
                                    java.lang.Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.GEOMETRIC_SHAPES, //
                                    java.lang.Character.UnicodeBlock.CYPRIOT_SYLLABARY, //
                                    java.lang.Character.UnicodeBlock.SORA_SOMPENG, //
                                    java.lang.Character.UnicodeBlock.TIBETAN, //
                                    java.lang.Character.UnicodeBlock.BRAILLE_PATTERNS, //
                                    java.lang.Character.UnicodeBlock.KANA_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES, //
                                    java.lang.Character.UnicodeBlock.BAMUM_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.BASIC_LATIN, //
                                    java.lang.Character.UnicodeBlock.GOTHIC, //
                                    java.lang.Character.UnicodeBlock.OL_CHIKI, //
                                    java.lang.Character.UnicodeBlock.BAMUM, //
                                    java.lang.Character.UnicodeBlock.SAURASHTRA, //
                                    java.lang.Character.UnicodeBlock.LYDIAN, //
                                    java.lang.Character.UnicodeBlock.TAI_THAM, //
                                    java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.ALCHEMICAL_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.NUMBER_FORMS, //
                                    java.lang.Character.UnicodeBlock.KHMER_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_A, //
                                    java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_B, //
                                    java.lang.Character.UnicodeBlock.CJK_STROKES, //
                                    java.lang.Character.UnicodeBlock.HANGUL_JAMO_EXTENDED_A, //
                                    java.lang.Character.UnicodeBlock.TAGBANWA, //
                                    java.lang.Character.UnicodeBlock.VAI, //
                                    java.lang.Character.UnicodeBlock.HANGUL_JAMO_EXTENDED_B, //
                                    java.lang.Character.UnicodeBlock.PLAYING_CARDS, //
                                    java.lang.Character.UnicodeBlock.OLD_ITALIC, //
                                    java.lang.Character.UnicodeBlock.TIFINAGH, //
                                    java.lang.Character.UnicodeBlock.ETHIOPIC, //
                                    java.lang.Character.UnicodeBlock.BOPOMOFO, //
                                    java.lang.Character.UnicodeBlock.GUJARATI, //
                                    java.lang.Character.UnicodeBlock.MEROITIC_HIEROGLYPHS, //
                                    java.lang.Character.UnicodeBlock.GREEK, //
                                    java.lang.Character.UnicodeBlock.MIAO, //
                                    java.lang.Character.UnicodeBlock.TAI_LE, //
                                    java.lang.Character.UnicodeBlock.KANBUN, //
                                    java.lang.Character.UnicodeBlock.DEVANAGARI_EXTENDED, //
                                    java.lang.Character.UnicodeBlock.BALINESE, //
                                    java.lang.Character.UnicodeBlock.TAMIL, //
                                    java.lang.Character.UnicodeBlock.INSCRIPTIONAL_PARTHIAN, //
                                    java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS, //
                                    java.lang.Character.UnicodeBlock.ARROWS, //
                                    java.lang.Character.UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A, //
                                    java.lang.Character.UnicodeBlock.MANDAIC, //
                                    java.lang.Character.UnicodeBlock.CYRILLIC_SUPPLEMENTARY, //
                                    java.lang.Character.UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B, //
                                    java.lang.Character.UnicodeBlock.CARIAN, //
                                    java.lang.Character.UnicodeBlock.MALAYALAM, //
                                    java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, //
                                    java.lang.Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.ORIYA, //
                                    java.lang.Character.UnicodeBlock.OLD_PERSIAN, //
                                    java.lang.Character.UnicodeBlock.HANUNOO, //
                                    java.lang.Character.UnicodeBlock.NKO, //
                                    java.lang.Character.UnicodeBlock.KATAKANA, //
                                    java.lang.Character.UnicodeBlock.PRIVATE_USE_AREA, //
                                    java.lang.Character.UnicodeBlock.PHONETIC_EXTENSIONS_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.REJANG, //
                                    java.lang.Character.UnicodeBlock.TAGS, //
                                    java.lang.Character.UnicodeBlock.EGYPTIAN_HIEROGLYPHS, //
                                    java.lang.Character.UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.OLD_TURKIC, //
                                    java.lang.Character.UnicodeBlock.DOMINO_TILES, //
                                    java.lang.Character.UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS, //
                                    java.lang.Character.UnicodeBlock.IMPERIAL_ARAMAIC, //
                                    java.lang.Character.UnicodeBlock.BLOCK_ELEMENTS, //
                                    java.lang.Character.UnicodeBlock.COPTIC, //
                                    java.lang.Character.UnicodeBlock.MAHJONG_TILES, //
                                    java.lang.Character.UnicodeBlock.MATHEMATICAL_OPERATORS, //
                                    java.lang.Character.UnicodeBlock.SYLOTI_NAGRI, //
                                    java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED, //
                                    java.lang.Character.UnicodeBlock.IPA_EXTENSIONS, //
                                    java.lang.Character.UnicodeBlock.SHARADA, //
                                    java.lang.Character.UnicodeBlock.GENERAL_PUNCTUATION, //
                                    java.lang.Character.UnicodeBlock.MODIFIER_TONE_LETTERS, //
                                    java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, //
                                    java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, //
                                    java.lang.Character.UnicodeBlock.KAITHI, //
                                    java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C, //
                                    java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D, //
                                    java.lang.Character.UnicodeBlock.COMMON_INDIC_NUMBER_FORMS, //
                                    java.lang.Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B, //
                                    java.lang.Character.UnicodeBlock.HIRAGANA, //
                                    java.lang.Character.UnicodeBlock.PHAGS_PA, //
                                    java.lang.Character.UnicodeBlock.DINGBATS, //
                                    java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS, //
                                    java.lang.Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A, //
                                    java.lang.Character.UnicodeBlock.MEETEI_MAYEK_EXTENSIONS, //
                                    java.lang.Character.UnicodeBlock.DEVANAGARI, //
                                    java.lang.Character.UnicodeBlock.RUNIC, //
                                    java.lang.Character.UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS, //
                                    java.lang.Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, //
                                    java.lang.Character.UnicodeBlock.OLD_SOUTH_ARABIAN, //
                                    java.lang.Character.UnicodeBlock.SHAVIAN, //
                                    java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, //
                                    java.lang.Character.UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.LATIN_EXTENDED_B, //
                                    java.lang.Character.UnicodeBlock.LATIN_EXTENDED_A, //
                                    java.lang.Character.UnicodeBlock.LATIN_EXTENDED_D, //
                                    java.lang.Character.UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS, //
                                    java.lang.Character.UnicodeBlock.LATIN_EXTENDED_C, //
                                    java.lang.Character.UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS, //
                                    java.lang.Character.UnicodeBlock.ARABIC_EXTENDED_A, //
                                    java.lang.Character.UnicodeBlock.PHONETIC_EXTENSIONS, //
                                    java.lang.Character.UnicodeBlock.SUPPLEMENTAL_ARROWS_A, //
                                    java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, //
                                    java.lang.Character.UnicodeBlock.SUPPLEMENTAL_ARROWS_B, //
                                    java.lang.Character.UnicodeBlock.KAYAH_LI, //
                                    java.lang.Character.UnicodeBlock.CONTROL_PICTURES, //
                                    java.lang.Character.UnicodeBlock.COMBINING_HALF_MARKS, //
                                    java.lang.Character.UnicodeBlock.HEBREW, //
                                    java.lang.Character.UnicodeBlock.MYANMAR_EXTENDED_A, //
                                    java.lang.Character.UnicodeBlock.THAI, //
                                    java.lang.Character.UnicodeBlock.VARIATION_SELECTORS, //
                                    java.lang.Character.UnicodeBlock.GLAGOLITIC, //
                                    java.lang.Character.UnicodeBlock.AEGEAN_NUMBERS, //
                                    java.lang.Character.UnicodeBlock.GREEK_EXTENDED, //
                                    java.lang.Character.UnicodeBlock.GEORGIAN, //
                                    java.lang.Character.UnicodeBlock.SUPPLEMENTAL_PUNCTUATION, //
                                    java.lang.Character.UnicodeBlock.ETHIOPIC_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.ANCIENT_GREEK_NUMBERS, //
                                    java.lang.Character.UnicodeBlock.MEROITIC_CURSIVE, //
                                    java.lang.Character.UnicodeBlock.VEDIC_EXTENSIONS, //
                                    java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY, //
                                    java.lang.Character.UnicodeBlock.AVESTAN, //
                                    java.lang.Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL, //
                                    java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS, //
                                    java.lang.Character.UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.ARABIC_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.SMALL_FORM_VARIANTS, //
                                    java.lang.Character.UnicodeBlock.LINEAR_B_IDEOGRAMS, //
                                    java.lang.Character.UnicodeBlock.TAGALOG, //
                                    java.lang.Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL, //
                                    java.lang.Character.UnicodeBlock.TAI_VIET, //
                                    java.lang.Character.UnicodeBlock.HANGUL_JAMO, //
                                    java.lang.Character.UnicodeBlock.BUHID, //
                                    java.lang.Character.UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.LINEAR_B_SYLLABARY, //
                                    java.lang.Character.UnicodeBlock.TAI_XUAN_JING_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.MONGOLIAN, //
                                    java.lang.Character.UnicodeBlock.KANNADA, //
                                    java.lang.Character.UnicodeBlock.SAMARITAN, //
                                    java.lang.Character.UnicodeBlock.OGHAM, //
                                    java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.BOX_DRAWING, //
                                    java.lang.Character.UnicodeBlock.ETHIOPIC_EXTENDED_A, //
                                    java.lang.Character.UnicodeBlock.BUGINESE, //
                                    java.lang.Character.UnicodeBlock.COUNTING_ROD_NUMERALS, //
                                    java.lang.Character.UnicodeBlock.BRAHMI, //
                                    java.lang.Character.UnicodeBlock.MYANMAR, //
                                    java.lang.Character.UnicodeBlock.RUMI_NUMERAL_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS, //
                                    java.lang.Character.UnicodeBlock.ARABIC_PRESENTATION_FORMS_A, //
                                    java.lang.Character.UnicodeBlock.BATAK, //
                                    java.lang.Character.UnicodeBlock.HIGH_SURROGATES, //
                                    java.lang.Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS, //
                                    java.lang.Character.UnicodeBlock.ANCIENT_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.YI_RADICALS, //
                                    java.lang.Character.UnicodeBlock.ETHIOPIC_EXTENDED, //
                                    java.lang.Character.UnicodeBlock.CUNEIFORM, //
                                    java.lang.Character.UnicodeBlock.LETTERLIKE_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.EMOTICONS, //
                                    java.lang.Character.UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION, //
                                    java.lang.Character.UnicodeBlock.ARABIC, //
                                    java.lang.Character.UnicodeBlock.ARABIC_PRESENTATION_FORMS_B, //
                                    java.lang.Character.UnicodeBlock.NEW_TAI_LUE, //
                                    java.lang.Character.UnicodeBlock.THAANA, //
                                    java.lang.Character.UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED, //
                                    java.lang.Character.UnicodeBlock.SYRIAC, //
                                    java.lang.Character.UnicodeBlock.CUNEIFORM_NUMBERS_AND_PUNCTUATION, //
                                    java.lang.Character.UnicodeBlock.SURROGATES_AREA, //
                                    java.lang.Character.UnicodeBlock.YI_SYLLABLES, //
                                    java.lang.Character.UnicodeBlock.OSMANYA, //
                                    java.lang.Character.UnicodeBlock.CHEROKEE, //
                                    java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS, //
                                    java.lang.Character.UnicodeBlock.SUNDANESE_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.SPECIALS, //
                                    java.lang.Character.UnicodeBlock.SINHALA, //
                                    java.lang.Character.UnicodeBlock.BENGALI, //
                                    java.lang.Character.UnicodeBlock.LOW_SURROGATES, //
                                    java.lang.Character.UnicodeBlock.VERTICAL_FORMS, //
                                    java.lang.Character.UnicodeBlock.CYRILLIC, //
                                    java.lang.Character.UnicodeBlock.CHAKMA, //
                                    java.lang.Character.UnicodeBlock.CHAM, //
                                    java.lang.Character.UnicodeBlock.ARMENIAN, //
                                    java.lang.Character.UnicodeBlock.GURMUKHI, //
                                    java.lang.Character.UnicodeBlock.SPACING_MODIFIER_LETTERS, //
                                    java.lang.Character.UnicodeBlock.KANGXI_RADICALS, //
                                    java.lang.Character.UnicodeBlock.LAO, //
                                    java.lang.Character.UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.KHMER, //
                                    java.lang.Character.UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS, //
                                    java.lang.Character.UnicodeBlock.MUSICAL_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.UGARITIC, //
                                    java.lang.Character.UnicodeBlock.PHOENICIAN, //
                                    java.lang.Character.UnicodeBlock.LATIN_1_SUPPLEMENT, //
                                    java.lang.Character.UnicodeBlock.PHAISTOS_DISC, //
                                    java.lang.Character.UnicodeBlock.ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS, //
                                    java.lang.Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO, //
                                    java.lang.Character.UnicodeBlock.ANCIENT_GREEK_MUSICAL_NOTATION, //
                                    java.lang.Character.UnicodeBlock.TELUGU, //
                                    java.lang.Character.UnicodeBlock.JAVANESE);
        }

        @Parameter(0)
        public java.lang.Character.UnicodeBlock sut;

        @Override
        public java.lang.Character.UnicodeBlock createNewSUT() {
            return this.sut;
        }

    }

}
