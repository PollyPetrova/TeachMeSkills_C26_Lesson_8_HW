package com.teachmeskills.lesson_8.main_task;

import com.teachmeskills.lesson_8.main_task.doctor.*;
import com.teachmeskills.lesson_8.main_task.patient.Patient;


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Enter cod of the treatment plan: ");
        Scanner scanner=new Scanner(System.in);
        int codOfTreatmentPlan = scanner.nextInt();

        Patient patient1=new Patient(codOfTreatmentPlan);
        Therapist.assignedDoctor(patient1);

    }

}
