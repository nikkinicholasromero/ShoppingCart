package au.com.amaysim.shoppingcart.pricingrules.impl;

import au.com.amaysim.shoppingcart.Item;
import au.com.amaysim.shoppingcart.pricingrules.PricingRule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public class BulkUnlimitedFiveGB implements PricingRule {
    public BigDecimal getDiscountAmount(List<Item> items, List<String> promoCodes) {
        int fiveGbCount = 0;

        for (Item item : items) {
            if ("ult_large".equals(item.getCode())) {
                fiveGbCount++;
            }
        }

        if (fiveGbCount > 3) {
            return (BigDecimal.valueOf(44.90).multiply(BigDecimal.valueOf(fiveGbCount)).subtract(
                    BigDecimal.valueOf(39.90).multiply(BigDecimal.valueOf(fiveGbCount))));
        } else {
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal getDiscountPercentage(List<Item> items, List<String> promoCodes) {
        return BigDecimal.ZERO;
    }

    public List<Item> getFreeItems(List<Item> items, List<String> promoCodes) {
        return new ArrayList<>();
    }
}
