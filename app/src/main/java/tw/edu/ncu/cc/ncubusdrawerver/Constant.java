package tw.edu.ncu.cc.ncubusdrawerver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by andre.hu on 2014/11/16.
 */
public class Constant {

    //Web Links
    public static final String[] urls = {
            "http://124.199.77.90/Taoyuan/PDA/businfo.aspx?Routeid=132&GO_OR_BACK=1&Line=1&lang=Cht",//132
            "http://124.199.77.90/Taoyuan/PDA/businfo.aspx?Routeid=132A&GO_OR_BACK=1&Line=1&lang=Cht",//132_A
            "http://124.199.77.90/Taoyuan/PDA/businfo.aspx?Routeid=133&GO_OR_BACK=1&Line=2&lang=Cht",//133
            "http://124.199.77.90/Taoyuan/PDA/businfo.aspx?Routeid=172&GO_OR_BACK=1&Line=all&lang=Cht",//172去程
            "http://124.199.77.90/Taoyuan/PDA/businfo.aspx?Routeid=172&GO_OR_BACK=2&Line=all&lang=Cht",//172返程
            "http://pda.5284.com.tw/MQS/businfo2.jsp?routename=9025%E4%B8%AD%E5%A3%A2%E2%86%92%E5%9C" +//9025去程
                    "%8B%E9%81%931%E8%99%9F%E2%86%92%E8%87%BA%E5%8C%97%E5%B8%82%E6%9D%BE%E5%B1%B1%E5%8D%80",
            "http://pda.5284.com.tw/MQS/businfo2.jsp?routename=9025%E8%87%BA%E5%8C%97%E5%B8%82%E6%9D" +//9025返程
                    "%BE%E5%B1%B1%E5%8D%80%E2%86%92%E5%9C%8B%E9%81%931%E8%99%9F%E2%86%92%E4%B8%AD%E5%A3%A2",
            "http://pda.5284.com.tw/MQS/businfo2.jsp?routename=9025%E4%B8%AD%E5%A3%A2%E2%86%92%E5%9C" +//9025去程繞駛中央
                    "%8B%E9%81%931%E8%99%9F%E2%86%92%E8%87%BA%E5%8C%97%E5%B8%82%E6%9D%BE%E5%B1%B1%E5%8D%80%5B%E7%B9%9E%E9%A7%9B%E4%B8%AD%E5%A4%AE%E5%A4%A7%E5%AD%B8%5D",
            "http://pda.5284.com.tw/MQS/businfo2.jsp?routename=9025%E8%87%BA%E5%8C%97%E5%B8%82%E6%9D" +//9025返程繞駛中央
                    "%BE%E5%B1%B1%E5%8D%80%E2%86%92%E5%9C%8B%E9%81%931%E8%99%9F%E2%86%92%E4%B8%AD%E5%A3%A2%5B%E7%B9%9E%E9%A7%9B%E4%B8%AD%E5%A4%AE%E5%A4%A7%E5%AD%B8%5D",
            "http://www.taiwanbus.tw/DyBus.aspx?Lang=&ID=8194#9025#1"//test
    };


    //Bus stop locations

    // latitudes
    public static final Double[] Latitudes_132 = {24.954290,24.955245,24.955089,24.955536,24.956159,24.956171,24.956737,24.957491,24.957195,24.957073,24.957321,24.958211,24.968297,24.968803,24.969863,24.968220,24.966707,24.967874};
    public static final Double[] Latitudes_132_A = {24.954290,24.955245,24.955089,24.955536,24.956159,24.956171,24.956737,24.957491,24.957195,24.957073,24.957321,24.958211,24.968297,24.968803,24.969863,24.968220,24.966707,24.967874,24.968156,24.971122,24.973490,24.976441,24.980667,24.983307,24.984401,24.999897,25.012790};
    public static final Double[] Latitudes_133 = {24.954290,24.953277, 24.955245, 24.955448,24.955089,24.955536,24.956159,24.956171,24.956737,24.957491,24.957195,24.957073,24.957321,24.958211,24.968297,24.968803,24.969863,24.968220,24.966707,24.967874,24.968156,};
    public static final Double[] Latitudes_172_GO = {24.954290, 24.953277, 24.955245, 24.955448, 24.955089, 24.955536, 24.956159, 24.956171, 24.956737, 24.957491, 24.957073, 24.957321, 24.959616, 24.962704, 24.968297, 24.968803, 24.969863, 24.968220, 24.966707, 24.967874, 24.968156, 24.971122, 24.973490, 24.976441, 24.980667, 24.983307, 24.984401, 24.992509, 24.999897, 25.012790};
    public static final Double[] Latitudes_172_BACK = {25.012790,24.999897,24.992509,24.984401,24.983307,24.980667,24.976441,24.973490,24.971122,24.968156,24.967874,24.966707,24.968220,24.969863,24.968803,24.968297,24.962704,24.959616,24.957321,24.957073,24.957491,24.956737,24.956171,24.956159,24.955536,24.955089,24.955448,24.955245,24.953277,24.954290};
    public static final Double[] Latitudes_9025_GO = {24.954290, 24.955536, 24.956159, 24.957073, 25.062640, 25.057622, 25.063270};
    public static final Double[] Latitudes_9025_BACK = {25.063270,25.057622,25.062640,24.957073,24.956159,24.955536,24.954290};
    public static final Double[] Latitudes_9025_GO_NCU = {24.954290, 24.955536, 24.956159, 24.957073, 24.968220, 24.968156, 25.062640, 25.057622, 25.063270 };
    public static final Double[] Latitudes_9025_BACK_NCU = {25.063270,25.057622,25.062640,24.968156,24.968220,24.957073,24.956159,24.955536,24.954290};

