package br.pescaria.slownpescaria;

import br.pescaria.slownpescaria.commands.CommandPesca;
import br.pescaria.slownpescaria.event.InventoryListeners;
import br.pescaria.slownpescaria.utils.Reflections;
import br.pescaria.slownpescaria.utils.SkullAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlownPescaria extends JavaPlugin {

    @Override
    public void onEnable() {
        SkullAPI.load();
        Reflections.loadUtils();
        loadListeners();
        loadCommands();
    }

    @Override
    public void onDisable() {
    }
    private void loadListeners(){
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryListeners(), this);
    }
    private void loadCommands(){
        getCommand("pesca").setExecutor(new CommandPesca());
    }
}
