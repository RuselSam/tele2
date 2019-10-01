public class Main {
    public static void main(String[] args) {
        Tariff firstTariff=new Tariff();
        firstTariff.idNumber=1;
        firstTariff.nameOptions("Мой онлайн");
        firstTariff.rateOptions(290);
        firstTariff.internetOptions(15);
        firstTariff.minutesOption(400);
        firstTariff.smsOptions(0);

        Tariff secondTariff=new Tariff();
        secondTariff.idNumber=4;
        secondTariff.nameOptions("Мой Tele2");
        int tariffForMyTele=7;
        System.out.println(tariffForMyTele+" руб/день");
        secondTariff.internetOptions(6);
        int minutesFromSecondTariff=10;
        if (minutesFromSecondTariff<2){
            minutesFromSecondTariff=+10;
        }
        System.out.println(minutesFromSecondTariff+" минут");
        secondTariff.smsOptions(0);
    }
}
