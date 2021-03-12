package hu.eszterhazy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bank bank = new PublicDigitalBank("Owner1", "Bank1");
        DigitalBank digitalBank = new PublicDigitalBank("Owner2", "Bank2");
        PublicDigitalBank publicDigitalBank = new PublicDigitalBank("Owner3", "Bank3");
        bank.authenticateAccount();
        digitalBank.addNewUser();
        publicDigitalBank.queryAccount("Kis József");
        System.out.println(bank.getName() + " " +digitalBank.getName()+ " "+ publicDigitalBank.getName());

    }
}
