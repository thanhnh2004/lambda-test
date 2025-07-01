package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class LambdaTestDemoTest {
//    String username = "thanhnhse181731";
//    String accesskey = "LT_WpsUPPD5iiBMdaUDLgZlnwHNjJ6wIXsQgKZ7z883A8Qed7K";
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @BeforeClass
//    public void setUp() throws MalformedURLException {
////        ChromeOptions options = new ChromeOptions();
////        options.setPlatformName("Windows 10");
////        options.setBrowserVersion("latest");
////
////        HashMap<String, Object> ltOptions = new HashMap<>();
////        ltOptions.put("username", username);
////        ltOptions.put("accessKey", accesskey);
////        ltOptions.put("project", "YouTube Automation");
////        ltOptions.put("build", "Build 001");
////        ltOptions.put("name", "Search & Play Video Test");
////
////        options.setCapability("LT:Options", ltOptions);
////
////        String hubURL = "https://" + username + ":" + accesskey + "@hub.lambdatest.com/wd/hub";
////        driver = new RemoteWebDriver(new URL(hubURL), options);
////        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        ChromeOptions browserOptions = new ChromeOptions();
//        browserOptions.setPlatformName("Windows 10");
//        browserOptions.setBrowserVersion("latest");
//        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
//        ltOptions.put("username", "thanhnhse181731");
//        ltOptions.put("accessKey", "LT_WpsUPPD5iiBMdaUDLgZlnwHNjJ6wIXsQgKZ7z883A8Qed7K");
//        ltOptions.put("geoLocation", "VN");
//        ltOptions.put("visual", true);
//        ltOptions.put("timezone", "Ho_Chi_Minh");
//        ltOptions.put("build", "Lambda Test");
//        ltOptions.put("project", "YouTube Automation");
//        ltOptions.put("name", "Test Youtube");
//        //ltOptions.put("tunnel", true);
//        ltOptions.put("networkThrottling", "DSL");
//        ltOptions.put("w3c", true);
//        ltOptions.put("plugin", "java-testNG");
//        browserOptions.setCapability("LT:Options", ltOptions);
//        String hubURL = "https://" + username + ":" + accesskey + "@hub.lambdatest.com/wd/hub";
//        driver = new RemoteWebDriver(new URL(hubURL), browserOptions);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//    }
//
//    @Test
//    public void testSearchPlayToggleFullScreenAndReturnHomePage() throws InterruptedException {
//        //1. Mở trang chủ Youtube
//        driver.get("https://www.youtube.com");
//
//        //2.Tìm ô tìm kiếm cà nhập từ khóa "LambdaTest tutorial", sau đó nhấn enter
//        WebElement searchBox ;
//        try{
//            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
//        } catch (Exception e){
//            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#search")));
//        }
//        searchBox.click();
//        searchBox.sendKeys("LambdaTest tutorial");
//        searchBox.sendKeys(Keys.RETURN);
//
//        //3. Dợi kết quả tìm kiếm xuất hiện và click vào video đầu tiên
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("video-title")));
//        List<WebElement> videoResult = driver.findElements(By.id("video-title"));
//        Assert.assertFalse(videoResult.isEmpty(), "Không tìm thấy kết quả video!");
//        videoResult.get(0).click();
//        System.out.println("Video đã bắt đầu phát!");
//
//        //4. Chuyển sang chế độ toàn màn hình
//        WebElement fullScreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ytp-fullscreen-button")));
//        fullScreenButton.click();
//        System.out.println("Đã chuyển sang chế độ toàn màn hình!");
//        Thread.sleep(3000); //Chờ 3 giây ở chế độ toàn màn hình
//
//        //5.Thoát khỏi chế độ toàn màn hình bằng phím ESC
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
//        System.out.println("Đã thoát chế độ toàn màn hình!");
//        Thread.sleep(2000);
//
//        //6.Quay lại trang chủ Youtube
//        driver.get("http://www.youtube.com");
//        System.out.println("Đã quay lại trang chủ Youtube!");
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//        System.out.println("Session ID: " + ((RemoteWebDriver) driver).getSessionId());
//    }
        // ✅ Thông tin LambdaTest (có thể để ở file config riêng nếu muốn)
    String username = "thanhnhse181731";
    String accesskey = "LT_WpsUPPD5iiBMdaUDLgZlnwHNjJ6wIXsQgKZ7z883A8Qed7K";

        WebDriver driver;
        WebDriverWait wait;

        @BeforeClass
        public void setUp() throws MalformedURLException {
            // ✅ 1. Tạo ChromeOptions và cấu hình cơ bản
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 10");
            browserOptions.setBrowserVersion("latest");

            // ✅ 2. Cấu hình LT:Options
            HashMap<String, Object> ltOptions = new HashMap<>();
            ltOptions.put("username", username);
            ltOptions.put("accessKey", accesskey);
            ltOptions.put("build", "LambdaTest");
            ltOptions.put("project", "LambdaTest");
            ltOptions.put("name", "Test: Search & Play W3S Video");
            ltOptions.put("w3c", true);
            ltOptions.put("plugin", "java-testNG");
            ltOptions.put("timezone", "Ho_Chi_Minh");
            ltOptions.put("geoLocation", "VN");
            ltOptions.put("networkThrottling", "DSL");
            ltOptions.put("visual", true);

            // ❌ Không bật tunnel nếu không test localhost:
            // ltOptions.put("tunnel", true);

            browserOptions.setCapability("LT:Options", ltOptions);

            // ✅ 3. Khởi tạo RemoteWebDriver
            String hubURL = "https://" + username + ":" + accesskey + "@hub.lambdatest.com/wd/hub";
            driver = new RemoteWebDriver(new URL(hubURL), browserOptions);
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        }

