package whitesiro.tenkiyohou;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.IOException;

public class TenkiCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1){
            TenkiGet tenkiGet = new TenkiGet();

            if(args[0].equalsIgnoreCase("01北海道") || args[0].equalsIgnoreCase("北海道") || args[0].equalsIgnoreCase("hokkaidou")){
                String loc = "北海道";
                String url = "https://tenki.jp/forecast/1/2/1400/1100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("02青森県") || args[0].equalsIgnoreCase("青森県") || args[0].equalsIgnoreCase("aomori")){
                String loc = "青森県";
                String url = "https://tenki.jp/forecast/2/5/3110/2201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("03岩手県") || args[0].equalsIgnoreCase("岩手県") || args[0].equalsIgnoreCase("iwate")){
                String loc = "岩手県";
                String url = "https://tenki.jp/forecast/2/6/3310/3201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("04宮城県") || args[0].equalsIgnoreCase("宮城県") || args[0].equalsIgnoreCase("miyagi")){
                String loc = "宮城県";
                String url = "https://tenki.jp/forecast/2/7/3410/4100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("05秋田県") || args[0].equalsIgnoreCase("秋田県") || args[0].equalsIgnoreCase("akita")){
                String loc = "秋田県";
                String url = "https://tenki.jp/forecast/2/8/3210/5201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("06山形県") || args[0].equalsIgnoreCase("山形県") || args[0].equalsIgnoreCase("yamagata")){
                String loc = "山形県";
                String url = "https://tenki.jp/forecast/2/9/3510/6201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("07福島県") || args[0].equalsIgnoreCase("福島県") || args[0].equalsIgnoreCase("hukusima") || args[0].equalsIgnoreCase("hukushima")){
                String loc = "福島県";
                String url = "https://tenki.jp/forecast/2/10/3610/7201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("08茨城県") || args[0].equalsIgnoreCase("茨城県") || args[0].equalsIgnoreCase("ibaraki")){
                String loc = "茨城県";
                String url = "https://tenki.jp/forecast/3/11/4010/8201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("09栃木県")){
                String loc = "栃木県";
                String url = "https://tenki.jp/forecast/3/12/4110/9201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("10群馬県") || args[0].equalsIgnoreCase("群馬県") || args[0].equalsIgnoreCase("gunma") || args[0].equalsIgnoreCase("gunnma")){
                String loc = "群馬県";
                String url = "https://tenki.jp/forecast/3/13/4210/10201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("11埼玉県") || args[0].equalsIgnoreCase("埼玉県") || args[0].equalsIgnoreCase("saitama")){
                String loc = "埼玉県";
                String url = "https://tenki.jp/forecast/3/14/4310/11100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("12千葉県") || args[0].equalsIgnoreCase("千葉県") || args[0].equalsIgnoreCase("tiba")){
                String loc = "千葉県";
                String url = "https://tenki.jp/forecast/3/15/4510/12100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("13東京都") || args[0].equalsIgnoreCase("東京都") || args[0].equalsIgnoreCase("toukyou")){
                String loc = "東京都";
                String url = "https://tenki.jp/forecast/3/16/4410/13101/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("14神奈川県") || args[0].equalsIgnoreCase("神奈川県") || args[0].equalsIgnoreCase("kanagawa")){
                String loc = "神奈川県";
                String url = "https://tenki.jp/forecast/3/17/4610/14100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("15新潟県") || args[0].equalsIgnoreCase("新潟県") || args[0].equalsIgnoreCase("niigata")){
                String loc = "新潟県";
                String url = "https://tenki.jp/forecast/4/18/5410/15100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("16富山県") || args[0].equalsIgnoreCase("富山県") || args[0].equalsIgnoreCase("toyama")){
                String loc = "富山県";
                String url = "https://tenki.jp/forecast/4/19/5510/16201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("17石川県") || args[0].equalsIgnoreCase("石川県") || args[0].equalsIgnoreCase("isikawa") || args[0].equalsIgnoreCase("ishikawa")){
                String loc = "石川県";
                String url = "https://tenki.jp/forecast/4/20/5610/17201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("18福井県") || args[0].equalsIgnoreCase("福井県") || args[0].equalsIgnoreCase("hukui")){
                String loc = "福井県";
                String url = "https://tenki.jp/forecast/4/21/5710/18201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("19山梨県") || args[0].equalsIgnoreCase("山梨県") || args[0].equalsIgnoreCase("yamanasi") || args[0].equalsIgnoreCase("yamanashi")){
                String loc = "山梨県";
                String url = "https://tenki.jp/forecast/3/22/4910/19201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("20長野県") || args[0].equalsIgnoreCase("長野県") || args[0].equalsIgnoreCase("nagano")){
                String loc = "長野県";
                String url = "https://tenki.jp/forecast/3/23/4810/20201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("21岐阜県") || args[0].equalsIgnoreCase("岐阜県") || args[0].equalsIgnoreCase("gihu") || args[0].equalsIgnoreCase("gifu")){
                String loc = "岐阜県";
                String url = "https://tenki.jp/forecast/5/24/5210/21201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("22静岡県") || args[0].equalsIgnoreCase("静岡県") || args[0].equalsIgnoreCase("sizuoka") || args[0].equalsIgnoreCase("shizuoka")){
                String loc = "静岡県";
                String url = "https://tenki.jp/forecast/5/25/5010/22100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("23愛知県") || args[0].equalsIgnoreCase("愛知県") || args[0].equalsIgnoreCase("aiti")){
                String loc = "愛知県";
                String url = "https://tenki.jp/forecast/5/26/5110/23100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("24三重県") || args[0].equalsIgnoreCase("三重県") || args[0].equalsIgnoreCase("mie")){
                String loc = "三重県";
                String url = "https://tenki.jp/forecast/5/27/5310/24201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("25滋賀県") || args[0].equalsIgnoreCase("滋賀県") || args[0].equalsIgnoreCase("siga") || args[0].equalsIgnoreCase("shiga")){
                String loc = "滋賀県";
                String url = "https://tenki.jp/forecast/6/28/6010/25201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("26京都府") || args[0].equalsIgnoreCase("京都府") || args[0].equalsIgnoreCase("kyouto")){
                String loc = "京都府";
                String url = "https://tenki.jp/forecast/6/29/6110/26100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("27大阪府") || args[0].equalsIgnoreCase("大阪府") || args[0].equalsIgnoreCase("osaka") || args[0].equalsIgnoreCase("oosaka")){
                String loc = "大阪府";
                String url = "https://tenki.jp/forecast/6/30/6200/27100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("28兵庫県") || args[0].equalsIgnoreCase("兵庫県") || args[0].equalsIgnoreCase("hyougo")){
                String loc = "兵庫県";
                String url = "https://tenki.jp/forecast/6/31/6310/28100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("29奈良県") || args[0].equalsIgnoreCase("奈良県") || args[0].equalsIgnoreCase("nara")){
                String loc = "奈良県";
                String url = "https://tenki.jp/forecast/6/32/6410/29201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("30和歌山県") || args[0].equalsIgnoreCase("和歌山県") || args[0].equalsIgnoreCase("wakayama")){
                String loc = "和歌山県";
                String url = "https://tenki.jp/forecast/6/33/6510/30201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("31鳥取県") || args[0].equalsIgnoreCase("鳥取県") || args[0].equalsIgnoreCase("tottori")){
                String loc = "鳥取県";
                String url = "https://tenki.jp/forecast/7/34/6910/31201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("32島根県") || args[0].equalsIgnoreCase("島根県") || args[0].equalsIgnoreCase("simane") || args[0].equalsIgnoreCase("shimane")){
                String loc = "島根県";
                String url = "https://tenki.jp/forecast/7/35/6810/32201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("33岡山県") || args[0].equalsIgnoreCase("岡山県") || args[0].equalsIgnoreCase("okayama")){
                String loc = "岡山県";
                String url = "https://tenki.jp/forecast/7/36/6610/33100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("34広島県") || args[0].equalsIgnoreCase("広島県") || args[0].equalsIgnoreCase("hirosima") || args[0].equalsIgnoreCase("hiroshima")){
                String loc = "広島県";
                String url = "https://tenki.jp/forecast/7/37/6710/34100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("35山口県") || args[0].equalsIgnoreCase("山口県") || args[0].equalsIgnoreCase("yamaguti")){
                String loc = "山口県";
                String url = "https://tenki.jp/forecast/7/38/8120/35203/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("36徳島県") || args[0].equalsIgnoreCase("徳島県") || args[0].equalsIgnoreCase("tokusima") || args[0].equalsIgnoreCase("tokushima")){
                String loc = "徳島県";
                String url = "https://tenki.jp/forecast/8/39/7110/36201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("37香川県") || args[0].equalsIgnoreCase("香川県") || args[0].equalsIgnoreCase("kagawa")){
                String loc = "香川県";
                String url = "https://tenki.jp/forecast/8/40/7200/37201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("38愛媛県") || args[0].equalsIgnoreCase("愛媛県") || args[0].equalsIgnoreCase("ehime")){
                String loc = "愛媛県";
                String url = "https://tenki.jp/forecast/8/41/7310/38201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("39高知県") || args[0].equalsIgnoreCase("高知県") || args[0].equalsIgnoreCase("kouti")){
                String loc = "高知県";
                String url = "https://tenki.jp/forecast/8/42/7410/39201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("40福岡県") || args[0].equalsIgnoreCase("福岡県") || args[0].equalsIgnoreCase("hukuoka")){
                String loc = "福岡県";
                String url = "https://tenki.jp/forecast/9/43/8210/40130/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("41佐賀県") || args[0].equalsIgnoreCase("佐賀県") || args[0].equalsIgnoreCase("saga")){
                String loc = "佐賀県";
                String url = "https://tenki.jp/forecast/9/44/8510/41201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("42長崎県") || args[0].equalsIgnoreCase("長崎県") || args[0].equalsIgnoreCase("nagasaki")){
                String loc = "長崎県";
                String url = "https://tenki.jp/forecast/9/45/8410/42201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("43熊本県") || args[0].equalsIgnoreCase("熊本県") || args[0].equalsIgnoreCase("kumamoto")){
                String loc = "熊本県";
                String url = "https://tenki.jp/forecast/9/46/8610/43100/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("44大分県") || args[0].equalsIgnoreCase("大分県") || args[0].equalsIgnoreCase("oita") || args[0].equalsIgnoreCase("ooita")){
                String loc = "大分県";
                String url = "https://tenki.jp/forecast/9/47/8310/44201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("45宮崎県") || args[0].equalsIgnoreCase("宮崎県") || args[0].equalsIgnoreCase("miyazaki")){
                String loc = "宮崎県";
                String url = "https://tenki.jp/forecast/9/48/8710/45201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("46鹿児島県") || args[0].equalsIgnoreCase("鹿児島県") || args[0].equalsIgnoreCase("kagosima") || args[0].equalsIgnoreCase("kagoshima")){
                String loc = "鹿児島県";
                String url = "https://tenki.jp/forecast/9/49/8810/46201/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(args[0].equalsIgnoreCase("47沖縄県") || args[0].equalsIgnoreCase("沖縄県") || args[0].equalsIgnoreCase("okinawa")){
                String loc = "沖縄県";
                String url = "https://tenki.jp/forecast/10/50/9110/47211/";
                try {
                    tenkiGet.getTenki(url, loc, sender);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                sender.sendMessage(ChatColor.RED+"存在しない都道府県です。");

            }
        }else {
            sender.sendMessage(ChatColor.RED+"都道府県を入力してください。");
        }
        return true;
    }
}
