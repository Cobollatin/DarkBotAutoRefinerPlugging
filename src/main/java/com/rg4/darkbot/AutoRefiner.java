package com.rg4.darkbot;

import eu.darkbot.api.config.ConfigSetting;
import eu.darkbot.api.extensions.Configurable;
import eu.darkbot.api.extensions.Feature;
import eu.darkbot.api.extensions.Module;
import eu.darkbot.api.managers.AuthAPI;
import eu.darkbot.api.managers.MovementAPI;

@Feature(name = "Auto Refiner Module", description = "Auto refines materials", enabledByDefault = true)
public class AutoRefiner implements
        Module,
        Configurable<AutoRefinerConfig> {

    public AutoRefiner(MovementAPI movement, AuthAPI auth) {
    }

    @Override
    public boolean canRefresh() {
        return true;
    }

    @Override
    public String getStatus() {
        return "Auto Refiner Module is " + (config.Active ? "active" : "inactive");
    }

    @Override
    public void onTickModule() {
        if (!config.Active) return;
    }

    private AutoRefinerConfig config;

    @Override
    public void setConfig(ConfigSetting<AutoRefinerConfig> config) {
        this.config = config.getValue();
    }
}
