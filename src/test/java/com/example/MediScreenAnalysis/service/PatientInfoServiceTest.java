package com.example.MediScreenAnalysis.service;

import com.example.MediScreenAnalysis.dto.PatientDto;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PatientInfoServiceTest {

    PatientInfoService patientInfoService;

    @Autowired
    public PatientInfoServiceTest(PatientInfoService patientInfoService) {
        this.patientInfoService = patientInfoService;
    }

    @Test
    void getPatientInfo() {
        PatientDto patientDto1 = patientInfoService.getPatientInfo(1);
        Assert.assertEquals("Lucas", patientDto1.getPatientName());
    }

}