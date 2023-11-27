package jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class ornek {
    public static void main(String[] args) {

        Document doc;
        try {

            //get all images
            doc = Jsoup.connect("https://www.sinemalar.com/filmler/en-yeni-turk-filmleri").get();
            Elements content = doc.getElementsByClass("div.sinepedi-result-detail");



            Elements info = doc.select("article");
            Elements sec=info.select("a[href]");
            for (Element ooo : sec) {
                    System.out.println("link " + ooo.attr("href"));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
