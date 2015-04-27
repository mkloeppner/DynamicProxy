package com.mkloeppner;

import net.md_5.bungee.api.plugin.Plugin;

public class DynamicProxy extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new DynamicProxyListener());
    }

}