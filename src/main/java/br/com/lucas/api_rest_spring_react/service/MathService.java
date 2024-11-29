package br.com.lucas.api_rest_spring_react.service;

import br.com.lucas.api_rest_spring_react.exception.MathOperationsException;
import br.com.lucas.api_rest_spring_react.service.IMathService;
import org.springframework.stereotype.Service;

@Service
public class MathService implements IMathService {

    @Override
    public Double calculateNumbers(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new MathOperationsException("Please set a numeric value");

        return convertoDouble(numberOne) + convertoDouble(numberTwo);
    }

    private Double convertoDouble(String numberString) {
        if (numberString == null)
            return 0D;

        String number = numberString.replaceAll(",", ".");

        if (isNumeric(number))
            return Double.parseDouble(number);

        return 0D;
    }

    private boolean isNumeric(String number) {
        if (number == null)
            return false;
        String numberString = number.replaceAll(",", ".");
        return numberString.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
