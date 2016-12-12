package au.com.amaysim.shoppingcart.pricingrules;

import au.com.amaysim.shoppingcart.Item;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public interface PricingRule {
    BigDecimal getDiscountAmount(List<Item> items, List<String> promoCodes);
    BigDecimal getDiscountPercentage(List<Item> items, List<String> promoCodes);
    List<Item> getFreeItems(List<Item> items, List<String> promoCodes);
}
