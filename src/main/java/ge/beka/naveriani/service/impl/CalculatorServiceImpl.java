package ge.beka.naveriani.service.impl;

import ge.beka.naveriani.models.Println;
import ge.beka.naveriani.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    @Println
    public int multiplication(int x, int y) {
        return x * y;
    }
}
