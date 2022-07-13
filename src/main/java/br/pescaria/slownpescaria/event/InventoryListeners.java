package br.pescaria.slownpescaria.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListeners implements Listener {


    @EventHandler
    void onClickPesca(InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        if(e.getInventory().getTitle().equals("Pesca - Principal")){
            e.setCancelled(true);
        }
    }

}
