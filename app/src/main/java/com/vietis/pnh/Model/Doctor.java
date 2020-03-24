package com.vietis.pnh.Model;

public class Doctor {
    private int mDoctorID;
    private String mHospital;
    private String mDoctorName;
    private String mDoctorPhone;
    private String mMedicalName;
    private String mMedicalAddress;
    private String mMedicalPhone;

    public Doctor(int mDoctorID, String mHospital, String mDoctorName, String mDoctorPhone, String mMedicalName, String mMedicalAddress, String mMedicalPhone) {
        this.mDoctorID = mDoctorID;
        this.mHospital = mHospital;
        this.mDoctorName = mDoctorName;
        this.mDoctorPhone = mDoctorPhone;
        this.mMedicalName = mMedicalName;
        this.mMedicalAddress = mMedicalAddress;
        this.mMedicalPhone = mMedicalPhone;
    }

    public Doctor(String mHospital, String mDoctorName, String mDoctorPhone, String mMedicalName, String mMedicalAddress, String mMedicalPhone) {
        this.mHospital = mHospital;
        this.mDoctorName = mDoctorName;
        this.mDoctorPhone = mDoctorPhone;
        this.mMedicalName = mMedicalName;
        this.mMedicalAddress = mMedicalAddress;
        this.mMedicalPhone = mMedicalPhone;
    }

    public int getmDoctorID() {
        return mDoctorID;
    }

    public void setmDoctorID(int mDoctorID) {
        this.mDoctorID = mDoctorID;
    }

    public String getmHospital() {
        return mHospital;
    }

    public void setmHospital(String mHospital) {
        this.mHospital = mHospital;
    }

    public String getmDoctorName() {
        return mDoctorName;
    }

    public void setmDoctorName(String mDoctorName) {
        this.mDoctorName = mDoctorName;
    }

    public String getmDoctorPhone() {
        return mDoctorPhone;
    }

    public void setmDoctorPhone(String mDoctorPhone) {
        this.mDoctorPhone = mDoctorPhone;
    }

    public String getmMedicalName() {
        return mMedicalName;
    }

    public void setmMedicalName(String mMedicalName) {
        this.mMedicalName = mMedicalName;
    }

    public String getmMedicalAddress() {
        return mMedicalAddress;
    }

    public void setmMedicalAddress(String mMedicalAddress) {
        this.mMedicalAddress = mMedicalAddress;
    }

    public String getmMedicalPhone() {
        return mMedicalPhone;
    }

    public void setmMedicalPhone(String mMedicalPhone) {
        this.mMedicalPhone = mMedicalPhone;
    }
}
