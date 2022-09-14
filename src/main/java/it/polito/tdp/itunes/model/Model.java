package it.polito.tdp.itunes.model;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.itunes.db.ItunesDAO;

public class Model {
	
	private ItunesDAO dao;
	private Graph<Album, DefaultWeightedEdge> grafo;
	
	public Model() {
		dao = new ItunesDAO();
	}

	public void creaGrafo(int m) {
		// CREO IL GRAFO
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		// AGGIUNGO I VERTICI
		Graphs.addAllVertices(this.grafo, this.dao.getVertici());
		
	}
	
}
