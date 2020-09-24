package com.dfsek.terra.biome;

import org.bukkit.block.Biome;
import org.polydev.gaea.biome.Decorator;
import org.polydev.gaea.math.ProbabilityCollection;
import org.polydev.gaea.tree.Tree;
import org.polydev.gaea.world.Flora;

public class UserDefinedDecorator extends Decorator {

    private final ProbabilityCollection<Flora> flora;
    private final ProbabilityCollection<Tree> trees;
    private final int floraChance;
    private final int treeChance;
    private final int treeDensity;

    public UserDefinedDecorator(ProbabilityCollection<Flora> flora, ProbabilityCollection<Tree> trees, int floraChance, int treeChance, int treeDensity) {
        this.flora = flora;
        this.trees = trees;

        this.floraChance = floraChance;
        this.treeChance = treeChance;
        this.treeDensity = treeDensity;
    }

    @Override
    public ProbabilityCollection<Tree> getTrees() {
        return trees;
    }

    public int getTreeChance() {
        return treeChance;
    }

    @Override
    public int getTreeDensity() {
        return treeDensity;
    }

    @Override
    public boolean overrideStructureChance() {
        return false;
    }

    @Override
    public Biome getVanillaBiome() {
        return null;
    }

    @Override
    public ProbabilityCollection<Flora> getFlora() {
        return flora;
    }

    @Override
    public int getFloraChance() {
        return floraChance;
    }
}
