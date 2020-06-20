import ge.beka.naveriani.DavalebaApplication;
import ge.beka.naveriani.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DavalebaApplication.class)
public class CalculatorServiceTest {

    CalculatorService calculatorService;

    @Test
    void logTest() {
        calculatorService.multiplication(11, 12);
    }


    @Autowired
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
}
