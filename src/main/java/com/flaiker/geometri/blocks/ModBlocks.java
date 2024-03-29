/******************************************************************************
 * Copyright (c) 2015 Fabian Lupa                                             *
 * This software is licensed under the MIT License (MIT).                     *
 ******************************************************************************/

package com.flaiker.geometri.blocks;

import net.minecraft.block.Block;

/**
 * Created by Flaiker on 15.10.2014.
 */
public final class ModBlocks {
    public static Block testBlock;
    public static Block testEntityBlock;
    public static Block mathEntityBlock;

    public static void init() {
        testBlock = new TestBlock();
        testEntityBlock = new TestEntityBlock();
        mathEntityBlock = new MathEntityBlock();
    }
}