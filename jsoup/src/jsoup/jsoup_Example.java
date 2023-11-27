package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class jsoupornek {


    public static void main(String[] args) {

        Document doc;
        try {

            // need http protocol
            doc = Jsoup.connect("https://www.sinemalar.com/en-iyi-filmler").get();

            // get page title
            String title = doc.title();
            System.out.println("title : " + title);

            // get all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {

                // get the value from href attribute
                System.out.println("\nlink : " + link.attr("href"));


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


