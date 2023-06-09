import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @ParameterizedTest
    @ValueSource(strings = {"USA", "leetcode", "Google"})
    public void detectCapitalUseTest1(String str) {

        myString.setString(str);
        assertTrue(myString.detectCapitalUse());

    }

    @ParameterizedTest
    @ValueSource(strings = {"UsA", "lEEtcode", "GooGLE"})
    public void detectCapitalUseTest2(String str) {

        myString.setString(str);
        assertFalse(myString.detectCapitalUse());

    }
}