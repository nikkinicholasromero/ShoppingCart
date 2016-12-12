package au.com.amaysim.shoppingcart.pricingrules.impl;

import au.com.amaysim.shoppingcart.Item;
import au.com.amaysim.shoppingcart.pricingrules.PricingRule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public class FreeOneGBDataPackForUnlimitedTwoGB implements PricingRule {
    public BigDecimal getDiscountAmount(List<Item> items, List<String> promoCodes) {
        return BigDecimal.ZERO;
    }

    public BigDecimal getDiscountPercentage(List<Item> items, List<String> promoCodes) {
        return BigDecimal.ZERO;
    }

    public List<Item> getFreeItems(List<Item> items, List<String> promoCodes) {
        List<Item> freeItems = new ArrayList<>();

        for (Item item : items) {
            if ("ult_medium".equals(item.getCode())) {
                Item freeItem = new Item("1gb", "1 GB Data-pack", BigDecimal.valueOf(9.90));
                freeItems.add(freeItem);
            }
        }

        return freeItems;
    }
}
