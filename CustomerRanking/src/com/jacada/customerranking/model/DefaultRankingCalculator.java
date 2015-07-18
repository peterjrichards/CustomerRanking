package com.jacada.customerranking.model;

import com.jacada.customerranking.entities.Ranking;

public class DefaultRankingCalculator implements RankingCalculator {

	private static final String LOW = "Low";
	private static final String MEDIUM = "Medium";
	private static final String HIGH = "High";
	private static final String SILVER = "Silver";
	private static final String GOLD = "Gold";
	private static final String PLATINUM = "Platinum";
	private static final String UNDETERMINED = "Undetermined";
	
	@Override
	public Ranking getConsumerRanking(double spend) {
		Ranking rank = new Ranking();
		if (spend > 0 && spend <= 500) {
			rank.setRanking(LOW);
		} else if (spend > 500 && spend <= 1000) {
			rank.setRanking(MEDIUM);
		} else if (spend > 1000 && spend <= 2000) {
			rank.setRanking(HIGH);
		} else if (spend > 2000 && spend <= 5000) {
			rank.setRanking(GOLD);
		} else if (spend > 5000) {
			rank.setRanking(PLATINUM);
		} else {
			rank.setRanking(UNDETERMINED);
		}
		return rank;
	}

	@Override
	public Ranking getBusinessRanking(double spend) {
		Ranking rank = new Ranking();
		if (spend > 0 && spend <= 500) {
			rank.setRanking(MEDIUM);
		} else if (spend > 500 && spend <= 1000) {
			rank.setRanking(HIGH);
		} else if (spend > 1000 && spend <= 2000) {
			rank.setRanking(SILVER);
		} else if (spend > 2000 && spend <= 5000) {
			rank.setRanking(GOLD);
		} else if (spend > 5000) {
			rank.setRanking(PLATINUM);
		} else {
			rank.setRanking(UNDETERMINED);
		}
		return rank;
	}

}
