package com.jacada.customerranking.model;

public final class RankingCalculatorFactory {
	public static RankingCalculator getInstance() {
		return new DefaultRankingCalculator();
	}
}
