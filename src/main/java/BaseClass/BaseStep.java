package BaseClass;

import Object.*;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class BaseStep {

    public static Order order = new Order();

    public void scrollTouch(Integer times) {

        org.openqa.selenium.Dimension size = BaseSetUp.driver.manage().window().getSize();
        System.out.println(size);
        int width = size.width / 2;
        int startPoint = (int) (size.getHeight() * 0.9);
        System.out.println(startPoint);
        int endPoint = (int) (size.getHeight() * 0.2);
        System.out.println(endPoint);
        TouchAction touchAction = new TouchAction(BaseSetUp.driver);

        for (int i = 0; i < times; i++) {
            touchAction.press(PointOption.point(width, startPoint))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(width, endPoint))
                    .release()
                    .perform();
        }

    }

}
