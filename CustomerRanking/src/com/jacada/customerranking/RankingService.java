package com.jacada.customerranking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jacada.customerranking.entities.Ranking;
import com.jacada.customerranking.model.RankingCalculator;
import com.jacada.customerranking.model.RankingCalculatorFactory;

@Path("ranking")
public class RankingService {
	private RankingCalculator ranker;
	
	public RankingService() {
		ranker = RankingCalculatorFactory.getInstance();
	}
	
	@GET
	@Path("consumer/{spend}")
	@Produces(MediaType.APPLICATION_JSON)
	public Ranking getConsumerRanking(@PathParam("spend") int spend) {
		return ranker.getConsumerRanking(spend / 100);
	}
	
	@GET
	@Path("smb/{spend}")
	@Produces(MediaType.APPLICATION_JSON)
	public Ranking getSmbRanking(@PathParam("spend") int spend) {
		return ranker.getBusinessRanking(spend / 100);
	}
}
