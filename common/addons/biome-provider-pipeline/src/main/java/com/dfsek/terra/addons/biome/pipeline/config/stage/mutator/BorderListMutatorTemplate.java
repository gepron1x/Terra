/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addons.biome.pipeline.config.stage.mutator;

import com.dfsek.tectonic.annotations.Value;

import java.util.Map;

import com.dfsek.terra.addons.biome.pipeline.api.Stage;
import com.dfsek.terra.addons.biome.pipeline.config.stage.StageTemplate;
import com.dfsek.terra.addons.biome.pipeline.mutator.BorderListMutator;
import com.dfsek.terra.addons.biome.pipeline.stages.MutatorStage;
import com.dfsek.terra.api.config.meta.Meta;
import com.dfsek.terra.api.util.collection.ProbabilityCollection;
import com.dfsek.terra.api.world.biome.TerraBiome;


@SuppressWarnings("unused")
public class BorderListMutatorTemplate extends StageTemplate {
    @Value("from")
    private @Meta String from;
    
    @Value("default-replace")
    private @Meta String defaultReplace;
    
    @Value("default-to")
    private @Meta ProbabilityCollection<@Meta TerraBiome> defaultTo;
    
    @Value("replace")
    private @Meta Map<@Meta TerraBiome, @Meta ProbabilityCollection<@Meta TerraBiome>> replace;
    
    
    @Override
    public Stage get() {
        return new MutatorStage(new BorderListMutator(replace, from, defaultReplace, noise, defaultTo));
    }
}
