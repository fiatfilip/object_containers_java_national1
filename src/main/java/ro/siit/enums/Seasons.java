package ro.siit.enums;

public class Seasons {
    static Season getSeasonFromMonth (Month month){
        Season season;
        switch (month){
            case JAN:
            case DEC:
            case FEB:
                // System.out.println(Season.Winter);
                season = Season.Winter;
                break;
            case MAR:
            case APR:
            case MAY:
                //System.out.println(Season.Spring);
                season = Season.Spring;
                break;
            case JUN:
            case JUL:
            case AUG:
                //System.out.println(Season.Summer);
                season = Season.Summer;
                break;
            default:
                //System.out.println(Season.Autumn);
                season = Season.Autumn;
        }
        return season;
    }
}
