import au.com.amaysim.shoppingcart.Item;
import au.com.amaysim.shoppingcart.ShoppingCart;
import au.com.amaysim.shoppingcart.pricingrules.PricingRule;
import au.com.amaysim.shoppingcart.pricingrules.impl.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkiromero on 12/12/2016.
 */
public class Main {
    public static void main(String args[]) {
        scenario1();
        scenario2();
        scenario3();
        scenario4();
    }

    public static void scenario1() {
        Item item01 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item02 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item03 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item04 = new Item("ult_large", "Unlimited 5GB", BigDecimal.valueOf(44.90));

        List<PricingRule> pricingRules = new ArrayList<>();
        pricingRules.add(new RegularPricingRule());
        pricingRules.add(new ThreeForTwoUnlimitedOneGB());
        pricingRules.add(new BulkUnlimitedFiveGB());
        pricingRules.add(new FreeOneGBDataPackForUnlimitedTwoGB());
        pricingRules.add(new ILoveAmaysim());

        ShoppingCart shoppingCart = new ShoppingCart(pricingRules);
        shoppingCart.add(item01);
        shoppingCart.add(item02);
        shoppingCart.add(item03);
        shoppingCart.add(item04);

        System.out.println(shoppingCart.items());
        System.out.println(shoppingCart.total());
    }

    public static void scenario2() {
        Item item01 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item02 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item03 = new Item("ult_large", "Unlimited 5GB", BigDecimal.valueOf(44.90));
        Item item04 = new Item("ult_large", "Unlimited 5GB", BigDecimal.valueOf(44.90));
        Item item05 = new Item("ult_large", "Unlimited 5GB", BigDecimal.valueOf(44.90));
        Item item06 = new Item("ult_large", "Unlimited 5GB", BigDecimal.valueOf(44.90));

        List<PricingRule> pricingRules = new ArrayList<>();
        pricingRules.add(new RegularPricingRule());
        pricingRules.add(new ThreeForTwoUnlimitedOneGB());
        pricingRules.add(new BulkUnlimitedFiveGB());
        pricingRules.add(new FreeOneGBDataPackForUnlimitedTwoGB());
        pricingRules.add(new ILoveAmaysim());

        ShoppingCart shoppingCart = new ShoppingCart(pricingRules);
        shoppingCart.add(item01);
        shoppingCart.add(item02);
        shoppingCart.add(item03);
        shoppingCart.add(item04);
        shoppingCart.add(item05);
        shoppingCart.add(item06);

        System.out.println(shoppingCart.items());
        System.out.println(shoppingCart.total());
    }

    public static void scenario3() {
        Item item01 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item02 = new Item("ult_medium", "Unlimited 2GB", BigDecimal.valueOf(29.90));
        Item item03 = new Item("ult_medium", "Unlimited 2GB", BigDecimal.valueOf(29.90));

        List<PricingRule> pricingRules = new ArrayList<>();
        pricingRules.add(new RegularPricingRule());
        pricingRules.add(new ThreeForTwoUnlimitedOneGB());
        pricingRules.add(new BulkUnlimitedFiveGB());
        pricingRules.add(new FreeOneGBDataPackForUnlimitedTwoGB());
        pricingRules.add(new ILoveAmaysim());

        ShoppingCart shoppingCart = new ShoppingCart(pricingRules);
        shoppingCart.add(item01);
        shoppingCart.add(item02);
        shoppingCart.add(item03);

        System.out.println(shoppingCart.items());
        System.out.println(shoppingCart.total());
    }

    public static void scenario4() {
        Item item01 = new Item("ult_small", "Unlimited 1GB", BigDecimal.valueOf(24.90));
        Item item02 = new Item("1gb", "1 GB Data-pack", BigDecimal.valueOf(9.90));

        List<PricingRule> pricingRules = new ArrayList<>();
        pricingRules.add(new RegularPricingRule());
        pricingRules.add(new ThreeForTwoUnlimitedOneGB());
        pricingRules.add(new BulkUnlimitedFiveGB());
        pricingRules.add(new FreeOneGBDataPackForUnlimitedTwoGB());
        pricingRules.add(new ILoveAmaysim());

        ShoppingCart shoppingCart = new ShoppingCart(pricingRules);
        shoppingCart.add(item01);
        shoppingCart.add(item02, "I<3AMAYSIM");

        System.out.println(shoppingCart.items());
        System.out.println(shoppingCart.total());
    }
}
