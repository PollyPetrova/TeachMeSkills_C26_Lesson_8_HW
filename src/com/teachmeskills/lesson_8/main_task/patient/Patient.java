package com.teachmeskills.lesson_8.main_task.patient;

import com.teachmeskills.lesson_8.main_task.doctor.BaseDoctor;

public class Patient {

    private int codOfTreatmentPlan;
    private BaseDoctor doctor;

    public Patient(int codOfTreatmentPlan) {
        this.codOfTreatmentPlan = codOfTreatmentPlan;
        this.doctor = doctor;
    }

    public int getCodOfTreatmentPlan() {
        return codOfTreatmentPlan;
    }

    public void setCodOfTreatmentPlan(int codOfTreatmentPlan) {
        this.codOfTreatmentPlan = codOfTreatmentPlan;
    }
}
