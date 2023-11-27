package com.teachmeskills.lesson_8.main_task.doctor;

import com.teachmeskills.lesson_8.main_task.patient.Patient;

public class Therapist extends BaseDoctor {

    @Override
    public void Cure() {
        System.out.println("I'm a therapist. I'm prescribing you the following medications");
    }

    public static void assignedDoctor(Patient patient){
        if(patient.getCodOfTreatmentPlan()==1){
            BaseDoctor baseDoctor=new Surgeon();
            baseDoctor.Cure();
        } else if (patient.getCodOfTreatmentPlan()==2) {
            BaseDoctor baseDoctor=new Dentist();
            baseDoctor.Cure();
        }
        else {
            BaseDoctor baseDoctor=new Therapist();
            baseDoctor.Cure();
        }
    }

}
