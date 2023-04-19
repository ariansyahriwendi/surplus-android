package TestStep;

import BaseClass.BaseStep;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static BaseClass.BaseSetUp.driver;

public class OrderStep extends BaseStep {

    @Given("Account signed in")
    public void accountSignedIn() {
    }


    @When("Click on product")
    public void clickOnProduct() throws InterruptedException {
        Thread.sleep(10000);
        scrollTouch(2);
        Thread.sleep(10000);
        order.setProduct();
    }

    @And("Click on Tambah ke keranjang button")
    public void clickOnTambahKeKeranjangButton() {
        order.setSubmitButton();
    }

    @And("Click on Tambahkan button")
    public void clickOnTambahkanButton() {
        order.setSubmitButton();
    }


    @And("Click on keranjang icon")
    public void clickOnKeranjangIcon() {
        order.setFab();
    }

    @And("Select metode pengambilan ambil sendiri")
    public void selectMetodePengambilanSendiri() {
    }

    @And("Click on Pilih pembayaran button")
    public void clickOnPilihPembayaranButton() {
        order.setSubmitOderButton();
    }

    @And("Select metode pembayaran")
    public void selectMetodePembayaran() {
    }

    @And("Click on Bayar button")
    public void clickOnBayarButton() {
    }

    @Then("Order complete")
    public void orderComplete() {
    }




}

