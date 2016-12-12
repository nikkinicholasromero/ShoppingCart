package au.com.amaysim.shoppingcart.pricingrules.impl;

import au.com.amaysim.shoppingcart.Item;
import au.com.amaysim.shoppingcart.pricingrules.PricingRule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public class RegularPricingRule implements PricingRule {
    public BigDecimal getDiscountAmount(List<Item> items, List<String> promoCodes) {
        return BigDecimal.ZERO;
    }

    public BigDecimal getDiscountPercentage(List<Item> items, List<String> promoCodes) {
        return BigDecimal.ZERO;
    }

    public List<Item> getFreeItems(List<Item> items, List<String> promoCodes) {
        return new ArrayList<>();
    }
}
