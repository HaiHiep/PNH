package com.vietis.pnh.Model;

public class Patient {
    private int mPatientID;
    private int mPatientCode;
    private int mQuestionID;
    private String mQuestionContent;
    private String mQuestionAnswer;
    private int mDoctorID;
    private int mVacciDate;

    public Patient(int mPatientID, int mPatientCode, int mQuestionID, String mQuestionContent, String mQuestionAnswer, int mDoctorID, int mVacciDate) {
        this.mPatientID = mPatientID;
        this.mPatientCode = mPatientCode;
        this.mQuestionID = mQuestionID;
        this.mQuestionContent = mQuestionContent;
        this.mQuestionAnswer = mQuestionAnswer;
        this.mDoctorID = mDoctorID;
        this.mVacciDate = mVacciDate;
    }

    public Patient(int mPatientCode, int mQuestionID, String mQuestionContent, String mQuestionAnswer, int mDoctorID, int mVacciDate) {
        this.mPatientCode = mPatientCode;
        this.mQuestionID = mQuestionID;
        this.mQuestionContent = mQuestionContent;
        this.mQuestionAnswer = mQuestionAnswer;
        this.mDoctorID = mDoctorID;
        this.mVacciDate = mVacciDate;
    }

    public int getmPatientID() {
        return mPatientID;
    }

    public void setmPatientID(int mPatientID) {
        this.mPatientID = mPatientID;
    }

    public int getmPatientCode() {
        return mPatientCode;
    }

    public void setmPatientCode(int mPatientCode) {
        this.mPatientCode = mPatientCode;
    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public String getmQuestionContent() {
        return mQuestionContent;
    }

    public void setmQuestionContent(String mQuestionContent) {
        this.mQuestionContent = mQuestionContent;
    }

    public String getmQuestionAnswer() {
        return mQuestionAnswer;
    }

    public void setmQuestionAnswer(String mQuestionAnswer) {
        this.mQuestionAnswer = mQuestionAnswer;
    }

    public int getmDoctorID() {
        return mDoctorID;
    }

    public void setmDoctorID(int mDoctorID) {
        this.mDoctorID = mDoctorID;
    }

    public int getmVacciDate() {
        return mVacciDate;
    }

    public void setmVacciDate(int mVacciDate) {
        this.mVacciDate = mVacciDate;
    }
}
