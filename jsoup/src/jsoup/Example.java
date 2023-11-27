package jsoup;

import org.jsoup.Jsoup;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class odev {

    public void getFormParams(String html){

        Document doc = Jsoup.parse(html);

        //HTML form id
        Element loginform = doc.getElementById("your_form_id");

        Elements inputElements = loginform.getElementsByTag("input");

        List<String> paramList = new ArrayList<String>();
        for (Element inputElement : inputElements) {
            String key = inputElement.attr("name");
            String value = inputElement.attr("value");
        }

    }

}
