import java.util.Arrays;

public class HandHoldBag extends Bag{
    private boolean premiumQuality;
    public HandHoldBag(boolean premiumQuality){
        super(2, 2.0);
        this.premiumQuality=premiumQuality;
    }

    @Override
    public String toString() {
        return "HandHoldBag{" +
                "premiumQuality=" + premiumQuality +
                '}'+ super.toString();
    }

    public HandHoldBag(double maxWeight, boolean premiumQuality){
        super(2,maxWeight);
        this.premiumQuality=premiumQuality;
    }

    public boolean isPremiumQuality() {
        return premiumQuality;
    }
}
