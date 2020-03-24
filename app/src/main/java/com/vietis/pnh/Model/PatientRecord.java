package com.vietis.pnh.Model;

public class PatientRecord {
    private int mRecordID;
    private int mRecordDate;
    private int mPatientID;
    private boolean mExamStatus;
    private int mExamDate;
    private boolean mExamDateStatus;
    private int mSymRecordID;
    private int mLabValueID;
    private String mNote;

    public PatientRecord(int mRecordID, int mRecordDate, int mPatientID, boolean mExamStatus, int mExamDate, boolean mExamDateStatus, int mSymRecordID, int mLabValueID, String mNote) {
        this.mRecordID = mRecordID;
        this.mRecordDate = mRecordDate;
        this.mPatientID = mPatientID;
        this.mExamStatus = mExamStatus;
        this.mExamDate = mExamDate;
        this.mExamDateStatus = mExamDateStatus;
        this.mSymRecordID = mSymRecordID;
        this.mLabValueID = mLabValueID;
        this.mNote = mNote;
    }

    public PatientRecord(int mRecordDate, int mPatientID, boolean mExamStatus, int mExamDate, boolean mExamDateStatus, int mSymRecordID, int mLabValueID, String mNote) {
        this.mRecordDate = mRecordDate;
        this.mPatientID = mPatientID;
        this.mExamStatus = mExamStatus;
        this.mExamDate = mExamDate;
        this.mExamDateStatus = mExamDateStatus;
        this.mSymRecordID = mSymRecordID;
        this.mLabValueID = mLabValueID;
        this.mNote = mNote;
    }

    public int getmRecordID() {
        return mRecordID;
    }

    public void setmRecordID(int mRecordID) {
        this.mRecordID = mRecordID;
    }

    public int getmRecordDate() {
        return mRecordDate;
    }

    public void setmRecordDate(int mRecordDate) {
        this.mRecordDate = mRecordDate;
    }

    public int getmPatientID() {
        return mPatientID;
    }

    public void setmPatientID(int mPatientID) {
        this.mPatientID = mPatientID;
    }

    public boolean ismExamStatus() {
        return mExamStatus;
    }

    public void setmExamStatus(boolean mExamStatus) {
        this.mExamStatus = mExamStatus;
    }

    public int getmExamDate() {
        return mExamDate;
    }

    public void setmExamDate(int mExamDate) {
        this.mExamDate = mExamDate;
    }

    public boolean ismExamDateStatus() {
        return mExamDateStatus;
    }

    public void setmExamDateStatus(boolean mExamDateStatus) {
        this.mExamDateStatus = mExamDateStatus;
    }

    public int getmSymRecordID() {
        return mSymRecordID;
    }

    public void setmSymRecordID(int mSymRecordID) {
        this.mSymRecordID = mSymRecordID;
    }

    public int getmLabValueID() {
        return mLabValueID;
    }

    public void setmLabValueID(int mLabValueID) {
        this.mLabValueID = mLabValueID;
    }

    public String getmNote() {
        return mNote;
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }
}
