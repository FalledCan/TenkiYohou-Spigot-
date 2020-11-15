package whitesiro.tenkiyohou;

import org.bukkit.plugin.java.JavaPlugin;

public final class TenkiYohou extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("on");
        getCommand("tenki").setExecutor(new TenkiCmd());
        getCommand("tenki").setTabCompleter(new TabTodohuken());

    }

    @Override
    public void onDisable() {
        getLogger().info("off");
    }
}
