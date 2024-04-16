package me.qingshou.lib.util;

import org.bukkit.plugin.Plugin;

/**
 * 插件授权管理
 */
public class AuthorizeManage {
    public AuthorizeManage() {
    }


    /**
     * 注册插件授权
     *
     * @param plugin   插件实例
     * @param pluginId 插件Id
     * @param code     授权码
     */
    public final void register(Plugin plugin, String pluginId, String code) {
    }
    /**
     * 注册插件授权
     *
     * @param plugin   插件实例
     * @param pluginId 插件Id
     * @param code     授权码
     * @param runnable 授权成功执行的代码
     */

    public final void register(Plugin plugin, String pluginId, String code, Runnable runnable) {
    }
}
