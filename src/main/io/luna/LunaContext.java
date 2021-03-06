package io.luna;

import io.luna.game.GameService;
import io.luna.game.model.World;
import io.luna.game.plugin.PluginManager;

/**
 * The context that {@link Luna} is being managed in.
 * 
 * @author lare96 <http://github.org/lare96>
 */
public final class LunaContext {

    /**
     * The {@link GameService} that manages game logic processing.
     */
    private final GameService service = new GameService();

    /**
     * The {@link World} that manages various entities.
     */
    private final World world = new World();

    /**
     * The {@link PluginManager} that manages Scala plugins.
     */
    private final PluginManager plugins = new PluginManager();

    /**
     * A package-private constructor to discourage external instantiation
     * outside of the {@code io.luna} package.
     */
    LunaContext() {}

    /**
     * @return The {@link GameService} in this context.
     */
    public GameService getService() {
        return service;
    }

    /**
     * @return The {@link World} in this context.
     */
    public World getWorld() {
        return world;
    }

    /**
     * @return The {@link PluginManager} in this context.
     */
    public PluginManager getPlugins() {
        return plugins;
    }
}
