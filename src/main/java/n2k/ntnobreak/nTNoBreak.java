package n2k.ntnobreak;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
public final class nTNoBreak extends JavaPlugin {
    @Override public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler void onBreak(@NotNull BlockBreakEvent EVENT) {
                if(!EVENT.getPlayer().hasPermission("ntnobreak.break")) EVENT.setCancelled(true);
            }
        }, this);
    }
}
