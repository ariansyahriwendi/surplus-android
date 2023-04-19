package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Order extends BaseSetUp {

    private final By product = new By.ByXPath("(//android.view.ViewGroup[@content-desc=\"BestsellerMenuListItem\"])[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView\n");
    public void setProduct() {
        click(product);
    }

    private final By submitButton = new By.ById("SubmitButton");
    public void setSubmitButton() {
        click(submitButton);
    }

    private final By fab = new By.ById("FAB");
    public void setFab() {
        click(fab);
    }

    private final By submitOrderButton = new By.ById("SubmitOrderButton");
    public void setSubmitOderButton() {
        click(submitOrderButton);
    }


}
