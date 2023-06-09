import java.util.Locale;
import java.util.StringTokenizer;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        // blank string returns true
        if (myString.isBlank()) return true;
        // anything but letters returns false
        if (!myString.matches("[a-zA-Z]+")) return false;
        // set up to test remaining cases
        // records if first char is capital
        boolean firstCharCap = Character.isUpperCase(myString.charAt(0));
        // tracks if there are only upper or lower chars
        boolean allLower = true;
        boolean allUpper = true;
        for (char c: myString.substring(1).toCharArray()) {
            if (Character.isUpperCase(c)) allLower = false;
            if (Character.isLowerCase(c)) allUpper = false;
            if (!allUpper && !allLower) return false;
        }
        // if the first char is capital and the remainder are homogeneous, return true
        if (firstCharCap) return true;
        // if the first char is not capital and the remainder are lower, return true
        return allLower;

    }

}

