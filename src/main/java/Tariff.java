public class Tariff {
    int idNumber;
    String nameOptions (String name){
        System.out.println(name);
    return name;
    }

    int rateOptions (int rate){
        System.out.println(rate+" руб/месяц");
    return 0;
    }
    int internetOptions (int internet){
        System.out.println(internet+" ГБ");
        return 0;
    }
    int minutesOption (int minutes){
        System.out.println(minutes+" минут");
        return 0;
    }
    int smsOptions (int sms){
        System.out.println(sms+" SMS");
        return 0;
    }

}
