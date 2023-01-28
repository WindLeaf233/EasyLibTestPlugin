package ml.windleaf.test;

import ml.windleaf.easylib.plugin.EasyLibPlugin;
import ml.windleaf.easylib.plugin.MOTD;
import ml.windleaf.easylib.plugin.PluginInfo;

@PluginInfo(packagePath = "ml.windleaf.test", version = "1.0", repository = "WindLeaf233/EasyLibTestPlugin")
@MOTD({
        "#RED#测试插件",
        "#AQUA#This plugin is made with EasyLib"
})
public final class Test extends EasyLibPlugin {
    @Override
    protected void onPluginLoad() {}

    @Override
    protected void onPluginUnload() {}
}
