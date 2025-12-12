/*
 * This file is part of Applied Energistics 2. Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved. Applied
 * Energistics 2 is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version. Applied Energistics 2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details. You should have received a copy of the GNU Lesser General Public License along with
 * Applied Energistics 2. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.me.cluster.implementations;

import java.util.Iterator;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import appeng.api.networking.IGrid;
import appeng.api.networking.IGridHost;
import appeng.api.networking.IGridNode;
import appeng.api.networking.events.MENetworkCraftingCpuChange;
import appeng.api.util.WorldCoord;
import appeng.me.cluster.IAECluster;
import appeng.me.cluster.IAEMultiBlock;
import appeng.me.cluster.MBCalculator;
import appeng.tile.crafting.TileCraftingTile;

public class CraftingCPUCalculator extends MBCalculator<TileCraftingTile, CraftingCPUCluster> {
    
    @Override
    public void calculateMultiblock(World w, WorldCoord loc) {
        if (w == null || loc == null || w.isRemote) {
            return;
        }
        
        // 调用父类计算
        super.calculateMultiblock(w, loc);
    }
    
    @Override
    protected void updateTiles(CraftingCPUCluster c, Set<TileCraftingTile> tiles) {
        if (c == null || tiles == null) {
            return;
        }
        
        // 调用父类方法
        super.updateTiles(c, tiles);
    }
}
