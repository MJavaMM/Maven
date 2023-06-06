package Day01Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class MobileCard {
    public String cardNumber;
    public String userName;
    public String passWord;
    public ServicePackage serPackage;
    public double consumAmount;
    public double money;
    public int realTalkTime;
    public int realSMSCount;

    public MobileCard() {
    }

    public MobileCard(String cardNumber, String userName, String passWord, ServicePackage serPackage, double consumAmount, double money, int realTalkTime, int realSMSCount) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.serPackage = serPackage;
        this.consumAmount = consumAmount;
        this.money = money;
        this.realTalkTime = realTalkTime;
        this.realSMSCount = realSMSCount;
    }

    public MobileCard(String cardNumber, String userName, String passWord, double consumAmount, double money, int realTalkTime, int realSMSCount) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.consumAmount = consumAmount;
        this.money = money;
        this.realTalkTime = realTalkTime;
        this.realSMSCount = realSMSCount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getConsumAmount() {
        return consumAmount;
    }

    public void setConsumAmount(double consumAmount) {
        this.consumAmount = consumAmount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getRealTalkTime() {
        return realTalkTime;
    }

    public void setRealTalkTime(int realTalkTime) {
        this.realTalkTime = realTalkTime;
    }

    public int getRealSMSCount() {
        return realSMSCount;
    }

    public void setRealSMSCount(int realSMSCount) {
        this.realSMSCount = realSMSCount;
    }

    public ServicePackage getSerPackage() {
        return serPackage;
    }

    public void setSerPackage(ServicePackage serPackage) {
        this.serPackage = serPackage;
    }

    public void showMeg(){}


}
