package br.pescaria.slownpescaria.commands;

import br.pescaria.slownpescaria.inventory.InventoryPesca;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandPesca implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if(command.getName().equalsIgnoreCase("pesca")) {
            if (args.length == 0) {
                new InventoryPesca().openPesca(p);
            }
        }
        if(command.getName().equalsIgnoreCase("pescaadmin")){
            if(sender.hasPermission("slownpesca.admin")){
                if(args.length == 0){
                    p.sendMessage("§a§lPESCA ADMIN");
                    p.sendMessage("");
                    p.sendMessage(" §f/pescaadmin §asetentrada §7Vai setar aonde o player vai entrar");
                    p.sendMessage(" §f/pescaadmin §csetsaida §7Vai setar aonde o player vai sair");
                    p.sendMessage(" §f/pescaadmin §asetpeixes §7jogador> <quantia> §7Vai setar peixes no jogador");
                    p.sendMessage("");
                }
            }
        }
        return false;
    }
}
