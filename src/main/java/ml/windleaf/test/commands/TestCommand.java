package ml.windleaf.test.commands;

import ml.windleaf.easylib.interfaces.CommandInfo;
import ml.windleaf.easylib.interfaces.ICommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

@CommandInfo(value = {"test", "t"}, permission = "test.permission")
public class TestCommand implements ICommand {
    public void onCommand(CommandSender sender, Player player) {
        if (sender instanceof Player) {
            ((Player) sender).teleport(player);
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return new ArrayList<String>() {{ add("test"); }};
    }
}
