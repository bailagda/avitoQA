package org.example;

import com.microsoft.playwright.*;
import org.junit.Test;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.*;

public class UnitTests {
    private Playwright playwright = Playwright.create();
    private Browser browser = playwright.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(true));
    private Page page = browser.newPage();
    private APIRequest request = playwright.request();
    private APIRequestContext requestContext = request.newContext() ;

    @Test
    public void test_1() {
        page.navigate("https://www.avito.ru/avito-care/eco-impact");
        Locator counter_locator = page.getByText("Ваш экологический вклад");
        counter_locator.scrollIntoViewIfNeeded();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./output/1.png")));
        assertThat(page.locator("//*[text() = 'CO₂']")).isVisible();
        assertThat(page.locator("//*[text() = 'воды']")).isVisible();
        assertThat(page.locator("//*[contains(text(), 'энергии')]")).isVisible();
        assertThat(page.locator("//*[text() = 'Авторизоваться']")).isVisible();
        page.close();
        browser.close();
    }

    @Test
    public void test_2() {
        page.route("https://www.avito.ru/avito-care/eco-impact/init", route -> {
            APIResponse response = route.fetch();
            route.fulfill(new Route.FulfillOptions().setResponse(response).setBody("[\n" +
                    "{\n" +
                    "  \"result\": {\n" +
                    "      \"blocks\": {\n" +
                    "          \"personalImpact\": {\n" +
                    "              \"data\": {\n" +
                    "                  \"co2\": 20,\n" +
                    "                  \"energy\": 20,\n" +
                    "                  \"materials\": 0,\n" +
                    "                  \"pineYears\": 0,\n" +
                    "                  \"water\": 20\n" +
                    "              }\n" +
                    "          }\n" +
                    "      },\n" +
                    "      \"isAuthorized\": true\n" +
                    "  },\n" +
                    "  \"status\": \"ok\"\n" +
                    "}\n" +
                    "]"));
        });

        page.navigate("https://www.avito.ru/avito-care/eco-impact");
        Locator counter_locator = page.getByText("Ваш экологический вклад");
        counter_locator.scrollIntoViewIfNeeded();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./output/2.png")));
        assertThat(page.locator("//*[text() = 'CO₂']/parent::div/div[1]")).containsText("20");
        page.close();
        browser.close();
    }

}
