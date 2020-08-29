package com.kissan.javadesign.creational.factory;

public class AlgorithmFactory {

    public IAlgorithm getAlgorithm(FactoryEnum type){

        switch (type) {
            case SHORTEST_PATH:
                return new ShortestPathAlgorithm();
            case SPANNING_TREE:
                return new SpanningTree();
            default:
                return null;
        }
    }
}
