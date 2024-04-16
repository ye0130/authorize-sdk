---
sidebar_position: 1
---

## Authorize SDK

#### 定价

- 每创建一个插件30元,不限用户数,无额外费用,不限时长
- 有定制插件但不会接入的具体费用联系站长咨询

#### 联系方式

- QQ：15568820 ，微信：yeeeeeezhi


#### 管理网站

https://admin.goodmc.cn

#### 创建插件

目前有两种方式创建插件

- 联系站长以最新定价标准创建插件
- 联系站长申请创建临时插件用于开发测试

#### 插件ID

调用授权接口时需要用到插件ID，插件创建成功后可在插件列表查看
![](img/插件ID.png)


#### 引用 Maven 依赖

```xml

<repository>
    <id>yezhitao-Home-public</id>
    <name>publiic</name>
    <url>https://yezhitao-maven.pkg.coding.net/repository/Home/public/</url>
</repository>
```

```xml
<dependency>
    <groupId>me.yeezhi</groupId>
    <artifactId>authorize-sdk</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>
```

#### API

```java
/**
 * 注册插件授权
 *
 * @param plugin   插件实例
 * @param pluginId 插件Id
 * @param code     授权码
 */
public void register(Plugin plugin, String pluginId, String code)

/**
 * 注册插件授权
 *
 * @param plugin   插件实例
 * @param pluginId 插件Id
 * @param code     授权码
 * @param runnable 授权成功执行的代码
 */
public final void register(Plugin plugin, String pluginId, String code, Runnable runnable) 
```


#### 授权示例1


```java
import me.qingshou.lib.SimpleLib;
import me.qingshou.lib.anntation.Outsource;
import org.bukkit.plugin.java.JavaPlugin;

public final class AuthorizeDemo extends JavaPlugin {
    
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();

        SimpleLib.getAuthorizeManage().register(this, "25ae4dbe98b19fd6ae", getConfig().getString("config.code"), () -> {
            // Runnable 内写插件授权成功后执行的代码
            getLogger().info("插件正在初始化");
        });
    }

    @Outsource
    public void onDisable() {

    }
}
```


#### 授权示例2

```java
import me.qingshou.lib.SimpleLib;
import me.qingshou.lib.anntation.Outsource;
import org.bukkit.plugin.java.JavaPlugin;

public final class AuthorizeDemo extends JavaPlugin {
    
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();

        SimpleLib.getAuthorizeManage().register(this, "25ae4dbe98b19fd6ae", getConfig().getString("config.code"));
    }

    @Outsource
    public void onDisable() {

    }
}
```

- 完整代码
- https://github.com/ye0130/AuthorizeDemo

