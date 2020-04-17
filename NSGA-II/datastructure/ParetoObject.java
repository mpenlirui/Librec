/*
 * This repository / codebase is Open Source and free for use and rewrite.
 */
package io.onclave.nsga.ii.datastructure;

/*ParetoObject类用于定义单个帕累托对象，其中每个对象都有一条染色体，以及相应的分配拥挤距离。
 * 这是一个国际奥委会的染色体组的延伸，每个染色体都被储存在它的相应的拥挤距离上。
 * 属性的拥挤距离是一个标记变量，它记录了在人群比较排序过程中是否已经考虑了ParetoObject。*/

/**
 * The ParetoObject class is used to define a single pareto object where each object has a chromosome,
 * along with the corresponding assigned crowding distance.
 * this is an IoC extension of the Chromosome class where each chromosomes are stored along with its
 * corresponding crowding distance assigned to it.
 * 
 * property crowdingDistanceSorted is a marker variable that keeps record whether the ParetoObject has
 * already been considered during crowd comparison sorting.
 * 
 * @author  Debabrata Acharya <debabrata.acharya@icloud.com>
 * @version 1.0
 * @since   0.1
 */
public class ParetoObject {
    
    private Chromosome chromosome = null;
    private double crowdingDistance = -1f;
    private boolean crowdingDistanceSorted = false;
    
    public ParetoObject(Chromosome chromosome) {
        this(chromosome, -1f);
    }
    
    public ParetoObject(Chromosome chromosome, float crowdingDistance) {
        this.chromosome = chromosome;
        this.crowdingDistance = crowdingDistance;
    }

    public Chromosome getChromosome() {
        return chromosome;
    }

    public void setChromosome(Chromosome chromosome) {
        this.chromosome = chromosome;
    }

    public double getCrowdingDistance() {
        return crowdingDistance;
    }

    public void setCrowdingDistance(double crowdingDistance) {
        this.crowdingDistance = crowdingDistance;
    }

    public boolean isCrowdingDistanceSorted() {
        return crowdingDistanceSorted;
    }

    public void setCrowdingDistanceSorted(boolean crowdingDistanceSorted) {
        this.crowdingDistanceSorted = crowdingDistanceSorted;
    }
}
