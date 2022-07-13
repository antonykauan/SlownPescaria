package br.pescaria.slownpescaria.inventory;

import br.pescaria.slownpescaria.utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InventoryPesca {


    public void openPesca(Player p){
        Inventory pesca = Bukkit.createInventory(null, 3*9, "Pesca - Principal");
        pesca.setItem(13, new Item(Material.FISHING_ROD).setDisplayName("§aÁrea de pescaria").setLore(
                "§7É uma área inovadora do",
                "§7nosso servidor, pelo o motivo",
                "§7da sua função é suprir os",
                "§7limites dos jogadores",
                "",
                "§aClique para ir pescar"
        ).build());
        p.openInventory(pesca);
    }


}
