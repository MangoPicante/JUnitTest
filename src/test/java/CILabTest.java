import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    @ValueSource(strings = {"USA", "leetcode", "Google", "PERSONAL", ""})
    public void detectCapitalUseTest1(String str) {

        myString.setString(str);
        Assertions.assertTrue(myString.detectCapitalUse(), str);

    }

    @ParameterizedTest
    @ValueSource(strings = {"UsA", "lEEtcode", "GooGLE", "PeRSONAL", "0"})
    public void detectCapitalUseTest2(String str) {

        myString.setString(str);
        Assertions.assertFalse(myString.detectCapitalUse(), str);

    }
}