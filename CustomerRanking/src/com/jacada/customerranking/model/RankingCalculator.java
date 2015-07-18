package com.jacada.customerranking.model;

import com.jacada.customerranking.entities.Ranking;

public interface RankingCalculator {
	Ranking getConsumerRanking(double spend);
	Ranking getBusinessRanking(double spend);
}
