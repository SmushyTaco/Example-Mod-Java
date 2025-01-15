package com.mod_author.mod_id;
import net.fabricmc.api.ModInitializer;
@SuppressWarnings("unused")
public class ModName implements ModInitializer {
    private static final String MOD_ID = "mod_id";
    @Override
    public void onInitialize() {
        System.out.println("Example mod has been initialized.");
    }
}