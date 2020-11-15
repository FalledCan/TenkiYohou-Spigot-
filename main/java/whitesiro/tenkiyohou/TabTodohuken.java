package whitesiro.tenkiyohou;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TabTodohuken implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length == 1) {
            List<String> todouhuken = new ArrayList<String>();
            todouhuken.add("01北海道");
            todouhuken.add("02青森県");
            todouhuken.add("03岩手県");
            todouhuken.add("04宮城県");
            todouhuken.add("05秋田県");
            todouhuken.add("06山形県");
            todouhuken.add("07福島県");
            todouhuken.add("08茨城県");
            todouhuken.add("09栃木県");
            todouhuken.add("10群馬県");
            todouhuken.add("11埼玉県");
            todouhuken.add("12千葉県");
            todouhuken.add("13東京都");
            todouhuken.add("14神奈川県");
            todouhuken.add("15新潟県");
            todouhuken.add("16富山県");
            todouhuken.add("17石川県");
            todouhuken.add("18福島県");
            todouhuken.add("19山梨県");
            todouhuken.add("20長野県");
            todouhuken.add("21岐阜県");
            todouhuken.add("22静岡県");
            todouhuken.add("23愛知県");
            todouhuken.add("24三重県");
            todouhuken.add("25滋賀県");
            todouhuken.add("26京都府");
            todouhuken.add("27大阪府");
            todouhuken.add("28兵庫県");
            todouhuken.add("29奈良県");
            todouhuken.add("30和歌山県");
            todouhuken.add("31鳥取県");
            todouhuken.add("32島根県");
            todouhuken.add("33岡山県");
            todouhuken.add("34広島県");
            todouhuken.add("35山口県");
            todouhuken.add("36徳島県");
            todouhuken.add("37香川県");
            todouhuken.add("38愛媛県");
            todouhuken.add("39高知県");
            todouhuken.add("40福岡県");
            todouhuken.add("41佐賀県");
            todouhuken.add("42長崎県");
            todouhuken.add("43熊本県");
            todouhuken.add("44大分県");
            todouhuken.add("45宮崎県");
            todouhuken.add("46鹿児島県");
            todouhuken.add("47沖縄県");
            Collections.sort(todouhuken);
            return todouhuken;

        }
        return null;
    }
}
