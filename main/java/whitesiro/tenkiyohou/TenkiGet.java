package whitesiro.tenkiyohou;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class TenkiGet {
    public void getTenki(String url, String loc, CommandSender sender) throws IOException {
        sender.sendMessage(ChatColor.GRAY + "--------------------");
        Document document = Jsoup.connect(url).get();
        sender.sendMessage(loc);
        sender.sendMessage(ChatColor.GRAY + "--------------------");
        Elements elements = document.select(".today-weather .left-style");
        sender.sendMessage(elements.text());
        elements = document.select(".today-weather .weather-icon .weather-telop");
        sender.sendMessage(ChatColor.YELLOW + "天気: " + ChatColor.WHITE + elements.text());
        elements = document.select(".today-weather .high-temp.temp, .today-weather .high-temp.tempdiff");
        sender.sendMessage(ChatColor.RED + "最高気温: " + elements.text());
        elements = document.select(".today-weather .low-temp.temp, .today-weather .low-temp.tempdiff");
        sender.sendMessage(ChatColor.AQUA + "最低気温: " + elements.text());
        sender.sendMessage(ChatColor.GRAY + "--------------------");
        elements = document.select(".tomorrow-weather .left-style");
        sender.sendMessage(elements.text());
        elements = document.select(".tomorrow-weather .weather-icon .weather-telop");
        sender.sendMessage(ChatColor.YELLOW + "天気: " + ChatColor.WHITE + elements.text());
        elements = document.select(".tomorrow-weather .high-temp.temp, .tomorrow-weather .high-temp.tempdiff");
        sender.sendMessage(ChatColor.RED + "最高気温: " + elements.text());
        elements = document.select(".tomorrow-weather .low-temp.temp, .tomorrow-weather .low-temp.tempdiff");
        sender.sendMessage(ChatColor.AQUA + "最低気温: " + elements.text());
        sender.sendMessage(ChatColor.GRAY + "--------------------");
    }
}
