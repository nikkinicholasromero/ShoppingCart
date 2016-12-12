package au.com.amaysim.shoppingcart.pricingrules.impl;

import au.com.amaysim.shoppingcart.Item;
import au.com.amaysim.shoppingcart.pricingrules.PricingRule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public class ThreeForTwoUnlimitedOneGB implements PricingRule {
    public BigDecimal getDiscountAmount(List<Item> items, List<String> promoCodes) {
        int oneGbCount = 0;

        for (Item item : items) {
            if ("ult_small".equals(item.getCode())) {
                oneGbCount++;
            }
        }

        return BigDecimal.valueOf(24.90).multiply(BigDecimal.valueOf(oneGbCount / 3));
    }

    public BigDecimal getDiscountPercentage(List<Item> items, List<String> promoCodes) {
        return BigDecimal.ZERO;
    }

    public List<Item> getFreeItems(List<Item> items, List<String> promoCodes) {
        return new ArrayList<>();
    }
}
