
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.CatalystItem;
import net.mcreator.test.item.BatterieItem;
import net.mcreator.test.item.AdminItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> ADMIN = REGISTRY.register("admin", () -> new AdminItem());
	public static final RegistryObject<Item> CATALYST = REGISTRY.register("catalyst", () -> new CatalystItem());
	public static final RegistryObject<Item> BATTERIE = REGISTRY.register("batterie", () -> new BatterieItem());
}