    //9025_GO bus stop longitudes
    public static final Double[] Longitudes_132 = {121.224074, 121.222024, 121.218941, 121.216393, 121.212946, 121.211129, 121.209474, 121.207376, 121.205781, 121.203629, 121.196377, 121.195256, 121.200389, 121.195513, 121.194150, 121.191082, 121.191613,121.195556};
    public static final Double[] Longitudes_132_A = {121.224074, 121.222024, 121.218941, 121.216393, 121.212946, 121.211129, 121.209474, 121.207376, 121.205781, 121.203629, 121.196377, 121.195256, 121.200389, 121.195513, 121.194150, 121.191082, 121.191613, 121.195556, 121.200336, 121.201240, 121.198756, 121.195976, 121.192537, 121.189496, 121.187720, 121.201410, 121.213947};
    public static final Double[] Longitudes_133 = {121.224074, 121.224094, 121.222024, 121.220092, 121.218941, 121.216393, 121.212946, 121.211129, 121.209474, 121.207376, 121.205781, 121.203629, 121.196377, 121.195256, 121.200389, 121.195513, 121.194150, 121.191082, 121.191613, 121.195556, 121.200336};
    public static final Double[] Longitudes_172_GO = {121.224074, 121.224094, 121.222024, 121.220092, 121.218941, 121.216393, 121.212946, 121.211129, 121.209474, 121.207376, 121.203629, 121.196377, 121.196792, 121.201362, 121.200389, 121.195513, 121.194150, 121.191082, 121.191613, 121.195556, 121.200336, 121.201240, 121.198756, 121.195976, 121.192537, 121.189496, 121.187720, 121.194651, 121.201410, 121.213947};
    public static final Double[] Longitudes_172_BACK = {121.213947, 121.201410, 121.194651, 121.187720, 121.189496,121.192537,121.195976,121.198756,121.201240,121.200336,121.195556,121.191613,121.191082,121.194150,121.195513,121.200389,121.201362,121.196792,121.196377,121.203629,121.207376,121.209474,121.211129,121.212946,121.216393,121.218941,121.220092,121.222024,121.224094,121.224074};
    public static final Double[] Longitudes_9025_GO = {121.224074, 121.216393, 121.212946, 121.203629, 121.533353, 121.542619, 121.551438};
    public static final Double[] Longitudes_9025_BACK = {121.551438,121.542619,121.533353,121.203629,121.212946,121.216393,121.224074};
    public static final Double[] Longitudes_9025_GO_NCU = {121.224074, 121.216393, 121.212946, 121.203629, 121.191082, 121.200336, 121.533353, 121.542619, 121.551438};
    public static final Double[] Longitudes_9025_BACK_NCU = {121.551438,121.542619,121.533353,121.200336,121.191082,121.203629,121.212946,121.216393,121.224074};


    //All bus stop latitudes
    public static final Double[][] latitudes = new Double[][]{Latitudes_132, Latitudes_132_A, Latitudes_133, Latitudes_172_GO,
            Latitudes_172_BACK, Latitudes_9025_GO, Latitudes_9025_BACK, Latitudes_9025_GO_NCU, Latitudes_9025_BACK_NCU};

    //ALL bus stop longitude
    public static final Double[][] longitudes = new Double[][]{Longitudes_132, Longitudes_132_A, Longitudes_133, Longitudes_172_GO,
            Longitudes_172_BACK, Longitudes_9025_GO, Longitudes_9025_BACK, Longitudes_9025_GO_NCU, Longitudes_9025_BACK_NCU};
}