//    @Test
//    public void testSearchPlayToggleFullScreenAndReturnHomePage() throws InterruptedException {
//        driver.get("https://www.youtube.com");
//
//        WebElement searchBox;
//        try {
//            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
//        } catch (Exception e) {
//            searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#search")));
//        }
//        searchBox.sendKeys("LambdaTest tutorial");
//        searchBox.sendKeys(Keys.RETURN);
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));
//        List<WebElement> videoResult = driver.findElements(By.id("video-title"));
//        Assert.assertFalse(videoResult.isEmpty(), "Không tìm thấy kết quả video!");
//        videoResult.get(0).click();
//        System.out.println("Video đã bắt đầu phát!");
//
//        // 🧪 Skip quảng cáo nếu có
//        try {
//            WebElement skipAd = wait.until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button")));
//            skipAd.click();
//            System.out.println("🎯 Quảng cáo đã được bỏ qua");
//        } catch (Exception ignored) {
//            System.out.println("✅ Không có quảng cáo để bỏ qua");
//        }
//
//        // 🧪 Chờ player sẵn sàng
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("html5-video-player")));
//
//        // ✅ Click fullscreen bằng JS
//        WebElement fullScreenButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".ytp-fullscreen-button")));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fullScreenButton);
//        System.out.println("Đã chuyển sang chế độ toàn màn hình");
//        Thread.sleep(5000);
//
//        // ✅ Thoát fullscreen
//        new Actions(driver).sendKeys(Keys.ESCAPE).perform();
//        System.out.println("Đã thoát chế độ toàn màn hình");
//        Thread.sleep(2000);
//
//        driver.get("https://www.youtube.com");
//        System.out.println("Đã quay lại trang chủ");
//    }

//    @Test
//    public void testHTML5VideoPlayFullscreenAndPause() throws InterruptedException {
//        driver.get("https://www.w3schools.com/html/html5_video.asp");
//
//        // ✅ Đợi video xuất hiện
//        WebElement video = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video1")));
//        System.out.println("🎥 Đã tìm thấy video");
//
//        // ✅ Giả lập click để "đánh lừa" trình duyệt là có user gesture
//        video.click();
//        Thread.sleep(500); // Thêm thời gian nhỏ để ổn định
//        ((JavascriptExecutor) driver).executeScript("arguments[0].play()", video);
//        System.out.println("▶ Video đang phát");
//
//        // ❗ Yêu cầu toàn màn hình (có thể bị từ chối nếu không phải test local)
//        try {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].requestFullscreen()", video);
//            System.out.println("🔎 Đã chuyển sang toàn màn hình");
//        } catch (Exception e) {
//            System.out.println("⚠ Không thể fullscreen (do trình duyệt chặn): " + e.getMessage());
//        }
//
//        Thread.sleep(5000); // Chờ video phát trong 5 giây
//
//        // ✅ Thoát fullscreen (ESC)
//        new Actions(driver).sendKeys(Keys.ESCAPE).perform();
//        System.out.println("❎ Đã thoát chế độ toàn màn hình");
//
//        Thread.sleep(2000); // Chờ sau khi thoát fullscreen
//
//        // ✅ Dừng video
//        ((JavascriptExecutor) driver).executeScript("arguments[0].pause()", video);
//        System.out.println("⏸ Video đã dừng");
//
//        // ✅ Kiểm tra trạng thái video
//        Boolean isPaused = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].paused;", video);
//        Assert.assertTrue(isPaused, "❌ Video chưa dừng!");
//        System.out.println("✅ Kiểm tra: video đã dừng thành công");
//    }

    @Test
    public void testHTML5VideoPlayFullscreenAndPause() throws InterruptedException {
        // Mở trang W3Schools có video HTML5
        driver.get("https://www.w3schools.com/html/html5_video.asp");

        // Đợi video xuất hiện
        WebElement video = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video1")));
        System.out.println("🎥 Đã tìm thấy video");

        // Giả lập hành vi người dùng: click video để "đánh lừa" trình duyệt
        video.click();

        // Phát video
        ((JavascriptExecutor) driver).executeScript("arguments[0].play()", video);
        System.out.println("▶ Video đang phát");

        // Phóng to toàn màn hình (fullscreen)
        ((JavascriptExecutor) driver).executeScript("arguments[0].requestFullscreen()", video);
        System.out.println("🔎 Đã chuyển sang toàn màn hình");

        // Chờ 5 giây trong chế độ fullscreen
        Thread.sleep(5000);

        // Thoát chế độ fullscreen
        ((JavascriptExecutor) driver).executeScript("document.exitFullscreen()");
        System.out.println("❎ Đã thoát chế độ toàn màn hình");

        Thread.sleep(2000); // Chờ 2 giây sau khi thoát fullscreen

        // Dừng video
        ((JavascriptExecutor) driver).executeScript("arguments[0].pause()", video);
        System.out.println("⏸ Video đã dừng");

        // Kiểm tra video đã dừng chưa
        Boolean isPaused = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].paused;", video);
        Assert.assertTrue(isPaused, "❌ Video chưa dừng!");
        System.out.println("✅ Kiểm tra: video đã dừng thành công");
    }

    @AfterClass
        public void tearDown() {
            System.out.println("✅ Session ID (xem trên LambdaTest Dashboard): " + ((RemoteWebDriver) driver).getSessionId());
            if (driver != null) {
                driver.quit();
            }
        }
    }
