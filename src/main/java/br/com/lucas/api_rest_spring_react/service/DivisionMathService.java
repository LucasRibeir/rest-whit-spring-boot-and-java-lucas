package br.com.lucas.api_rest_spring_react.service;

import br.com.lucas.api_rest_spring_react.exception.MathOperationsException;
import br.com.lucas.api_rest_spring_react.utils.MathCalculatorUtils;
import org.springframework.stereotype.Service;

@Service
public class DivisionMathService implements IDivisionMath{

    @Override
    public Double calculateDivision(String numberOne, String numberTwo) {
        if (!MathCalculatorUtils.isNumeric(numberOne) || !MathCalculatorUtils.isNumeric(numberTwo))
            throw new MathOperationsException("Please set a numeric value");

        return MathCalculatorUtils.convertoDouble(numberOne) / MathCalculatorUtils.convertoDouble(numberTwo);
    }
}