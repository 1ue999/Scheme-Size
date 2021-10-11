package mindustry.input;

import arc.*;
import arc.KeyBinds.*;
import arc.input.InputDevice.*;
import arc.input.*;

// may be I will just add alt button & desc to them
public enum ModBinding implements KeyBind{
    history(KeyCode.f9, "mod"),
    toggle_core_items(KeyCode.f7),
    change_unit(KeyCode.f2),
    change_effect(KeyCode.f3),
    change_item(KeyCode.f4),
    switch_team_btw(KeyCode.semicolon),
    switch_team(KeyCode.apostrophe),
    place_core(KeyCode.l),
    look_at(KeyCode.altLeft),
    alternative(KeyCode.altLeft);

    private final KeybindValue defaultValue;
    private final String category;

    ModBinding(KeybindValue defaultValue, String category){
        this.defaultValue = defaultValue;
        this.category = category;
    }

    ModBinding(KeybindValue defaultValue){
        this(defaultValue, null);
    }

    @Override
    public KeybindValue defaultValue(DeviceType type){
        return defaultValue;
    }

    @Override
    public String category(){
        return category;
    }
}