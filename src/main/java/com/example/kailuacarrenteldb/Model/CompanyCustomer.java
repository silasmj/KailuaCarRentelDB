package com.example.kailuacarrenteldb.Model;

public class CompanyCustomer {
    private String companyName;
    private int CRN;
    private int companyPhone;

    public CompanyCustomer() {
    }

    public CompanyCustomer(String companyName, int CRN, int companyPhone) {
        this.companyName = companyName;
        this.CRN = CRN;
        this.companyPhone = companyPhone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public int getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(int companyPhone) {
        this.companyPhone = companyPhone;
    }
}
