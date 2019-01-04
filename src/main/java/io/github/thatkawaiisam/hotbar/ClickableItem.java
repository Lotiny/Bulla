package io.github.thatkawaiisam.hotbar;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

@Data @AllArgsConstructor
public class ClickableItem {

    private ClickHandler clickHandler;
    private ItemStack itemStack;
    private int applySlot;
    private boolean droppable;
    private String id;

}
