package br.com.book.store.strategy;

import java.math.BigDecimal;

public class CalculoISS implements CalculoImpostoStrategy {

    @Override
    public BigDecimal calcula(BigDecimal price) {
        return price.multiply(new BigDecimal("0.9"));

    }
}
