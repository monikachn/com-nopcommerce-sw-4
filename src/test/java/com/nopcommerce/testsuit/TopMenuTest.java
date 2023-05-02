package com.nopcommerce.testsuit;

import com.nopcommerce.pages.TopMenu;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
        TopMenu topMenu = new TopMenu();

        @Test
        public void verifyPageNavigation() {
            topMenu.selectMenu("Gift Cards");
            Assert.assertEquals(topMenu.getHeadingText(), "Gift Cards", "User is not navigated successfully");
        }
    }
