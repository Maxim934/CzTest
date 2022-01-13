//import com.codeborne.selenide.Configuration;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import com.codeborne.selenide.SelenideElement;
//import java.io.*;
//import java.nio.charset.Charset;
//import java.util.*;
//import java.util.stream.Collectors;
//
//import static com.codeborne.selenide.Selenide.open;
//
//public class AuthorizationPage {
//    @BeforeAll
//    static void config() {
//        Configuration.startMaximized = true;
//    }
//
////    @Test
////    void authorization() throws FileNotFoundException {
////        open("http://test-app.d6.dev.devcaz.com/admin/login");
////        $("#UserLogin_username").sendKeys("admin1");
////        $("#UserLogin_password").sendKeys("[9k<k8^z!+$$GkuP");
////        $("[type = submit]").click();
////
////
////        $("[data-target=\"#s-menu-users\"]").click();
////        $(byText("Players")).click();
////        $("[href=\"/user/player/admin?PlayerSearch_sort=login\"]").click();
////        $("[href=\"/user/player/export\"]").click();
////        $(byText("First name")).click();
////        $(byXpath("//label[contains(text(),'Last name')]")).click();
////        $(byXpath("//label[contains(text(),'E-mail')]")).click();
////        $(byXpath("//label[contains(text(),'Phone')]")).click();
////        $(byXpath("//label[contains(text(),'Hall')]")).click();
////        $(byXpath("//label[contains(text(),'Registration date')]")).click();
////        $(byXpath("//label[contains(text(),'Last visit')] ")).click();
////        $(byXpath("//label[contains(text(),'Registration IP')]")).click();
//
////        $("[value = Export]").click();
////    String file = "build/downloads/1641971054613_7684_20/bdb65422-9b87-44ac-be80-de2af61424ef.tmp";
////
////        List<String> records = new ArrayList<>();
////        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
////            String line;
////            while ((line = br.readLine()) != null) {
////                String[] values = line.split(",");
////                records.add(values[0]);
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        System.out.println(records);
////        List<String> clonedList = new ArrayList<>(records);
////
////        System.out.println(clonedList);
////      ArrayList<String> clonedList1 = (ArrayList<String>) clonedList.stream().sorted().collect(Collectors.toList());
////        System.out.println(records.equals(clonedList1));
//
//
////        ArrayList<String> list1 = new ArrayList<>();
////        ArrayList<String> list2 = new ArrayList<>();
////
////        list1.add("0");
////        list1.add("9");
////        list1.add("c");
////
////        list2.add("c");
////        list2.add("9");
////        list2.add("0");
////
////        ArrayList<String> list3 = (ArrayList<String>) list2.stream().sorted().collect(Collectors.toList());
////
////        System.out.println(list3);
////        System.out.println(list1.equals(list3));
//
//    }
//
//
//
//
//}
