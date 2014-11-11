/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Backend.BankAccount;
import Backend.UserAccount;

/**
 *
 * @author rbridges
 */
public class TableWrapper {
    private String[] accountNames;
    private String[] accountTypes;
    private double[] accountBalances;
    private int totalAccounts = 0;
    private UserAccount currentUA;
    private BankAccount currentBA;
    
    public TableWrapper(UserAccount curr)
    {
        currentUA = curr;
        totalAccounts = currentUA.getNumOfBankAccounts();
        accountNames = new String[currentUA.getNumOfBankAccounts()];
        accountTypes = new String[currentUA.getNumOfBankAccounts()];
        accountBalances = new double[currentUA.getNumOfBankAccounts()];
        this.getAccountInfo();
    }
    
    private void getAccountInfo()
    {
        if(currentUA.getBankAccHead() == null)
            return;
        else
        {
            currentBA = currentUA.getBankAccHead();
            // Traverse the BankAccount linked list until the account is found
            // or we reach the end of the list
            for(int zod = 0; zod < totalAccounts; zod++)
            {
                accountNames[zod] = currentBA.getAccountName();
                accountTypes[zod] = currentBA.getAccountType();
                accountBalances[zod] = currentBA.getBalance();
                currentBA = currentBA.getNext();
            }
        }
    }

    /////////////////////////////////////////
    // BELOW ARE JUST SETTERS AND GETTERS ///
    /////////////////////////////////////////
    public String getAccountName(int index) {
        return accountNames[index];
    }

    public String getAccountType(int index) {
        return accountTypes[index];
    }

    public double getAccountBalance(int index) {
        return accountBalances[index];
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }

    public UserAccount getCurrentUA() {
        return currentUA;
    }

    public BankAccount getCurrentBA() {
        return currentBA;
    }
    
    
}
