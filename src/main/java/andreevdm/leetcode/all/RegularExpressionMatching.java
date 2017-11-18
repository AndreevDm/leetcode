package andreevdm.leetcode.all;

/**
 * @author Dmitry Andreev <a href="mailto:AndreevDm@yandex-team.ru"></a>
 * @date 18/11/2017
 */
public class RegularExpressionMatching {

    private static final char ANY_CHAR = '.';
    private static final char ONE_OR_MORE = '*';

    public static boolean isMatch(String string, String pattern) {
        return isMatch(string, 0, pattern, 0);
    }

    public static boolean isMatch(String string, int stringIndex, String pattern, int patternIndex) {
        if (patternIndex >= pattern.length()) {
            return stringIndex >= string.length();
        }
        char patternChar = pattern.charAt(patternIndex);
        boolean multi = patternIndex + 1 < pattern.length() && pattern.charAt(patternIndex + 1) == ONE_OR_MORE;
        boolean charMatch = isCharMatch(string, stringIndex, patternChar);
        if (multi) {
            return isMatch(string, stringIndex, pattern, patternIndex + 2) ||
                (charMatch && isMatch(string, stringIndex + 1, pattern, patternIndex));

        } else {
            return charMatch && isMatch(string, stringIndex + 1, pattern, patternIndex + 1);

        }
    }

    private static boolean isCharMatch(String string, int stringIndex, char patternChar) {
        if (stringIndex >= string.length()) {
            return false;
        }
        return patternChar == ANY_CHAR || string.charAt(stringIndex) == patternChar;
    }


}
