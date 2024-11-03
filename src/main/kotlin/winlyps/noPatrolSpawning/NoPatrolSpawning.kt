package winlyps.noPatrolSpawning

import org.bukkit.plugin.java.JavaPlugin

class NoPatrolSpawning : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doPatrolSpawning", "false")
        }
        logger.info("NoPatrolSpawning plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doPatrolSpawning", "true")
            logger.info("NoPatrolSpawning plugin has been disabled.")
        }
    }
}