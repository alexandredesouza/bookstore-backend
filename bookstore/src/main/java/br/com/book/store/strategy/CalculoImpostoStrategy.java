package br.com.book.store.strategy;

import java.math.BigDecimal;

public interface CalculoImpostoStrategy {

    public BigDecimal calcula(BigDecimal price);
}
