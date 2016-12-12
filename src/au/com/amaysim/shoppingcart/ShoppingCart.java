package au.com.amaysim.shoppingcart;

import au.com.amaysim.shoppingcart.pricingrules.PricingRule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public class ShoppingCart {
    private List<PricingRule> pricingRules;
    private List<Item> items;
    private List<String> promoCodes;

    public ShoppingCart(List<PricingRule> pricingRules) {
        this.pricingRules = pricingRules;
        this.items = new ArrayList<>();
        this.promoCodes = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void add(Item item, String promoCode) {
        items.add(item);
        promoCodes.add(promoCode);
    }

    public BigDecimal total() {
        BigDecimal discountAmount = BigDecimal.ZERO;
        for (PricingRule pricingRule : pricingRules) {
            discountAmount = discountAmount.add(pricingRule.getDiscountAmount(items, promoCodes));
        }

        BigDecimal discountPercentage = BigDecimal.ZERO;
        for (PricingRule pricingRule : pricingRules) {
            discountPercentage = discountPercentage.add(pricingRule.getDiscountPercentage(items, promoCodes));
        }

        BigDecimal priceAfterDiscountAmount = getTotalPrice().subtract(discountAmount);
        return (priceAfterDiscountAmount.subtract(priceAfterDiscountAmount.multiply(discountPercentage)));
    }

    public List<Item> items() {
        List<Item> expectedItems = new ArrayList<>();

        for (PricingRule pricingRule : pricingRules) {
            expectedItems.addAll(pricingRule.getFreeItems(items, promoCodes));
        }
        expectedItems.addAll(items);

        return expectedItems;
    }

    private BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(Item item : items) {
            totalPrice = totalPrice.add(item.getPrice());
        }

        return totalPrice;
    }
}
