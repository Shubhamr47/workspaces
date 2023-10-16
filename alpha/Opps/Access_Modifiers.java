package Opps;

import functionsAm.prime;

public class Access_Modifiers {
    public static void main(String[] args) {
        BankAccount myAcc= new BankAccount();
        myAcc.username = "ShubhamRajput";
        myAcc.setPassword = ("yoyohannisingh")  ;
    }
    class BankAccount{
        //public String setPassword;
        public String username;
        private String Password;
        public void setPassword(String pwd){
            Password = pwd;
        }
    }
}
